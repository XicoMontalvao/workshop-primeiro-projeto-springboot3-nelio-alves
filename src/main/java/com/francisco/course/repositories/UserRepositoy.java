package com.francisco.course.repositories;

import com.francisco.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoy extends JpaRepository<User, Long> {

}
