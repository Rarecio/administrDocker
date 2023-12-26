package ru.zhaleykin.entity;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "order_id", nullable = false)
    private Short id;

    @Column(name = "order_date")
    private LocalDate orderDate;

    @Column(name = "required_date")
    private LocalDate requiredDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(LocalDate requiredDate) {
        this.requiredDate = requiredDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", requiredDate=" + requiredDate +
                ", customer=" + customer +
                ", employee=" + employee +
                '}';
    }
}