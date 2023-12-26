package ru.zhaleykin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "region")
public class Region {
    @Id
    @Column(name = "region_id", nullable = false)
    private Short id;

    @Column(name = "region_description", nullable = false, length = 60)
    private String regionDescription;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getRegionDescription() {
        return regionDescription;
    }

    public void setRegionDescription(String regionDescription) {
        this.regionDescription = regionDescription;
    }

}