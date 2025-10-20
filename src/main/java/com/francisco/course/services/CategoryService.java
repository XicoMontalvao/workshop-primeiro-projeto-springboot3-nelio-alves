package com.francisco.course.services;


import com.francisco.course.entities.Category;
import com.francisco.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repositoy;

    public List<Category> findAll(){
        return repositoy.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repositoy.findById(id);
        return obj.get();
    }

}
