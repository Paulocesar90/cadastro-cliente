package com.algaworks.curso.dao;


import com.algaworks.curso.modelo.Cliente;

public interface ClienteDAO {

	public void salvar(Cliente cliente);

	public Cliente buscarPeloCodigo(long codigo);

	Cliente buscarPeloCodigo(Long codigo);

	


}