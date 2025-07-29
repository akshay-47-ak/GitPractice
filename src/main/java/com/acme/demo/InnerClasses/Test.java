package com.acme.demo.InnerClasses;

import com.acme.demo.InnerClasses.Car.Engine;

public class Test {

 public static void main(String[] args) {
	
	Computer com = new Computer("HP Vicus ", 8, "Linux");
	
     com.getOs().displayInfo();
	
     Computer.USB  usb = new Computer.USB("Type C");
     
     usb.display();
     
     
     
}
	
	
	
	
	
}
