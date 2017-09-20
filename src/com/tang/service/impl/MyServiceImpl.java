package com.tang.service.impl;

import java.util.Map;

import com.tang.annotation.Service;

@Service("myService")
public class MyServiceImpl implements MyService{
	

    public int insert(Map map) {
        System.out.println("MyServiceImpl:" + "insert");
        return 0;
    }

 
    public int delete(Map map) {
        System.out.println("MyServiceImpl:" + "delete");
        return 0;
    }

  
    public int update(Map map) {
        System.out.println("MyServiceImpl:" + "update");
        return 0;
    }

    
    public int select(Map map) {
        System.out.println("MyServiceImpl:" + "select");
        return 0;
    }
}
