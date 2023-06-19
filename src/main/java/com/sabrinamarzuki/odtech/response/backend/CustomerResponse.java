package com.sabrinamarzuki.odtech.response.backend;

import com.sabrinamarzuki.odtech.model.User.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
    private MetaResponse meta;
    private Customer customer;
}
