package co.edu.uptc.PetShop.service.impl;

import java.util.List;

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

	@Override
	public List<Invoice> listInvoices() {
		return invoiceRepository.findAll();
	}
}
