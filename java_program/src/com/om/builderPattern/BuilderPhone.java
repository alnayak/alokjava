package com.om.builderPattern;

public class BuilderPhone {
	private String model;
	private String name;
	private int noSim;

	public BuilderPhone setModel(String model) {
		this.model = model;
		return this;
	}

	public BuilderPhone setName(String name) {
		this.name = name;
		return this;
	}

	public BuilderPhone setNoSim(int noSim) {
		this.noSim = noSim;
		return this;
	}

	Phone getPhone() {
		return new Phone(model, name, noSim);
	}

}
