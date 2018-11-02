package com.gest.core.business.dao;

import java.sql.SQLException;
import java.util.List;

import com.gest.core.business.exception.DatabaseException;
import com.gest.core.business.vo.VoDipendente;

public interface DaoDipendente {
	
	/**
	 * Metodo che controlla l'autorizzazione dell'utente durante il login.
	 * 
	 * @param username
	 * @param password
	 * @return boolean
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	boolean authorization(String username, String password) throws DatabaseException;

	VoDipendente findByUsername(String username) throws DatabaseException;

	/**
	 * Metodo finder per la ricerca dell'utente tramite il suo id (primary key).
	 * 
	 * @param id
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws Exception
	 */
	VoDipendente findById(int id) throws DatabaseException;

	/**
	 * Metodo per la cancellazione dell'utente tramite il suo id (primary key).
	 * 
	 * @param id
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws Exception
	 */
	void delete(int id) throws DatabaseException;

	/**
	 * Metodo per la registrazione dell'utente nella base dati.
	 * 
	 * @param user
	 *            void
	 * @throws Exception
	 *
	 */
	void save(VoDipendente dipendente) throws DatabaseException;

	/**
	 * Metodo per la modifica dell'utente nella base dati.
	 * 
	 * @param user
	 *            void
	 * @throws Exception
	 *
	 */
	void update(VoDipendente dipendente) throws DatabaseException;

	/**
	 * Metodo finder per la ricerca di tutti gli utenti.
	 * 
	 * @param id
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws Exception
	 */
	List<VoDipendente> findAll() throws DatabaseException;

	/**
	 * Metodo per il controllo dell'esistenza di uno username
	 * 
	 * @param sql
	 * @param user
	 * @return
	 * @throws SQLException
	 */
	boolean exist(String username) throws DatabaseException;
}
