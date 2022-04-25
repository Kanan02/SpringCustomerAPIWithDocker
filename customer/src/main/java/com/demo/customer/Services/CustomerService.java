package com.demo.customer.Services;

import com.demo.customer.Models.Customer;
import com.demo.customer.Repositories.CustomerRepository;
import com.demo.customer.Requests.CustomerRegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(
CustomerRepository customerRepository
) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer=Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        // TODO: check if email valid
        // TODO: check if email not taken

        // TODO: store customer in db
        customerRepository.save(customer);
    }
}
