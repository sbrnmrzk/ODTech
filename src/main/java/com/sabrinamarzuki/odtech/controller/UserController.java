package com.sabrinamarzuki.odtech.controller;

import com.sabrinamarzuki.odtech.response.BaseResponse;
import com.sabrinamarzuki.odtech.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<? extends BaseResponse> getUser(@RequestParam(name = "idType") String idType, @RequestParam(name = "idNumber") String idNumber){
        try{
            return ResponseEntity.ok(userService.getUserById(idType, idNumber));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(BaseResponse.builder().build());
        }
    }

}
