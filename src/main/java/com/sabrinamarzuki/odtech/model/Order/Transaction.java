package com.sabrinamarzuki.odtech.model.Order;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "transactions")
public class Transaction {
    @Id
    private int trxRefId;
    private String status;
    private String statusDesc;
    private String remarks;
    @CreatedDate
    private Date date;
    @LastModifiedDate
    private Date lastUpdated;
    private String userId;
    private Order order;
}
