package com.gest.core.business.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gest.core.business.services.DbServiceFactory;
import com.gest.core.business.vo.VoDestinatario;

public class DaoDestinatario {
	
	public void create() {};
	
	public VoDestinatario read() {
		
		VoDestinatario voDestinatario = new VoDestinatario();
		
		return voDestinatario;
	};
	
	public void update() {};
	
	public void delete() {}

	public static List<VoDestinatario> followCorso(String id) throws SQLException {
		Connection connection = null;
		VoDestinatario VoDestinatario = new VoDestinatario();
		List<VoDestinatario> vd = new ArrayList<VoDestinatario>();
		connection = DbServiceFactory.getJdbcDatabaseService().getDatabaseConnection();
		String q = "SELECT * FROM destinatario as d,frequenta as f WHERE d.iddestinatario=f.iddestinatario AND f.idcorsi=?" ;
		PreparedStatement pstatement = connection.prepareStatement(q);
		pstatement.setString(1, id);
		ResultSet rs = pstatement.executeQuery();
		if(rs.next()) {
			VoDestinatario.setIdDest(rs.getInt("iddestinatario"));
			VoDestinatario.setNome(rs.getString("nome"));
			VoDestinatario.setCognome(rs.getString("cognome"));
			VoDestinatario.setEmail(rs.getString("email"));
			VoDestinatario.setTelefono(rs.getString("telefono"));
			vd.add(VoDestinatario);
		}
		return vd;
	}; 
	

}
