package com.chlee;

public class ShipingDemo {

	public static void main(String[] args) {
		ShipingOb shipingOb = new ShipingOb();

		Shiping shiping1 = shipingOb.getShiping("LandShiping");

		shiping1.ship();


		Shiping shiping2 = shipingOb.getShiping("AirPlaneShiping");

		shiping2.ship();


	}

}
