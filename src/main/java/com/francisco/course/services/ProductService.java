package com.francisco.course.services;


import com.francisco.course.entities.Product;
import com.francisco.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repositoy;

    public List<Product> findAll(){
        return repositoy.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repositoy.findById(id);
        return obj.get();
    }

}
