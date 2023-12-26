package ru.zhaleykin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @Column(name = "category_id", nullable = false)
    private Short id;

    @Column(name = "category_name", nullable = false, length = 15)
    private String categoryName;

    @Column(name = "description", length = Integer.MAX_VALUE)
    private String description;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}