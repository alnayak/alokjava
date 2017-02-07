package com.om.builderPattern;

/**
 * @author anayak
 *
 */
public class BuilderPattenMain {

	public static void main(String[] args) {
		BuilderPhone builder=new BuilderPhone();
		builder.setModel("");
		builder.setName("Samsung");
		builder.setNoSim(1);
		
		Phone p=builder.getPhone();
		System.out.println(p);

	}

}
