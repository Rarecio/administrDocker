package ru.zhaleykin.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @Column(name = "product_id", nullable = false)
    private Short id;

    @Column(name = "product_name", nullable = false, length = 40)
    private String productName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "quantity_per_unit", length = 20)
    private String quantityPerUnit;

    @Column(name = "unit_price")
    private Float unitPrice;

    @Column(name = "units_in_stock")
    private Short unitsInStock;

    @Column(name = "units_on_order")
    private Short unitsOnOrder;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Short getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(Short unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public Short getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(Short unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }

}