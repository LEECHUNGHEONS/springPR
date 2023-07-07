package com.chlee.sec05;

import com.chlee.sec04.ConnectionMaker;
import com.chlee.sec04.DConnectionMaker;

public class ConnectionFactory {
	public ConnectionMaker getConnetionMaker (String getConnectionMakerType ) {
		if (getConnectionMakerType == null ) {
			return null;
		}
		
		if (getConnectionMakerType.equalsIgnoreCase("DConnectionMaker")) {
			return new DConnectionMaker();
			
		}
		if(getConnectionMakerType.equalsIgnoreCase("UConnectionMaker")) {
			return (ConnectionMaker) new UconnectionMaker();
		}
		
		
		
		
		return null;
		
	}
	

}
