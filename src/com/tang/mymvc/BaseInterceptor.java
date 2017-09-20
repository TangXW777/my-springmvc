package com.tang.mymvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器
 * @author TangXW
 *
 */
public interface BaseInterceptor {
	
	/**
	 * 用于获取handler
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	boolean beforeHandler(HttpServletRequest request, HttpServletResponse response)
		throws Exception;
	
	
	/**
	 * handler执行后执行，先于view加载
	 * @param request
	 * @param response
	 * @param modelAndView
	 * @throws Exception
	 */
	void afterHandler(HttpServletRequest request, HttpServletResponse response, 
			MyModelAndView modelAndView) throws Exception;
	
	/**
	 * view加载后执行
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	void afterViewLoad(HttpServletRequest request, HttpServletResponse response)
		throws Exception;
}
