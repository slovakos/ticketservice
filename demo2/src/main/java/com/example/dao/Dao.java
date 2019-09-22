package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.Customer;

public interface Dao extends JpaRepository<Customer, Long> {

}
