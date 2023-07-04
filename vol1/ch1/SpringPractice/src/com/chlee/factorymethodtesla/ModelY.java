package com.chlee.factorymethodtesla;

public class ModelY implements Car{

	@Override
	public void drive() {
		System.out.println("SUV 모델Y 주행 들어중.");
		
	}

	@Override
	public void Fsd() {
		System.out.println("모델 Y FSD 레벨 4 완전 자율 주행 진입 ");
		
	}

}
