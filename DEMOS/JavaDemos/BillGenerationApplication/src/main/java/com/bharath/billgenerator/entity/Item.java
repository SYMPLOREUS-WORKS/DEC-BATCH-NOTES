package com.bharath.billgenerator.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="item_details")
@Getter
@Setter
@Data
@NamedQuery(query = "select i from Item i where i.category =?1",name = "Item.findItemsBasedOnCategory")
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
	//@UpdateTimestamp
	private LocalDateTime lastUpdatedAt;
	
	
	
}
