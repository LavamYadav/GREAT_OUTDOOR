package com.capgemini.go.dao;

import com.capgemini.go.dto.CartDTO;
import com.capgemini.go.dto.OrderDTO;
import com.capgemini.go.dto.OrderProductMapDTO;
import com.capgemini.go.dto.ProductUINMapDTO;

public interface OrderAndCartDao {
	public boolean addItemToCart(CartDTO obj);
	public boolean OrderProductMapEntity(OrderProductMapDTO obj1);

	public boolean insertOrderProductMapEntity(OrderProductMapDTO obj2);
	public boolean registerOrder(OrderDTO obj3);
	public boolean removeItemFromCart(CartDTO obj4);

	public boolean updateItemQuantity(CartDTO obj);
	public boolean updateProductUinMap(ProductUINMapDTO obj);


}
