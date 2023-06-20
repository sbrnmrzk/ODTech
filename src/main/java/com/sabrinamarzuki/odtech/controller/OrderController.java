package com.sabrinamarzuki.odtech.controller;


import com.sabrinamarzuki.odtech.request.OrderRequest;
import com.sabrinamarzuki.odtech.response.BaseResponse;
import com.sabrinamarzuki.odtech.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping
    public ResponseEntity<? extends BaseResponse> createOrder(@RequestBody OrderRequest orderRequest){
        try{
            return ResponseEntity.ok(orderService.createOrder(orderRequest));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(BaseResponse.builder().build());
        }
    }
}
