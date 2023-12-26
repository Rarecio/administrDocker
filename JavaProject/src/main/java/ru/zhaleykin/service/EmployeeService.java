package ru.zhaleykin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zhaleykin.entity.Employee;
import ru.zhaleykin.exception.ResourceNotFoundException;
import ru.zhaleykin.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getById(Short id){
        return employeeRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Employee with id " + id + " not found"));
    }

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

}
