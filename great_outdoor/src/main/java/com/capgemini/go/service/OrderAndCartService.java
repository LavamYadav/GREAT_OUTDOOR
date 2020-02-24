package com.capgemini.go.service;

import com.capgemini.go.dao.OrderAndCartDao;
import com.capgemini.go.dto.OrderProductMapDTO;

public interface OrderAndCartService extends OrderAndCartDao {
	
	public boolean deleteOrderProductMapEntity(OrderProductMapDTO obj1);
	public OrderAndCartDao getOrderAndCartDao(OrderAndCartDao obj);
	
	public void setOrderAndCartDao(OrderAndCartDao obj);
	

}
