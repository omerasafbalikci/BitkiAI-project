package ai.bitki.orchestration.plant.dto;

import ai.bitki.orchestration.common.dto.Component;
import jakarta.validation.constraints.NotNull;

public class PlantComponent extends Component {


    @NotNull(message = "this area is not null")
    private final String farmId;
    @NotNull
    private final String name;
    @NotNull
    private final PlantType plantType;
    @NotNull
    private final String variety;
    private final Integer quantity;

    public PlantComponent(String id, long createdAt, long updatedAt, String farmId, String name, PlantType plantType, String variety, Integer quantity) {
        super(id, createdAt, updatedAt);
        this.farmId = farmId;
        this.name = name;
        this.plantType = plantType;
        this.variety = variety;
        this.quantity = quantity;
    }

    public String getFarmId() {
        return farmId;
    }

    public String getName() {
        return name;
    }

    public PlantType getType() {
        return plantType;
    }

    public String getVariety() {
        return variety;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
