package ru.zhaleykin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zhaleykin.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {



}