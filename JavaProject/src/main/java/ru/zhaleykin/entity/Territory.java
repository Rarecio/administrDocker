package ru.zhaleykin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "territories")
public class Territory {
    @Id
    @Column(name = "territory_id", nullable = false, length = 20)
    private String territoryId;

    @Column(name = "territory_description", nullable = false, length = 60)
    private String territoryDescription;

    public String getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(String territoryId) {
        this.territoryId = territoryId;
    }

    public String getTerritoryDescription() {
        return territoryDescription;
    }

    public void setTerritoryDescription(String territoryDescription) {
        this.territoryDescription = territoryDescription;
    }

}