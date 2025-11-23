package ai.bitki.orchestration.farm.domain;

import ai.bitki.orchestration.farm.dto.ClimateZone;
import ai.bitki.orchestration.farm.dto.SoilType;
import jakarta.persistence.*;


@Entity
@Table(name = "farms")
public class Farm {

    @Id
    private String id;
    private long createdAt;
    private long updatedAt;
    private String name;

    @Enumerated(EnumType.STRING)
    private SoilType soilType;

    @Enumerated(EnumType.STRING)
    private ClimateZone climateZone;

    private Double latitude;
    private Double longitude;
    private Double areaSize;


    public Farm(){}

    public Farm(String id, long createdAt, long updatedAt, String name, SoilType soilType, ClimateZone climateZone,
                Double latitude, Double longitude, Double areaSize) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.name = name;
        this.soilType = soilType;
        this.climateZone = climateZone;
        this.latitude = latitude;
        this.longitude = longitude;
        this.areaSize = areaSize;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SoilType getSoilType() {
        return this.soilType;
    }

    public void setSoilType(SoilType soilType) {
        this.soilType = soilType;
    }

    public ClimateZone getClimateZone() {
        return this.climateZone;
    }

    public void setClimateZone(ClimateZone climateZone) {
        this.climateZone = climateZone;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getAreaSize() {
        return this.areaSize;
    }

    public void setAreaSize(Double areaSize) {
        this.areaSize = areaSize;
    }
}
