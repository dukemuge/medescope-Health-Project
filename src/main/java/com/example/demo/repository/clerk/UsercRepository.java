package com.jackrutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jackrutorial.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}