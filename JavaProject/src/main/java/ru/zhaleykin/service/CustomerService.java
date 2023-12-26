package ru.zhaleykin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zhaleykin.entity.Customer;
import ru.zhaleykin.exception.ResourceNotFoundException;
import ru.zhaleykin.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

    public Customer getById(String id){
        return customerRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Customer with id " + id + " not found"));
    }

}
