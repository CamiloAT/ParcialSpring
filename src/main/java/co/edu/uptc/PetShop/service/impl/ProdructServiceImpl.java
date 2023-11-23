package co.edu.uptc.PetShop.service.impl;


import co.edu.uptc.PetShop.model.Product;
import co.edu.uptc.PetShop.repository.ProductRepository;
import co.edu.uptc.PetShop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProdructServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;


    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
