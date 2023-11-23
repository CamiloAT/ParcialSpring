package co.edu.uptc.PetShop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.uptc.PetShop.model.Invoice;
import co.edu.uptc.PetShop.repository.InvoiceRepository;
import co.edu.uptc.PetShop.service.InvoiceService;

public class InvoiceImplement implements InvoiceService{

	@Autowired
	private InvoiceRepository invoiceRepository;
	
	@Override
	public Invoice saveInvoice(Invoice invoice) {
		return invoiceRepository.save(invoice);
	}
}
