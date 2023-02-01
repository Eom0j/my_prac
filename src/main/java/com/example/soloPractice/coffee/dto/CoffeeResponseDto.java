package com.example.soloPractice.coffee.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CoffeeResponseDto {
    private long CoffeeId;
    private String korName;
    private String engName;
    private int price;
}
