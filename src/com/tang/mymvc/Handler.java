package com.tang.mymvc;

import java.lang.reflect.Method;


/**
 * 对requestMapping 方法的封装
 * @author TangXW
 *
 */
public class Handler {

	private Object controller;
	private Method mappingMethod;
	private String requestMethod;
	
	public Handler(Object controller, Method mappingMethod, String requestMethod) {
		super();
		this.controller = controller;
		this.mappingMethod = mappingMethod;
		this.requestMethod = requestMethod;
	}
	
	
	private void init() {
		// TODO Auto-generated method stub

	}
	
}
