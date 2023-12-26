package ru.zhaleykin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zhaleykin.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Short> {
}