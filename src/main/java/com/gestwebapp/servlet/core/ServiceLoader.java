package com.gestwebapp.servlet.core;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.gest.core.business.services.DbServiceFactory;
import com.gestwebapp.web.utils.ConfigBean;

/**
 * Servlet implementation class ServiceLoader
 */
public class ServiceLoader extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		// creazione del bean di configurazione
		
		ConfigBean cb = new ConfigBean();
		
		// recupero parametri di configurazione da file esterno
		
		String databaseDriver   = getInitParameter("DATABASE_DRIVER_mauro");
		String databaseUrl	    = getInitParameter("DATABASE_URL_mauro");
		String databaseUsername = getInitParameter("DATABASE_USERNAME");
		String databasePassword = getInitParameter("DATABASE_PASSWORD");
		
		// importazione dei dati nel configBean
		
		cb.setDatabaseDriver(databaseDriver);
		cb.setDatabaseUrl(databaseUrl);
		cb.setDatabaseUsername(databaseUsername);
		cb.setDatabasePassword(databasePassword);
		
		// 
		try {
			DbServiceFactory.initServices(cb);
			
		} catch (Exception e) {
			System.err.println("Errore grave durante la configurazione del database.");
			e.printStackTrace();
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		
	}


}
