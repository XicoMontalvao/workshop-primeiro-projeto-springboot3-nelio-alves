package com.francisco.course.services;


import com.francisco.course.entities.User;
import com.francisco.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repositoy;

    public List<User> findAll(){
        return repositoy.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repositoy.findById(id);
        return obj.get();
    }
    public User insert(User user){
        return repositoy.save(user);
    }

    public void delete(Long id){
        repositoy.deleteById(id);
    }
    public User update(Long id, User user){
        User entity = repositoy.getReferenceById(id);
        updateData(entity, user);
        return repositoy.save(entity);
    }
    private void updateData(User entity, User user){
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());
    }
}
