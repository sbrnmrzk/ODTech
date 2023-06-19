package com.sabrinamarzuki.odtech.model.Order;

import lombok.*;


@Data
@With
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    private String code;
    private int quantity;
}
