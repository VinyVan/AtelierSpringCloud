package org.van.inventoryservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.van.inventoryservice.entities.Product;

@RestResource
public interface ProductRepository extends JpaRepository<Product, Long> {
}
