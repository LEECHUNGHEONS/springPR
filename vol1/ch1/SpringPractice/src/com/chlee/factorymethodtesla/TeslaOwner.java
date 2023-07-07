package com.chlee.factorymethodtesla;

public class TeslaOwner {
	public static void main(String[] args) {
	TeslaGigaFactory teslaGigaFactory = new TeslaGigaFactory();
	
	//팩토리의 메소드 호출해서 객체 생성
	Car model2 = teslaGigaFactory.makeTesla("model2");
	Car modely = teslaGigaFactory.makeTesla("modelY");
	Car modelx = teslaGigaFactory.makeTesla("modelx");
	
	//생성된 객체 사용하기 
	model2.drive();
	model2.Fsd();
	System.out.println();
	modely.drive();
	modely.Fsd();
	System.out.println();
	modelx.drive();
	modelx.Fsd();
	
	}
 
}
