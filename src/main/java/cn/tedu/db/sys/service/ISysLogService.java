package cn.tedu.db.sys.service;

import cn.tedu.db.common.pojo.PageObjectVO;
import cn.tedu.db.sys.pojo.SysLogDO;
import cn.tedu.db.sys.service.ex.NoRecordException;
import cn.tedu.db.sys.service.ex.PageNumberException;

public interface ISysLogService {
	
	/**
	 * 基于条件分页查询日志信息
	 * @param username 用户名
	 * @param currentPage 当前页码
	 * @return 该页日志信息
	 * @throws PageNumberException
	 * @throws NoRecordException
	 */
	PageObjectVO<SysLogDO> findSysLog(String username,
								Integer currentPage) 
								throws PageNumberException, 
								NoRecordException;

}
