package com.sabrinamarzuki.odtech.model.User;

import com.sabrinamarzuki.odtech.response.BaseResponse;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact{
    private String id;

    private String type;
    private String value;
}
