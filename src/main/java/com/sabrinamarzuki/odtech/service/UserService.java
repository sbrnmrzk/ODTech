package com.sabrinamarzuki.odtech.service;

import com.sabrinamarzuki.odtech.model.User.CustomerDetails;
import com.sabrinamarzuki.odtech.repository.UserRepository;
import com.sabrinamarzuki.odtech.response.UserResponse;
import com.sabrinamarzuki.odtech.response.backend.CustomerResponse;
import com.sabrinamarzuki.odtech.response.backend.CustomerRoleResponse;
import com.sabrinamarzuki.odtech.response.backend.MetaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserResponse getUserById(String idType, String idNumber) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl = "https://avocado.od-tech.my/api";


        // Fetch response as List wrapped in ResponseEntity
        ResponseEntity<CustomerResponse> custResponse
                = restTemplate.getForEntity(resourceUrl + "/customer?idType=" + idType + "&idNumber=" + idNumber, CustomerResponse.class);

        CustomerResponse customerResponse = custResponse.getBody();
        CustomerDetails customerDetails = customerResponse.getCustomer().getDetails();


        // Fetch response as List wrapped in ResponseEntity
        ResponseEntity<CustomerRoleResponse> response
                = restTemplate.getForEntity(resourceUrl + "/customerRole?customerId=" + customerResponse.getCustomer().getId(), CustomerRoleResponse.class);

        CustomerRoleResponse customerRoleResponse = response.getBody();
        UserResponse userResponse = UserResponse.builder()
                .meta(customerResponse.getMeta())
                .contact(customerResponse.getCustomer().getContact())
                .details(customerResponse.getCustomer().getDetails())
                .id(customerResponse.getCustomer().getId())
                .identification(customerResponse.getCustomer().getIdentification())
                .roles(customerRoleResponse.getRoles())
                .build();


        return userResponse;
    }
}
