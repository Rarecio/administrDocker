package ru.zhaleykin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zhaleykin.entity.Order;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Short> {
    @Override
    Optional<Order> findById(Short aShort);

    List<Order> findByOrderDateGreaterThanEqual(LocalDate orderDate);
}