package com.sabrinamarzuki.odtech.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private int id;

    private boolean primaryAddress;
    private String line1;
    private String line2;
    private String line3;
    private String postalCode;
    private String city;
    private String state;
    private String country;
}
