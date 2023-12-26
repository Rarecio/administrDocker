package ru.zhaleykin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zhaleykin.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Short> {
}