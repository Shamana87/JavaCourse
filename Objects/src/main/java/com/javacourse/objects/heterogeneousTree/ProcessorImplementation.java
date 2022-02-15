package com.javacourse.objects.heterogeneousTree;

public class ProcessorImplementation implements ComputerElement, Processor {

	private String id;
	private String brand;
	private String model;
	private double price;
	private int cores;

	// Constructor
	public ProcessorImplementation(String id, String brand, String model, int cores) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.cores = cores;
	}

	// Implementation of the inherited methods
	@Override
	public int getCores() {
		return cores;
	}

	@Override
	public ElementType getElementType() {
		return ElementType.Processor;
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

	public void setCores(int cores) {
		this.cores = cores;
	}

	@Override
	public String toString() {
		return "ProcessorImplementation [id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price
				+ ", cores=" + cores + "]";
	}

}
