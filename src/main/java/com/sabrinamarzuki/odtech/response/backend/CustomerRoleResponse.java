package com.sabrinamarzuki.odtech.response.backend;

import com.sabrinamarzuki.odtech.model.User.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRoleResponse {
    private MetaResponse meta;
    private Role[] roles;
}
