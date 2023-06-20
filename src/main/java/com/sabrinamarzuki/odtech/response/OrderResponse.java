package com.sabrinamarzuki.odtech.response;

import com.sabrinamarzuki.odtech.model.Order.Transaction;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class OrderResponse extends BaseResponse{
    Transaction transaction;
}
