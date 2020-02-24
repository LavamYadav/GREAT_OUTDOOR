package com.capgemini.go.dto;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PredefinedData {
	private static PredefinedData data;

	public PredefinedData() {
		super();
	}

	public static PredefinedData getInstance() {

		if (data == null) {
			data = new PredefinedData();
		}
		return data;
	}

	protected static final Map<String, CartDTO> CartDTO = new HashMap<>();
	protected static final Map<String, OrderDTO> OrderDTO = new HashMap<>();
	protected static final Map<String, OrderProductMapDTO> OrderProductMapDTO = new HashMap<>();
	protected static final Map<String, ProductUINMapDTO> ProductUINMapDTO = new HashMap<>();

	Date d = new Date();
	CartDTO c1 = new CartDTO("USR1", "PRODCT1", 10);
	CartDTO c2 = new CartDTO("USER2", "PRODCT2", 10);
	OrderDTO o1 = new OrderDTO("ORDE1", "USR1", "ADDR1", (byte) 0, d, d);
	OrderDTO o2 = new OrderDTO("ORDE2", "USR2", "ADDR2", (byte) 0, d, d);
	OrderProductMapDTO op1 = new OrderProductMapDTO("ORDE1", "PRDCT1", "PRDCTUIN1", 0, 0);
	OrderProductMapDTO op2 = new OrderProductMapDTO("ORDE2", "PRDCT2", "PRDCTUIN2", 0, 0);
	ProductUINMapDTO p1 = new ProductUINMapDTO("PRDCT1", "PRDCTUIN1", true);
	ProductUINMapDTO p2 = new ProductUINMapDTO("PRDCT2", "PRDCTUIN2", true);

	public Map<String, CartDTO> cartData() {
		CartDTO.put(c1.getUserId(), c1);
		CartDTO.put(c2.getUserId(), c2);
		return CartDTO;
	}

	public Map<String, OrderDTO> orderData() {
		OrderDTO.put(o1.getOrderId(), o1);
		OrderDTO.put(o2.getOrderId(), o2);
		return OrderDTO;
	}

	public Map<String, OrderProductMapDTO> orderProductData() {
		OrderProductMapDTO.put(op1.getOrderID(), op1);
		OrderProductMapDTO.put(op2.getOrderID(), op2);
		return OrderProductMapDTO;
	}

	public Map<String, ProductUINMapDTO> productUINMapDTO() {
		ProductUINMapDTO.put(p1.getProductID(), p1);
		ProductUINMapDTO.put(p2.getProductID(), p2);
		return ProductUINMapDTO;
	}

}
