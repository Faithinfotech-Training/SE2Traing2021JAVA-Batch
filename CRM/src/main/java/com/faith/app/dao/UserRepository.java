package com.faith.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.faith.app.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
