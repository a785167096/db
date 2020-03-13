package cn.tedu.db.common.controller;

import cn.tedu.db.common.pojo.JsonResult;
import cn.tedu.db.sys.service.ex.NoRecoredException;
import cn.tedu.db.sys.service.ex.PageNumberException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;

/**
 * 所有控制器的父类
 * 封装统一的异常处理的逻辑
 */
public abstract class BaseController {
    @ExceptionHandler(ServletException.class)
    @ResponseBody//自动转换格式

    public JsonResult<Void> handleException(Throwable e) {
        JsonResult<Void> jr = new JsonResult<>();

        if (e instanceof PageNumberException) {
            jr.setState(4001);//代表页码异常
            jr.setMessage(e.getMessage());

        } else if (e instanceof NoRecoredException) {
            jr.setState(4002);//代表页码异常
            jr.setMessage(e.getMessage());

        }
        return jr;
    }

}