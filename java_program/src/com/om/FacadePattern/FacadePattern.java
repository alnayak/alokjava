package com.om.FacadePattern;

public class FacadePattern {
	
	CPU cpu;
	HardDrive drive;
	Memory memory;
	
	public FacadePattern() {
		super();
		this.cpu = new CPU();
		this.drive = new HardDrive();
		this.memory = new Memory();
	}
	
	public void Start(){
		drive.read();
		memory.data();
		cpu.process();
	}
	

}
