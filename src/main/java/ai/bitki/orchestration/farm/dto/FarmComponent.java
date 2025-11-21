package ai.bitki.orchestration.farm.dto;

import ai.bitki.orchestration.common.dto.Component;
import jakarta.validation.constraints.NotNull;

public class FarmComponent extends Component {

  @NotNull(message = "Name must not be null")
  private final String name;

  @NotNull(message = "Soil type must not be null")
  private final SoilType soilType;

  @NotNull(message = "Climate zone must not be null")
  private final ClimateZone climateZone;

  private final Double latitude;
  private final Double longitude;
  private final Double areaSize;

  public FarmComponent(String id, long createdAt, long updatedAt, String name, SoilType soilType, ClimateZone climateZone,
                       Double latitude, Double longitude, Double areaSize) {
    super(id, createdAt, updatedAt);
    this.name = name;
    this.soilType = soilType;
    this.climateZone = climateZone;
    this.latitude = latitude;
    this.longitude = longitude;
    this.areaSize = areaSize;
  }

  public String getName() {
    return this.name;
  }

  public SoilType getSoilType() {
    return this.soilType;
  }

  public ClimateZone getClimateZone() {
    return this.climateZone;
  }

  public Double getLatitude() {
    return this.latitude;
  }

  public Double getLongitude() {
    return this.longitude;
  }

  public Double getAreaSize() {
    return this.areaSize;
  }
}
