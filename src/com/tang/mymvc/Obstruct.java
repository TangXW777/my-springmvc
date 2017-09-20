package com.tang.mymvc;

import javax.servlet.http.HttpServletRequest;


/**
 * 对拦截器进行封装
 * @author TangXW
 *
 */
public class Obstruct {
	
	private BaseInterceptor interceptor;
	private String[] mappingPath;
	private String interceptorMethod;
	private Integer index;
	
	public Obstruct(BaseInterceptor interceptor, String[] mappingPath,
			String interceptorMethod, Integer index) {
		super();
		this.interceptor = interceptor;
		this.mappingPath = mappingPath;
		this.interceptorMethod = interceptorMethod;
		this.index = index;
	}
	
	/**
	 * 路径匹配
	 * @param req
	 * @return
	 */
	public boolean pathMatch(HttpServletRequest req){
		
		boolean flag = false;
		String appPath = req.getContextPath();
		String url = req.getRequestURI().replaceFirst(appPath+"/", "").trim();
		String[] urlPiece = url.split("/");
		
		for(String s: mappingPath){
			if(s.contains("!:") && (s.replace("!:", "").trim().equals(url))){
				// do nothing
			}else{
				String[] strPiece = (s.replaceFirst("/", "")).split("/");
				if(strPiece[0].equals("**")){
					flag = true;
				}else if(urlPiece.length == strPiece.length){
					boolean f = true;
					for(int i = 0; i < urlPiece.length; i++){
						if(strPiece[i].equals("*") || strPiece[i].equals(urlPiece[i])){
							// do nothing
						}else{
							f = false;
						}
					}
					flag = f;
				}
			}
		}
		
		return flag;
	}

	public BaseInterceptor getInterceptor() {
		return interceptor;
	}

	public void setInterceptor(BaseInterceptor interceptor) {
		this.interceptor = interceptor;
	}

	public String[] getMappingPath() {
		return mappingPath;
	}

	public void setMappingPath(String[] mappingPath) {
		this.mappingPath = mappingPath;
	}

	public String getInterceptorMethod() {
		return interceptorMethod;
	}

	public void setInterceptorMethod(String interceptorMethod) {
		this.interceptorMethod = interceptorMethod;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}
	
	

}
