package br.com.paraclean.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.paraclean.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
