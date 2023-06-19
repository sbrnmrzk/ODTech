package com.sabrinamarzuki.odtech.model.User;

import com.sabrinamarzuki.odtech.model.User.Contact;
import com.sabrinamarzuki.odtech.model.User.CustomerDetails;
import com.sabrinamarzuki.odtech.model.User.Identification;
import com.sabrinamarzuki.odtech.model.User.Role;
import lombok.*;

@Data
@With
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
    private String id;
    private Identification identification;
    private CustomerDetails details;
    private Contact[] contact;
    private Role[] roles;
}
