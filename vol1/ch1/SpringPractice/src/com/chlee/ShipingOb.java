package com.chlee;

public class ShipingOb {
	//
	public Shiping getShiping(String shipingType ) {
		if(shipingType == null) {
			return null;
		}

		if(shipingType.equalsIgnoreCase("LandShiping")) {
			return new LandShip();
		}else if (shipingType.equalsIgnoreCase("AirPlaneShiping")) {
			return new AirPlaneShip();
		}

		return null;

	}

}
