package com.capgemini.go.dao;

import java.util.Map.Entry;
import java.util.Scanner;

import com.capgemini.go.dto.CartDTO;
import com.capgemini.go.dto.OrderDTO;
import com.capgemini.go.dto.OrderProductMapDTO;
import com.capgemini.go.dto.PredefinedData;
import com.capgemini.go.dto.ProductUINMapDTO;

public class OrderAndCartDaoImpl implements OrderAndCartDao {
	Scanner sc = new Scanner(System.in);
	PredefinedData pd = new PredefinedData();

	@Override
	public boolean addItemToCart(CartDTO obj) {
		int i = 0;
		for (Entry<String, CartDTO> e : pd.cartData().entrySet()) {
			if (obj.getProductId().equals(e.getValue().getProductId())) {
				pd.cartData().put(obj.getProductId(), obj);
				i = 1;
			}

		}
		if (i == 1)
			return true;
		else
			return false;
	}

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

		return true;
	}

	@Override
	public boolean updateItemQuantity(CartDTO obj5) {

		return false;
	}

	@Override
	public boolean updateProductUinMap(ProductUINMapDTO obj6) {

		return false;
	}

}
