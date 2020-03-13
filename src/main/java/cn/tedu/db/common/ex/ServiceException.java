package cn.tedu.db.common.ex;

/**
 * 业务层异常的父类
 */
public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = -2786279910045743094L;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}