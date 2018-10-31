package com.gest.core.business.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.gest.core.business.services.JdbcService;
import com.gest.core.business.services.JdbcServiceImpl;
import com.gestwebapp.web.utils.ConfigBean;

public class JdbcServiceImpl implements JdbcService {
	
	private static JdbcServiceImpl _instance = null;

	private static ConfigBean config = null;
	
	private DataSource ds;

	private JdbcServiceImpl(ConfigBean cb) throws RuntimeException {

		try {
			config = cb;
			Class.forName(cb.getDatabaseDriver());
			
		} catch (Exception e) {

			throw new RuntimeException("Errore durante il caricamento del driver", e);
		}
	}

	static JdbcServiceImpl getInstance(ConfigBean cb) throws RuntimeException {
		if (_instance == null) {
			_instance = new JdbcServiceImpl(cb);
		}
		return _instance;
	}

	public static JdbcService getConfiguredInstance() throws RuntimeException {

		if (config == null)
			throw new RuntimeException("Configurazione mancante");

		if (_instance == null)
			throw new RuntimeException("Configurazione mancante");

		return _instance;
	}

	@Override
	public Connection getDatabaseConnection() throws SQLException {
		Connection connection = null;
		if (config.getDatabaseConnectionMethod().equals("DS")) {
		try {
			  Context context = new InitialContext();
			  Context envContext  = (Context)context.lookup("CONTEXT_DS_ENV");
			  ds =(javax.sql.DataSource)envContext.lookup("CONTEXT_JNDI_NAME");
			  connection = ds.getConnection();
			  connection.close();
			}catch (Exception e) { 
			  e.printStackTrace(); 
			}
		} else if(config.getDatabaseConnectionMethod().equals("DM")) {
			connection = DriverManager.getConnection(config.getDatabaseUrl(), config.getDatabaseUsername(),
				config.getDatabasePassword());
		
		}
		return connection;
		
	}

	public void terminateServices() {
		// TODO Auto-generated method stub
		
	}
}
