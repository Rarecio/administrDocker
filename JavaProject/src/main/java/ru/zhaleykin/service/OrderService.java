package ru.zhaleykin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zhaleykin.entity.Order;
import ru.zhaleykin.repository.EmployeeRepository;
import ru.zhaleykin.repository.OrderRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Optional<Order> getOrderById(Short id){
        return orderRepository.findById(id);
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public List<Order> getAllLater(LocalDate date){
        return orderRepository.findByOrderDateGreaterThanEqual(date);
    }

    public Order saveOrder(Order order){
        return orderRepository.save(order);
    }

    public void deleteOrder(Order order){
        orderRepository.delete(order);
    }

}
