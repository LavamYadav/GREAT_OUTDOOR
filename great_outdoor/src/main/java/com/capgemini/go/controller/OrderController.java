package com.capgemini.go.controller;

import java.util.Scanner;

import com.capgemini.go.dao.OrderAndCartDao;
import com.capgemini.go.dao.OrderAndCartDaoImpl;
import com.capgemini.go.dto.CartDTO;

public class OrderController {
	Scanner sc = new Scanner(System.in);
	OrderAndCartDao ocs = new OrderAndCartDaoImpl();
	CartDTO obj = new CartDTO();

	public String additemtoCart() {
		System.out.println("Enter the quantity:--");
		obj.setQuantity(sc.nextInt());
		System.out.println("Enter productID:--");
		obj.setProductId(sc.next());
		System.out.println("Enter userID:--");
		obj.setUserId(sc.next());
		if (ocs.addItemToCart(obj)) {
			return "Item Added Successfully To The Cart";
		} else {
			return "Item NOT Added To The Cart";

		}

	}

	public static void main(String[] args)

	{
		OrderController object = new OrderController();
		int choice;
		Scanner input = new Scanner(System.in);
		System.out.println("MENU\n1 - Add item to cart");
		System.out.println("2 - Remove item from cart");
		System.out.println("3 - Change item quantity");
		System.out.println("4 - Output items' descriptions");
		System.out.println("5 - Output shopping cart");
		System.out.println("6 - Quit");
		System.out.println("\nChoose an option: ");
		choice = input.nextInt();

		switch (choice) {
		case 1:

			System.out.println(object.additemtoCart());
			break;

		case 2:
			System.out.println("Remove item from cart");
			break;
		default:
			break;
		}
		input.close();

	}
}
