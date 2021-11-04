package br.com.paraclean.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.paraclean.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
