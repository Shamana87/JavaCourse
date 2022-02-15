package com.javacourse.objects.heterogeneousTree;

public class RamImplementation implements ComputerElement, Ram {

	private String id;
	private String brand;
	private String model;
	private double price;
	private RamType ramType;
	
	// Constructors
	
	public RamImplementation(String id, String brand, String model, RamType ramType) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.ramType = ramType;
	}
	

	// Implementation of the inherited methods
	@Override
	public RamType getRamType() {
		return ramType;
	}

	@Override
	public ElementType getElementType() {
		return ElementType.RAM;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public String getModel() {
		return model;
	}

	@Override
	public double getPrice() {
		return price;
	}

	// Setters
	public void setId(String id) {
		this.id = id;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setRamType(RamType ramType) {
		this.ramType = ramType;
	}


	@Override
	public String toString() {
		return "RamImplementation [id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price
				+ ", ramType=" + ramType + "]";
	}

}
