package com.algaworks.curso.dao;

import com.algaworks.curso.modelo.Cliente;

public class BuscaPeloCodigo {

	public static void main(String[] args) {
		ClienteDAO clienteDAO =DAOFactory.getDAOFactory().getClienteDAO();
		
	Cliente cliente = clienteDAO.buscarPeloCodigo(1L);
		
		if (cliente != null) {
			System.out.println("------ Cliente encontrado ------");
			System.out.printf("Código: %d\n", cliente.getCodigo());
			System.out.printf("Nome: %s\n", cliente.getNome());
			System.out.println();
		} else {
			System.out.println("Nenhum cliente encontrado.");
		}
	}
	
}