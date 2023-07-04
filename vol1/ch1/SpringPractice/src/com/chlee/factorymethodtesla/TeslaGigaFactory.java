package com.chlee.factorymethodtesla;

public class TeslaGigaFactory {
	
	public Car makeTesla(String t) {
		if (t.equalsIgnoreCase("model2")) {
			return new Model2();
		}
		if (t.equalsIgnoreCase("modely")) {
			return new ModelY();
		}
		if (t.equalsIgnoreCase("modelX")) {
			return new ModelX();
			
		}
		return null;
		
	}

}
