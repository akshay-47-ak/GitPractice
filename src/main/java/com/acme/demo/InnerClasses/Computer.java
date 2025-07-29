package com.acme.demo.InnerClasses;

import java.lang.management.OperatingSystemMXBean;

public class Computer {

	private String model;
	
	private int ram;
	
	private OperatingSystem os;
	
	
	
	public OperatingSystem getOs() {
		return os;
	}



	public Computer(String model, int ram ,String osName) {
		this.model= model;
		this.ram = ram;
		this.os = new OperatingSystem(osName);
	}
	
	public static class USB{
		private String type;
		
		public USB(String type) {
			this.type = type;
		}
		
		
		public void display(){
			System.out.println("Usb Type is "+ type);
		}
		
	}
	
	
 class OperatingSystem{
		
		private String osName;
		
		public OperatingSystem(String osName) {
			
			this.osName = osName;
		}
		
		public void displayInfo(){
			System.out.println(model+" Has "+osName +"Operating System");
		}
		
	}
	
	
}
