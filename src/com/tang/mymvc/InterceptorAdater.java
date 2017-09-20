package com.tang.mymvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器适配器
 * @author TangXW
 *
 */
public class InterceptorAdater implements BaseInterceptor {

	public boolean beforeHandler(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return true;  // 默认允许
	}

	public void afterHandler(HttpServletRequest request,
			HttpServletResponse response, MyModelAndView modelAndView)
			throws Exception {
		// TODO Auto-generated method stub

	}

	public void afterViewLoad(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

	}

}
