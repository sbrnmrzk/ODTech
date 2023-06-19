package com.sabrinamarzuki.odtech.model.User;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDetails {
    private String salutation;
    private String name;
    private String gender;
    private String dateOfBirth;
    private String email;
    private String nationality;
    private String race;
    private Address[] address;
}
