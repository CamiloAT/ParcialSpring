package co.edu.uptc.PetShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.uptc.PetShop.model.Invoice;
import co.edu.uptc.PetShop.service.InvoiceService;

@RequestMapping("/invoice")
@RestController
@Validated
public class InvoiceController {
	
	@Autowired
	private InvoiceService invoiceService;
	
	@PostMapping("save")
    public ResponseEntity<Invoice> saveInvoice(@RequestBody Invoice invoice) {
		Invoice newInvoice = this.invoiceService.saveInvoice(invoice);
		return ResponseEntity.ok(newInvoice);
	}
}
