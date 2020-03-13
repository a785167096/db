package cn.tedu.db.service;

import cn.tedu.db.common.pojo.PageObjectVO;
import cn.tedu.db.sys.pojo.SysLogDO;
import cn.tedu.db.sys.service.ISysLogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysLogServiceTest {
    @Autowired
    ISysLogService service;
    @Test
    public void findSysLog() {
        PageObjectVO<SysLogDO> vo =service.findSysLog("admin",1);
        System.err.println(vo);

    }





}