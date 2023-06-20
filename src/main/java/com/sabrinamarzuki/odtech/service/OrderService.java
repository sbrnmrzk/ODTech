package com.sabrinamarzuki.odtech.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sabrinamarzuki.odtech.model.Order.Order;
import com.sabrinamarzuki.odtech.model.Order.Transaction;
import com.sabrinamarzuki.odtech.model.User.Customer;
import com.sabrinamarzuki.odtech.model.User.CustomerDetails;
import com.sabrinamarzuki.odtech.repository.TransactionsRepository;
import com.sabrinamarzuki.odtech.request.OrderRequest;
import com.sabrinamarzuki.odtech.request.backend.OrderBackend;
import com.sabrinamarzuki.odtech.response.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    TransactionsRepository transactionsRepository;
    public OrderResponse createOrder(OrderRequest orderRequest) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl = "https://avocado.od-tech.my/api/order";
        ObjectMapper obj = new ObjectMapper();

        // send to database
        transactionsRepository.deleteAll();
        Transaction transaction = new Transaction();
        transaction.setOrder(orderRequest.getOrder());
        transaction.setUserId(orderRequest.getCustomer().getId());
        transaction.setStatus("Submitted");
        transactionsRepository.insert(transaction);


        // Fetch response as List wrapped in ResponseEntity
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        OrderBackend orderBackend = new OrderBackend(orderRequest.getCustomer().getId(), orderRequest.getOrder());
        HttpEntity<String> entity = new HttpEntity<String >(obj.writeValueAsString(orderBackend), headers);


        ResponseEntity<OrderResponse> response = restTemplate.postForEntity(resourceUrl, entity, OrderResponse.class);
        OrderResponse orderResponse = response.getBody();
        return orderResponse;
    }
}
