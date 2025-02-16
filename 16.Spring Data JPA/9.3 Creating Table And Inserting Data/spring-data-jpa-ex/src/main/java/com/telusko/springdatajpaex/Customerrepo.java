package com.telusko.springdatajpaex;

import com.telusko.springdatajpaex.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Customerrepo extends JpaRepository<Customer, Integer> {
    List<Customer> findByName(String name);
}
