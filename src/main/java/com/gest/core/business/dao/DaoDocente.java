package com.gest.core.business.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gest.core.business.services.DbServiceFactory;
import com.gest.core.business.vo.VoDocente;

public class DaoDocente {

	public void create() {};
	
	public VoDocente read() {
		
		VoDocente voDocente = new VoDocente();
		
		return voDocente;
	};
	
	public void update() {};
	
	public void delete() {}

	public static List<VoDocente> doCorso(String id) throws SQLException {
		Connection connection = null;
		VoDocente VoDocente = new VoDocente();
		List<VoDocente> vd = new ArrayList<VoDocente>();
		connection = DbServiceFactory.getJdbcDatabaseService().getDatabaseConnection();
		String q = "SELECT * FROM docenti as d,corsidocente as cd WHERE d.iddocente=cd.iddocente AND cd.idcorsi=?" ;
		PreparedStatement pstatement = connection.prepareStatement(q);
		pstatement.setString(1, id);
		ResultSet rs = pstatement.executeQuery();
		if(rs.next()) {
			VoDocente.setIdDocente(rs.getInt("iddocente"));
			VoDocente.setNome(rs.getString("nome"));
			VoDocente.setCognome(rs.getString("cognome"));
			VoDocente.setEmail(rs.getString("email"));
			VoDocente.setTelefono(rs.getString("telefono"));
			VoDocente.setMateria(rs.getString("materia"));
			vd.add(VoDocente);
		}
		return vd;
	}; 
}
