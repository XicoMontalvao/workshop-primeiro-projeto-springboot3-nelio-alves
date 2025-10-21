package com.francisco.course.services;


import com.francisco.course.entities.User;
import com.francisco.course.repositories.UserRepository;
import com.francisco.course.services.exceptions.DataBaseException;
import com.francisco.course.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
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
        return obj.orElseThrow(()->new ResourceNotFoundException(id));
    }
    public User insert(User user){
        return repositoy.save(user);
    }

    public void delete(Long id){
        try {
            repositoy.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        }catch (DataIntegrityViolationException e){
            throw new DataBaseException(e.getMessage());
        }
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
