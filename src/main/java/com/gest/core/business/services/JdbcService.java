package com.gest.core.business.services;

import java.sql.Connection;
import java.sql.SQLException;

import com.gest.core.business.services.DbService;

public interface JdbcService extends DbService<Connection>{

	Connection getDatabaseConnection() throws SQLException;
	
}
