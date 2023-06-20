package com.sabrinamarzuki.odtech.request;

import com.sabrinamarzuki.odtech.model.Order.Order;
import com.sabrinamarzuki.odtech.model.User.Customer;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {
    Customer customer;
    Order order;
}
