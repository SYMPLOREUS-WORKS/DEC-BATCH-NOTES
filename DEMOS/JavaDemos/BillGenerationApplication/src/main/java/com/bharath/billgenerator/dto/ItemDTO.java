package com.bharath.billgenerator.dto;

import lombok.Data;

@Data
public class ItemDTO {
private Long itemId;
private String itemName;
private String category;
private Double price;
}
