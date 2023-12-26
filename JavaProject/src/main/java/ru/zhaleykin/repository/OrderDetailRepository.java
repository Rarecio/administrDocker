package ru.zhaleykin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zhaleykin.entity.OrderDetail;
import ru.zhaleykin.entity.OrderDetailId;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailId> {
}