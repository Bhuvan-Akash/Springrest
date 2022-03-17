package com.springrest.SpringRestApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.SpringRestApp.model.Order;
import com.springrest.SpringRestApp.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;
	//Get all order
	@GetMapping("/order")
	public List<Order> getAllOrders(){
		return orderService.getAll();
	}
	//place an order
	@PostMapping("/placeOrder")
	public void addOrder(@RequestBody Order order) {
		orderService.addOrder(order);
	}
	//Update an order
	@PutMapping("/order/{id}")
	public void updateOrder(@RequestBody Order o,@PathVariable int id) {
		orderService.updateOrder(o, id);
	}
	
	//Delete an order
	@DeleteMapping("/deleteOrder")
	public void deleteAllOrder() {
		orderService.deleteAllOrder();
	}

}
