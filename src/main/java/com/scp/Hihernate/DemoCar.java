package com.scp.Hihernate;

import javax.persistence.*;

@Entity
@Table(name = "Car")
public class DemoCar {
	@Id
	@Column(name = "car_id")
	private int id;
	@Column(name = "car_name")
	private String name;
	@Column(name = "car_color")
	private String color;
	@Column(name = "car_price")
	private int price;

	public DemoCar(int id, String name, String color, int price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public DemoCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DemoCar [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
