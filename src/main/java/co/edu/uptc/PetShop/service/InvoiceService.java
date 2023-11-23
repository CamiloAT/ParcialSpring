package co.edu.uptc.PetShop.service;

import java.util.List;

import co.edu.uptc.PetShop.model.Invoice;

public interface InvoiceService {

	Invoice saveInvoice(Invoice invoice);
	List<Invoice> listInvoices();
	
}
