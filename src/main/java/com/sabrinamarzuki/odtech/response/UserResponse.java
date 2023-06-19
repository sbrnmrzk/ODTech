package com.sabrinamarzuki.odtech.response;

import com.sabrinamarzuki.odtech.model.User.Contact;
import com.sabrinamarzuki.odtech.model.User.CustomerDetails;
import com.sabrinamarzuki.odtech.model.User.Identification;
import com.sabrinamarzuki.odtech.model.User.Role;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class UserResponse extends BaseResponse {
    private String id;
    private Identification identification;
    private CustomerDetails details;
    private Contact[] contact;
    private Role[] roles;
}
