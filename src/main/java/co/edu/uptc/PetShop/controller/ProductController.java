package co.edu.uptc.PetShop.controller;

import co.edu.uptc.PetShop.model.Product;
import co.edu.uptc.PetShop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Product")
@RestController
@Validated
public class ProductController {

        private ProductService productService = new ProductService() {
			
			@Override
			public Product save(Product product) {
				// TODO Auto-generated method stub
				return null;
			}
		};
        @PostMapping("save")
        public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
            Product newProduct = this.productService.save(product);
            return ResponseEntity.ok(newProduct);
        }
}
