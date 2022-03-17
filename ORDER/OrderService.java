package com.springrest.SpringRestApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrest.SpringRestApp.Repository.OrderRepo;
import com.springrest.SpringRestApp.model.Order;

@Service
public class OrderService {
	@Autowired
	OrderRepo orderRepo;
	public static List<Order> odrs=new ArrayList<>();
	void createOrder() {
		orderRepo.save(new Order(101,"Shoes",15000));
		orderRepo.save(new Order(102,"Socks",150));
		orderRepo.save(new Order(103,"Slippers",1500));
		orderRepo.save(new Order(104,"Shorts",1800));
	}
	//Getting order
	public List<Order> getAll(){
		createOrder();
		return orderRepo.findAll();
	}
	//Getting specific Order
	public Order getOrder(int id) {
		return orderRepo.findOne(id);
	}
	//Placing Order
	public void addOrder(Order o) {
		orderRepo.save(o);
	}
	//Updating Order
	public void updateOrder(Order odr,int id) {
		if(id==odr.getOrderId()) {
			orderRepo.save(odr);
		}
	}
	//Deleting an order
	public void deleteAllOrder() {
		orderRepo.deleteAll();
	}

}
