package com.chlee.factorymethodtesla;

public class ModelX implements Car{

	@Override
	public void drive() {
		System.out.println("럭셔리 모델 모델X 주행중");
		
	}

	@Override
	public void Fsd() {
		System.out.println("FSD 완전 자율 주행 들어갑니다.");
		
	}

}
