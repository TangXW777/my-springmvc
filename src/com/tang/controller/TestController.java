package com.tang.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tang.annotation.Controller;
import com.tang.annotation.Quatifier;
import com.tang.annotation.RequestMapping;
import com.tang.service.impl.MyService;

@Controller("test")
public class TestController {
	@Quatifier("myService")
	private MyService myService;
	
	
	@RequestMapping("delete")
	public void delete(HttpServletRequest request, HttpServletResponse response, String param){
		myService.delete(null);
	}
}
