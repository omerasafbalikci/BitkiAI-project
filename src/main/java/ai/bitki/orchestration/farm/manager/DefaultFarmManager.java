package ai.bitki.orchestration.farm.manager;

import ai.bitki.orchestration.common.dto.LifecycleManager;
import ai.bitki.orchestration.farm.domain.Farm;
import ai.bitki.orchestration.farm.dto.FarmComponent;
import ai.bitki.orchestration.farm.mapper.FarmMapper;
import ai.bitki.orchestration.farm.repository.FarmRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DefaultFarmManager implements LifecycleManager<FarmComponent> {

    private final FarmRepository farmRepository;
    private final FarmMapper farmMapper;

    public DefaultFarmManager(FarmRepository farmRepository, FarmMapper farmMapper) {
        this.farmRepository = farmRepository;
        this.farmMapper = farmMapper;
    }

    @Override
    public FarmComponent get(String id) {
        return farmRepository.findById(id)
        .map(farmMapper::toComponent)
                .orElseThrow(() -> new RuntimeException("Farm Not found with id : " + id));

    }

    @Override
    public List<FarmComponent> getAll() {
        return farmRepository.findAll().stream()
                .map(farmMapper::toComponent)
                .collect(Collectors.toList());
    }

    @Override
    public void save(FarmComponent component) {
        Farm farm = farmMapper.toEntity(component);

        farmRepository.save(farm);

    }

    @Override
    public void update(FarmComponent component) {

        save(component);
    }

    @Override
    public void delete(String id) {

        farmRepository.deleteById(id);
    }
}
