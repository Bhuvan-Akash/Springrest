package com.springrest.SpringRestApp.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springrest.SpringRestApp.model.Order;

public interface OrderRepo extends MongoRepository<Order, String> {
    
}
