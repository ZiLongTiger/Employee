package com.zy.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminController")
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping("login.do")
	public String goPage() {
		return "admin/login";
	}
}
