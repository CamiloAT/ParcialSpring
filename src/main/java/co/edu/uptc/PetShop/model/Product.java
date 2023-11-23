package co.edu.uptc.PetShop.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

 @Entity
@Table(name = "products")
public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long idProduct;

        @Column
        private String name;

        @Column
        private TypeProduct typeProduct;

        @Column
        private double price;

        @ManyToMany
        @JoinTable(
                name = "rel_products_invoices",
                joinColumns = @JoinColumn(name = "product_id"),
                inverseJoinColumns = @JoinColumn(name = "invoices_id")
        )
        private List<Invoice> invoices;

        public void AddInvoice(Invoice invoice){
            if(this.invoices == null){
                this.invoices = new ArrayList<>();
            }

            this.invoices.add(invoice);
        }

        public Long getIdProduct() {
            return idProduct;
        }

        public void setIdProduct(Long idProduct) {
            this.idProduct = idProduct;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public TypeProduct getTypeProduct() {
            return typeProduct;
        }

        public void setTypeProduct(TypeProduct typeProduct) {
            this.typeProduct = typeProduct;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

}
