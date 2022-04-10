package top.janker.micro.common.core.exception;

/**
 * @author janker
 * @date 2022/4/10
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class LockException extends RuntimeException {
    private static final long serialVersionUID = 3876425341511252911L;
    public LockException(String message) {
        super(message);
    }

}
