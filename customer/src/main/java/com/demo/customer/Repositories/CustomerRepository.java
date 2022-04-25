package com.demo.customer.Repositories;

import com.demo.customer.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {



}
