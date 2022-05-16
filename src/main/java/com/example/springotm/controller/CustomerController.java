package com.example.springotm.controller;

import com.example.springotm.entity.Customer;
import com.example.springotm.repo.CustomerRepo;
import com.example.springotm.repo.ProductRepo;
import com.example.springotm.service.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public  class CustomerController {
@Autowired
private  CustomerRepo customerRepo;
@Autowired
private ProductRepo productRepo;

@PostMapping("/placeOrder")
public Customer placeOrder(@RequestBody OrderRequest request) {
    return this.customerRepo.save(request.getCustomer());
}
@GetMapping("/placeOrder")
public List<Customer> findAllOrder(){
    return this.customerRepo.findAll();
}

}
