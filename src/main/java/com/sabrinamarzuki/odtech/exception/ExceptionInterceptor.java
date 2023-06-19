package com.sabrinamarzuki.odtech.exception;

import com.sabrinamarzuki.odtech.response.backend.MetaResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionInterceptor extends ResponseEntityExceptionHandler {

    /**
     * Handler for when data is not found
     * @param ex
     * @return ResponseEntity
     */
    @ExceptionHandler(ODTechException.class)
    public final ResponseEntity<Object> handleDataNOtFoundException(ODTechException ex) {
        CustomExceptionSchema schema = CustomExceptionSchema.builder()
                .meta(new MetaResponse(400, 0))
                .message(ex.getMessage())
                .details(ex.getDetails())
                .hint(ex.getHint())
                .build();
        return new ResponseEntity<>(schema, HttpStatus.NOT_FOUND);
    }
}
