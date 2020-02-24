package com.capgemini.go.service;

import com.capgemini.go.dao.OrderAndCartDao;
import com.capgemini.go.dto.CartDTO;
import com.capgemini.go.dto.OrderDTO;
import com.capgemini.go.dto.OrderProductMapDTO;
import com.capgemini.go.dto.ProductUINMapDTO;

public class OrderAndCartServiceImpl implements OrderAndCartService {

	@Override
	public boolean OrderProductMapEntity(OrderProductMapDTO obj1) {
		return false;
	}

	@Override
	public boolean insertOrderProductMapEntity(OrderProductMapDTO obj2) {
		return false;
	}

	@Override
	public boolean registerOrder(OrderDTO obj3) {
		return false;
	}

	@Override
	public boolean removeItemFromCart(CartDTO obj4) {
		return false;
	}

	@Override
	public boolean updateItemQuantity(CartDTO obj) {
		return false;
	}

	@Override
	public boolean updateProductUinMap(ProductUINMapDTO obj) {
		return false;
	}

	@Override
	public boolean deleteOrderProductMapEntity(OrderProductMapDTO obj1) {
		return false;
	}

	@Override
	public boolean addItemToCart(CartDTO obj) {
		return false;
	}

	@Override
	public OrderAndCartDao getOrderAndCartDao(OrderAndCartDao obj) {
		return null;
	}

	@Override
	public void setOrderAndCartDao(OrderAndCartDao obj) {

	}

}
