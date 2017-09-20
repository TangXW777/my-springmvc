package com.tang.mymvc;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.sun.org.apache.commons.logging.Log;
import com.sun.org.apache.commons.logging.LogFactory;



public class MyDispatcherServlet extends HttpServlet{
	Properties p = null;
	String viewPath = null;
	
	@Override
	public void init() throws ServletException {
		System.out.println();
		System.out.println("=====================MyDispatcherServlet init=====================");  
		  
		System.out.println("============================加载配置文件:===========================");  
        loadConfigFile();  
  
        System.out.println("=============================初始化参数============================");  
        initParameter();  
  
        System.out.println("=============================加载控制器============================");  
        loadController();  
  
        System.out.println("========================预映射URL和requestMap======================");  
        mapMethod();  
  
        System.out.println("=============================加载拦截器============================");  
        loadInterceptor();  
  
        System.out.println("=============================初始化完毕============================");  
	}

	private void loadConfigFile() {
		String mvcConfigLocation = getInitParameter("mvcConfigLocation");
		System.out.println(mvcConfigLocation);
		InputStream inputStream = this.getServletContext().getResourceAsStream(mvcConfigLocation);
		
		p = new Properties();
		
		try{
			p.load(inputStream);
		}catch (IOException e){
			e.printStackTrace();
		}
	
		
	}

	private void initParameter() {
		viewPath = p.getProperty("myview.path");
		System.out.println("映射view目录：" + viewPath);
		
	}

	private void loadController() {
		 String controllerPath = p.getProperty("controller.annotated.path");  
	        String filePath = "";  
	        String classPath = this.getClass().getClassLoader().getResource("")  
	                .getPath();  
	  
	        filePath = classPath + controllerPath;  
	        List<String> allClassName = new ArrayList<String>();  
	  
	        MyUtil.getAllClassName(classPath, filePath, allClassName);  
	  
	        for (String s : allClassName) {  
	            try {  
	  
	                Class<?> c = Class.forName(s);  
	                if (c.isAnnotationPresent((Class<? extends Annotation>) MyController.class)) {  
	                  //  cs.add(c);  
	                  //  logger.info("加载controller:" + c.getName());  
	                }  
	            } catch (ClassNotFoundException e) {  
	                e.printStackTrace();  
	            }  
	        }  
		
	}



	private void mapMethod() {
		// TODO Auto-generated method stub
		
	}

	private void loadInterceptor() {
		// TODO Auto-generated method stub
		
	}

	

	
	

}
