package com.om.builderpattern;

public class Phone {
	
	private String model;
	private String name;
	private int noSim;
	
	public Phone(String model, String name, int noSim) {
		super();
		this.model = model;
		this.name = name;
		this.noSim = noSim;
	}
	public String toString() {
		return "Phone [model=" + model + ", name=" + name + ", noSim=" + noSim
				+ "]";
	}
	
	

}
