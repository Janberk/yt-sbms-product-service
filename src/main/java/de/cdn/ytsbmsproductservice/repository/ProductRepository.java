package de.cdn.ytsbmsproductservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import de.cdn.ytsbmsproductservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
