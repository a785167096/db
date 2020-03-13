package cn.tedu.db.sys.service.ex;

import cn.tedu.db.common.ex.ServiceException;

/**
 * 分页查询中，查询到的总记录为0时抛出的异常
 */
public class NoRecoredException extends ServiceException {

    private static final long serialVersionUID = -4457222391075443065L;

    public NoRecoredException() {
    }

    public NoRecoredException(String message) {
        super(message);
    }

    public NoRecoredException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoRecoredException(Throwable cause) {
        super(cause);
    }

    public NoRecoredException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}