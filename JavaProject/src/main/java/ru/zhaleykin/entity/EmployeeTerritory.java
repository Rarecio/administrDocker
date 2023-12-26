package ru.zhaleykin.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_territories")
public class EmployeeTerritory {
    @EmbeddedId
    private EmployeeTerritoryId id;

    @MapsId("employeeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    public EmployeeTerritoryId getId() {
        return id;
    }

    public void setId(EmployeeTerritoryId id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}