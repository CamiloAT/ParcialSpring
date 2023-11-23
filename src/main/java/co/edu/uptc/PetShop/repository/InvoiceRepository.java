package co.edu.uptc.PetShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uptc.PetShop.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long>{
	
}
