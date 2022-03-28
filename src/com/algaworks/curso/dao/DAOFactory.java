package com.algaworks.curso.dao;

import com.algaworks.curso.dao.jdbc.JdbcDAOFactory;

public abstract class DAOFactory {

	public static JdbcDAOFactory getDAOFactory() {
		return new JdbcDAOFactory();
	}
	
	public abstract ClienteDAO getClienteDAO();
	
}