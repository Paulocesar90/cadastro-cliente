package com.algaworks.curso.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.algaworks.curso.dao.ClienteDAO;
import com.algaworks.curso.dao.DAOException;
import com.algaworks.curso.modelo.Cliente;

public class JdbcClienteDAO implements ClienteDAO {

	private Connection connection;
	public JdbcClienteDAO(Connection connection) {
		this.connection = connection;
	}
	@Override
	public void salvar(Cliente cliente) {
		try {
			String sql = String.format(
					"insert into cliente (nome) values ('%s')",
					cliente.getNome());
			PreparedStatement ps = this.connection.prepareStatement(sql);
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException("Erro salvando cliente", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {}
		}
	}	
	@Override
	public Cliente buscarPeloCodigo(Long codigo) {
		Cliente cliente = null;
	
		try {
			String sql = String.format("select * from cliente where codigo = %d", codigo);
			PreparedStatement ps = this.connection.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			cliente = new Cliente();
			cliente.setCodigo(rs.getLong("codigo"));
			cliente.setNome(rs.getString(2));
			
		}
		
		}catch (SQLException e) {
			throw new DAOException("Erro buscando cliente", e);
		}finally{
			try {
				this.connection.close();
			}catch (Exception e) {}
		}
			

	
		return cliente;
	}
	@Override
	public Cliente buscarPeloCodigo(long codigo) {
		// TODO Auto-generated method stub
		return null;
	}
			
	
}


