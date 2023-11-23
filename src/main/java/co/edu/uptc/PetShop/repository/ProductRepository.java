package co.edu.uptc.PetShop.repository;

import co.edu.uptc.PetShop.model.Pet;
import co.edu.uptc.PetShop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
