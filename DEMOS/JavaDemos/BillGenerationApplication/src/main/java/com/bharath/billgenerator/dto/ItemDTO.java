package com.bharath.billgenerator.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ItemDTO {
private Long itemId;
private String itemName;
private String category;
private Double price;
private MultipartFile[] file;
}
