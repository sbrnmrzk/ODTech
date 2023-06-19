package com.sabrinamarzuki.odtech.exception;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ODTechException extends RuntimeException {

    private String message;
    private String details;
    private String hint;
}
