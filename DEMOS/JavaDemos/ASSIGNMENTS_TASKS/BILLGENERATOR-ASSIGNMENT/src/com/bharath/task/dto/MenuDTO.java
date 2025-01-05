package com.bharath.task.dto;

public class MenuDTO {
	private Long menuId;
	private String name;
	private Double price;
	private String description;

	public MenuDTO() {
		super();

	}

	public MenuDTO(Long menuId, String name, Double price, String description) {
		super();
		this.menuId = menuId;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
