package ru.zhaleykin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EmployeeTerritoryId implements Serializable {
    private static final long serialVersionUID = 5979421381317455254L;
    @Column(name = "employee_id", nullable = false)
    private Short employeeId;

    @Column(name = "territory_id", nullable = false, length = 20)
    private String territoryId;

    public Short getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Short employeeId) {
        this.employeeId = employeeId;
    }

    public String getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(String territoryId) {
        this.territoryId = territoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EmployeeTerritoryId entity = (EmployeeTerritoryId) o;
        return Objects.equals(this.territoryId, entity.territoryId) &&
                Objects.equals(this.employeeId, entity.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(territoryId, employeeId);
    }

}