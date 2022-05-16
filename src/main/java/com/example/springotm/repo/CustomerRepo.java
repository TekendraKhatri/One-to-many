package com.example.springotm.repo;

import com.example.springotm.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer , Integer> {
}
