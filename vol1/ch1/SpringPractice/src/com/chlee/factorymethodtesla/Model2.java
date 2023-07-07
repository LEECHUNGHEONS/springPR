package com.chlee.factorymethodtesla;

public class Model2 implements Car {
	
	@Override
	public void drive() {
		System.out.println("소행 차량 모델 2 주행중");
	}

	@Override
	public void Fsd() {
		System.out.println("레벨4 fsd 완전 자율 주행 진입합니다.");
		
	}

}
