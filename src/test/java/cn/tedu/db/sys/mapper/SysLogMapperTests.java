package cn.tedu.db.sys.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.db.sys.pojo.SysLogDO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysLogMapperTests {

	@Autowired
	SysLogMapper mapper;
	
	@Test
	public void getRowCount() {
		int count=mapper.getRowCount("tom");
		System.err.println("count="+count);
	}
	
	@Test
	public void listSysLog() {
		List<SysLogDO> list=mapper.listSysLog(null, 0, 10);
		for(SysLogDO item:list) {
			System.err.println(item);
		}
	}
	
}
