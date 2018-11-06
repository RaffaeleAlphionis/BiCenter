package com.gest.core.business.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gest.core.business.services.DbServiceFactory;
import com.gest.core.business.vo.VoCorso;

public class DaoCorso {

	public void create() {};
	
	public static List read() throws SQLException {
		Connection connection = null;
		VoCorso voCorso = new VoCorso();
		List<VoCorso> vc = new ArrayList<VoCorso>();
		connection = DbServiceFactory.getJdbcDatabaseService().getDatabaseConnection();
		String q = "SELECT * FROM corso WHERE dataInizio<NOW() ORDER BY dataInizio" ;
		PreparedStatement pstatement = connection.prepareStatement(q);
		ResultSet rs = pstatement.executeQuery();
		if(rs.next()) {
			voCorso.setIdCorso(rs.getInt("idCorso"));
			voCorso.setIdAula(rs.getInt("idAula"));
			voCorso.setIdAzienda(rs.getInt("idAzienda"));
			voCorso.setDataInizio(rs.getDate("dataInizio"));
			voCorso.setDataFine(rs.getDate("dataFine"));
			voCorso.setDescrizione(rs.getString("descrizione"));
			vc.add(voCorso);
		}
		return vc;
	};
	
	
	public void update() {};
	
	public void delete() {};
}
