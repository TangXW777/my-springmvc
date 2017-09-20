package com.tang.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tang.annotation.Controller;
import com.tang.annotation.Quatifier;
import com.tang.annotation.RequestMapping;
import com.tang.service.impl.MyService;
import com.tang.service.impl.SpringmvcService;

@Controller("tang")
public class SpringmvcController {
	@Quatifier("myService")
	MyService myService;
	
	@Quatifier("springService")
	SpringmvcService smService;
	
	@RequestMapping("insert")
    public String insert(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.insert(null);
        smService.insert(null);
        return null;
    }

    @RequestMapping("delete")
    public String delete(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.delete(null);
        smService.delete(null);
        return null;
    }

    @RequestMapping("update")
    public String update(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.update(null);
        smService.update(null);
        return null;
    }

    @RequestMapping("select")
    public String select(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.select(null);
        smService.select(null);
        return null;
    }
}
