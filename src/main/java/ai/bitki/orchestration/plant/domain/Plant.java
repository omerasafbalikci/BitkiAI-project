package ai.bitki.orchestration.plant.domain;

import ai.bitki.orchestration.plant.dto.PlantType;
import jakarta.persistence.*;

@Entity
@Table(name = "plants")
public class Plant {
    @Id
    private String id;

    @Column(name = "farm_id")
    private String farmId;

    private long createdAt;
    private long updatedAt;
    private String name;

    @Enumerated(EnumType.STRING)
    private PlantType plantType;

    private String variety;
    private Integer quantity;

    public Plant() {}

    public Plant(String id,String farmId, long createdAt, long updatedAt, String name, PlantType plantType,String variety,Integer quantity) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.name = name;
        this.plantType = plantType;
        this.quantity = quantity;
        this.variety = variety;
        this.farmId = farmId;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlantType getPlantType() {
        return plantType;
    }

    public void setPlantType(PlantType plantType) {
        this.plantType = plantType;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getFarmId() {
        return farmId;
    }

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }
}
