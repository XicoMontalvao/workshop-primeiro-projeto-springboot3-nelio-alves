package com.francisco.course.services;


import com.francisco.course.entities.Order;
import com.francisco.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repositoy;

    public List<Order> findAll(){
        return repositoy.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repositoy.findById(id);
        return obj.get();
    }

}
