package cn.tedu.db.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/")
	public String findStarterPage(){
		return "starter";
	}
	
	@RequestMapping("/sys/log_list")
	public String findSysLog() {
		return "sys/log_list"; // /pages/ sys/log_list .html
	}

}
