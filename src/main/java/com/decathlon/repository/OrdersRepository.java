package com.decathlon.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.decathlon.entity.OrderEntity;

@Repository()
public interface OrdersRepository extends MongoRepository<OrderEntity, String> {

}
