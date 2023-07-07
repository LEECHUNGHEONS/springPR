package com.chlee.sec07;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
	
	public abstract Connection makeConnection() throws ClassNotFoundException,
	SQLException;

}
