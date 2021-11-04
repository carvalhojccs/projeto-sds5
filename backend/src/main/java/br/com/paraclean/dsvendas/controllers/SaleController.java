package br.com.paraclean.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.paraclean.dsvendas.dto.SaleDTO;
import br.com.paraclean.dsvendas.dto.SaleSuccessDTO;
import br.com.paraclean.dsvendas.dto.SaleSumDTO;
import br.com.paraclean.dsvendas.servicies.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> list = service.findAll(pageable);
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
		List<SaleSumDTO> list = service.amountGroupedBySeller();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller(){
		List<SaleSuccessDTO> list = service.successGroupedBySeller();
		
		return ResponseEntity.ok().body(list);
	}
}
