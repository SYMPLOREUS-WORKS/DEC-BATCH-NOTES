package com.bharath.task.entity;

public class Menu {
	private Long menuID;
	private String name;
	private Double price;
	private String description;

	public Menu() {
		super();
	}

	public Menu(Long menuID, String name, Double price, String description) {
		super();
		this.menuID = menuID;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public Long getMenuID() {
		return menuID;
	}

	public void setMenuID(Long menuID) {
		this.menuID = menuID;
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
