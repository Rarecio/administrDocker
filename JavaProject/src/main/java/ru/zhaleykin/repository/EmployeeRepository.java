package ru.zhaleykin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zhaleykin.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Short> {
}