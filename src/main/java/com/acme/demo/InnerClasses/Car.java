package com.acme.demo.InnerClasses;



public class Car {
	
	private String model;
	
	private boolean isEngineON;
	
  public Car(String model){
	  this.model = model;
	  this.isEngineON = false;
  }
	
  
  class Engine{
	  
	  public void start(){
		  if(!isEngineON){
			isEngineON = true;
			System.out.println(model+"Engine is Started ");
		  }else {
			System.out.println(model+"Engine is Aready ON");
		}
	  }
	  
	  
	  public void stop(){
		  if (isEngineON) {
			isEngineON= false;
			System.out.println(model+"engine Stopped");
		}else {
			System.out.println(model+"engine Is Already Stopped ");
		}
	  }
	  
  }
	

}
