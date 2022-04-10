package top.janker.micro.common.core.lock;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author janker
 * @date 2022/4/10
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@AllArgsConstructor
public class ZLock implements AutoCloseable {
    @Getter
    private final Object lock;

    private final DistributedLock locker;

    @Override
    public void close() throws Exception {
        locker.unlock(lock);
    }
}
