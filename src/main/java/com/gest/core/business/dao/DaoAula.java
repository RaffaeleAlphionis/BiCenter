package com.gest.core.business.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gest.core.business.services.DbServiceFactory;
import com.gest.core.business.vo.VoAula;

public class DaoAula {

	public void create() {};
	
	public static List read() throws SQLException {
		Connection connection = null;
		VoAula VoAula = new VoAula();
		List<VoAula> va = new ArrayList<VoAula>();
		connection = DbServiceFactory.getJdbcDatabaseService().getDatabaseConnection();
		String q = "SELECT * FROM aule" ;
		PreparedStatement pstatement = connection.prepareStatement(q);
		ResultSet rs = pstatement.executeQuery();
		if(rs.next()) {
			VoAula.setIdAula(rs.getInt("idaula"));
			VoAula.setDescrizione(rs.getString("descrizione"));
			VoAula.setPiano(rs.getInt("piano"));
			VoAula.setPosti(rs.getInt("numPosti"));
			va.add(VoAula);
		}
		return va;
	};
	
	public void update() {};
	
	public void delete() {}; 
	
}
