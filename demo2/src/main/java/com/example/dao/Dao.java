package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.UserAccount;

public interface Dao extends JpaRepository<UserAccount, Long> {

}
