package ai.bitki.orchestration.farm.mapper;

import ai.bitki.orchestration.farm.domain.Farm;
import ai.bitki.orchestration.farm.dto.FarmComponent;
import org.springframework.stereotype.Component;

@Component
public class FarmMapper {

    public FarmComponent toComponent(Farm farm)
    {
        if (farm == null) return null;
        return new FarmComponent(
        farm.getId(),
        farm.getCreatedAt(),
        farm.getUpdatedAt(),
        farm.getName(),
        farm.getSoilType(),
        farm.getClimateZone(),
        farm.getLatitude(),
        farm.getLongitude(),
        farm.getAreaSize());
    }
    public Farm toEntity(FarmComponent component)
    {
        if (component == null) return null;

        Farm farm = new Farm(
                component.getId(),
                component.getCreatedAt(),
                component.getUpdatedAt(),
                component.getName(),
                component.getSoilType(),
                component.getClimateZone(),
                component.getLatitude(),
                component.getLongitude(),
                component.getAreaSize()
        );
        return farm;
    }


}
