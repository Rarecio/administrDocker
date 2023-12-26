package ru.zhaleykin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zhaleykin.entity.Territory;

public interface TerritoryRepository extends JpaRepository<Territory, String> {
}