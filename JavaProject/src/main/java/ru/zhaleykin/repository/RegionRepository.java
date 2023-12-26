package ru.zhaleykin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zhaleykin.entity.Region;

public interface RegionRepository extends JpaRepository<Region, Short> {
}