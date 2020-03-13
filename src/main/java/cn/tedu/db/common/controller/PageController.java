package cn.tedu.db.common.controller;

import cn.tedu.db.common.pojo.JsonResult;
import cn.tedu.db.common.pojo.PageObjectVO;
import cn.tedu.db.sys.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class PageController extends BaseController {

    @Autowired
    ISysLogService service;

    @RequestMapping("/findSysLog")
    public JsonResult<PageObjectVO> findSysLog(String username,Integer currentPage) {
        //调用业务层方法返回，获取日志数据
        PageObjectVO vo = service.findSysLog(username,currentPage);
        //返回日志数据
        JsonResult<PageObjectVO> jr = new JsonResult<> ();
        jr.setState(20);
        jr.setMessage("OK");
        jr.setData(vo);
        return jr;
    }

}