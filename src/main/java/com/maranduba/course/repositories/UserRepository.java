package com.maranduba.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maranduba.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
