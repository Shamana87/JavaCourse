package com.javacourse.objects.heterogeneousTree;

public class VideoAdapterImplementation implements ComputerElement, VideoAdapter {

	private String id;
	private String brand;
	private String model;
	private double price;
	private String memory;
	
	// Constructor
		public VideoAdapterImplementation(String id, String brand, String model, String memory) {
			super();
			this.id = id;
			this.brand = brand;
			this.model = model;
			this.memory = memory;
		}
	
	// Implementation of the inherited methods
	@Override
	public String getMemory() {
		return memory;
	}

	@Override
	public ElementType getElementType() {
		return ElementType.VideoAdapter;
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

	public void setMemory(String memory) {
		this.memory = memory;
	}

	@Override
	public String toString() {
		return "VideoAdapterImplementation [id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price
				+ ", memory=" + memory + "]";
	}

}
