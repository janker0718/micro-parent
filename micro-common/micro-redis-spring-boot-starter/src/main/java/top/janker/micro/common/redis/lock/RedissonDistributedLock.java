package top.janker.micro.common.redis.lock;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import top.janker.micro.common.core.constant.CommonConstant;
import top.janker.micro.common.core.exception.LockException;
import top.janker.micro.common.core.lock.DistributedLock;
import top.janker.micro.common.core.lock.ZLock;

import java.util.concurrent.TimeUnit;

/**
 * @author janker
 * @date 2022/4/10
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@ConditionalOnClass(RedissonClient.class)
@ConditionalOnProperty(prefix = "micro.lock", name = "lockerType", havingValue = "REDIS", matchIfMissing = true)
public class RedissonDistributedLock implements DistributedLock {
    @Autowired
    private RedissonClient redisson;

    private ZLock getLock(String key, boolean isFair) {
        RLock lock;
        if (isFair) {
            lock = redisson.getFairLock(CommonConstant.LOCK_KEY_PREFIX + ":" + key);
        } else {
            lock =  redisson.getLock(CommonConstant.LOCK_KEY_PREFIX + ":" + key);
        }
        return new ZLock(lock, this);
    }

    @Override
    public ZLock lock(String key, long leaseTime, TimeUnit unit, boolean isFair) {
        ZLock zLock = getLock(key, isFair);
        RLock lock = (RLock)zLock.getLock();
        lock.lock(leaseTime, unit);
        return zLock;
    }

    @Override
    public ZLock tryLock(String key, long waitTime, long leaseTime, TimeUnit unit, boolean isFair) throws InterruptedException {
        ZLock zLock = getLock(key, isFair);
        RLock lock = (RLock)zLock.getLock();
        if (lock.tryLock(waitTime, leaseTime, unit)) {
            return zLock;
        }
        return null;
    }

    @Override
    public void unlock(Object lock) {
        if (lock != null) {
            if (lock instanceof RLock) {
                RLock rLock = (RLock)lock;
                if (rLock.isLocked()) {
                    rLock.unlock();
                }
            } else {
                throw new LockException("requires RLock type");
            }
        }
    }
}