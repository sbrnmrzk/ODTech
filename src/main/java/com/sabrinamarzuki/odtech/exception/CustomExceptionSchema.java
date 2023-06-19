package com.sabrinamarzuki.odtech.exception;

import com.sabrinamarzuki.odtech.response.backend.MetaResponse;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CustomExceptionSchema {
    private MetaResponse meta;
    private String message;
    private String details;
    private String hint;
}
