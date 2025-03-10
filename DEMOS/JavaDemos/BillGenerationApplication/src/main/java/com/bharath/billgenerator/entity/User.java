package com.bharath.billgenerator.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="user_details")
@Data
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;

private String userName;
private String password;
private LocalDateTime createdAt;
private LocalDateTime lastUpdatedAt;
private LocalDateTime lastLoggedInAt;
	
}
