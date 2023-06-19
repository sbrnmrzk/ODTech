package com.sabrinamarzuki.odtech.model.Order;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@Document(collection = "transactions")
public class Transaction {
    @Id
    private int trxRefId;
    private String status;
    private String statusDesc;
    private String remarks;
    private Date date;
    private Date lastUpdated;
    private String orderId;
    private String userId;
    private Order order;
}
