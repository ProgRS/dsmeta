package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;

//resposnsavel por acessar o banco de dados:
//acessar uma venda, salvar, deletar, atualizar, buscar por id..
public interface SaleRepository extends JpaRepository<Sale, Long> {
			
}
