package ai.bitki.orchestration.plant.manager;

import ai.bitki.orchestration.common.dto.LifecycleManager;
import ai.bitki.orchestration.plant.plantRepository.PlantRepository;
import ai.bitki.orchestration.plant.domain.Plant;
import ai.bitki.orchestration.plant.dto.PlantComponent;
import ai.bitki.orchestration.plant.mapper.PlantMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DefaultPlantManager implements LifecycleManager<PlantComponent> {

    private final PlantRepository planRepository;
    private final PlantMapper plantMapper;

    public DefaultPlantManager(PlantRepository planRepository, PlantMapper plantMapper) {
        this.planRepository = planRepository;
        this.plantMapper = plantMapper;
    }
@Override
    public PlantComponent get(String id)
{
    return planRepository.findById(id)
            .map(plantMapper::toComponent)
            .orElseThrow(() -> new RuntimeException("id is not found"+id));
}
@Override
    public List<PlantComponent> getAll()
{
    return planRepository.findAll()
            .stream().map(plantMapper::toComponent)
            .collect(Collectors.toList());
}
@Override
    public void save(PlantComponent component)
{
    Plant plant = plantMapper.toEntity(component);

    planRepository.save(plant);

}
public void update(PlantComponent component)
{
    save(component);
}
public void delete(String id)
{
    planRepository.deleteById(id);
}
}
