package com.kitec.springframe.dao;

public class ConnectionFactory {
	public ConnectionMaker getConnetionMaker (String getConnectionMakerType ) {
		if (getConnectionMakerType == null ) {
			return null;
		}
		
		if (getConnectionMakerType.equalsIgnoreCase("DConnectionMaker")) {
			return new DConnectionMaker();
			
		}
		if(getConnectionMakerType.equalsIgnoreCase("UConnectionMaker")) {
			return new UconnectionMaker();
		}
		
		
		
		
		return null;
		
	}
	

}
