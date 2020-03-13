package cn.tedu.db.common.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.db.common.ex.ServiceException;
import cn.tedu.db.common.pojo.JsonResult;
import cn.tedu.db.sys.service.ex.NoRecordException;
import cn.tedu.db.sys.service.ex.PageNumberException;

/**
 * 所有控制器的父类
 * 封装统一异常处理的逻辑
 */
public abstract class BaseController {
	
	public static final int STATE_SUCCESS=20; // 正常响应时的状态码
	public static final String MSG_SUCCESS="OK"; //正常响应时的消息
	
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public JsonResult<Void> handleException(Throwable e){
		JsonResult<Void> jr=new JsonResult<Void>();
		
		if(e instanceof PageNumberException) {
			jr.setState(4001);//代表页码异常
			jr.setMessage(e.getMessage());
		}else if(e instanceof NoRecordException) {
			jr.setState(4002);
			jr.setMessage(e.getMessage());
		}
		
		return jr;
	}

}
