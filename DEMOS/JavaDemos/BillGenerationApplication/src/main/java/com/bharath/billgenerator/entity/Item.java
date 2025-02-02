package com.bharath.billgenerator.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="item_details")
@Getter
@Setter
@Data
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="id")
	private Long itemId;
	@Column(name="name",unique = true,
			nullable = false)
	private String itemName;
	private Double price;
	private String category;
	private LocalDateTime addedAt;
	
	
	
}
