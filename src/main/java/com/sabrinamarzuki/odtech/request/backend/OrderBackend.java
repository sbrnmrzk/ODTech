package com.sabrinamarzuki.odtech.request.backend;

import com.sabrinamarzuki.odtech.model.Order.Order;
import com.sabrinamarzuki.odtech.model.User.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderBackend {
    String customerId;
    Order order;
}
