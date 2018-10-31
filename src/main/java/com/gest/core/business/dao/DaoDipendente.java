package com.gest.core.business.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gest.core.business.services.DbServiceFactory;
import com.gest.core.business.vo.VoDipendente;

public class DaoDipendente {
	
	public void create() {};
	
	public VoDipendente read() {
		
		VoDipendente voDipendente = new VoDipendente();
		
		return voDipendente;
	};
	
	public static boolean login(VoDipendente d) throws SQLException {
		Connection connection = null;
		boolean login = false;
		connection = DbServiceFactory.getJdbcDatabaseService().getDatabaseConnection();
		String q = "SELECT * FROM dipendente WHERE ?=user AND ?=password" ;
		PreparedStatement pstatement = connection.prepareStatement(q);
		pstatement.setString(1, d.getUsername());
		pstatement.setString(2, d.getPassword());
		ResultSet rs = pstatement.executeQuery();
		if(rs.next()) login = true;
		return login;
	}
	
	public void update() {};
	
	public void delete() {}; 
	
}
