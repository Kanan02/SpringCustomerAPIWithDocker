package com.demo.customer.Requests;


public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email

) {
}
