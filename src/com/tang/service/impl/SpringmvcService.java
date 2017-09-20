package com.tang.service.impl;

import java.util.Map;

public interface SpringmvcService {
	int insert(Map map);

    int delete(Map map);

    int update(Map map);

    int select(Map map);
}
