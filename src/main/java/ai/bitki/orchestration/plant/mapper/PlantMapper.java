package ai.bitki.orchestration.plant.mapper;

import ai.bitki.orchestration.plant.domain.Plant;
import ai.bitki.orchestration.plant.dto.PlantComponent;
import org.springframework.stereotype.Component;

@Component
public class PlantMapper {

    public PlantComponent toComponent(Plant plant) {
        if (plant == null) return null;
        return new PlantComponent(
                plant.getId(),
                plant.getCreatedAt(),
                plant.getUpdatedAt(),
                plant.getFarmId(),
                plant.getName(),
                plant.getPlantType(),
                plant.getVariety(),
                plant.getQuantity()

        );
    }

    public Plant toEntity(PlantComponent component) {
        if (component == null) return null;
        Plant plant = new Plant(
                component.getId(),
                component.getFarmId(),
                component.getCreatedAt(),
                component.getUpdatedAt(),
                component.getName(),
                component.getType(),
                component.getVariety(),
                component.getQuantity()
        );
        return plant;
    }
}
