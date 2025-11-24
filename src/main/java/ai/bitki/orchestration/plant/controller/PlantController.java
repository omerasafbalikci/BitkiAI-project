package ai.bitki.orchestration.plant.controller;

import ai.bitki.orchestration.plant.dto.PlantComponent;
import ai.bitki.orchestration.plant.manager.DefaultPlantManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plants")
public class PlantController {
    private final DefaultPlantManager defaultPlantManager;

    public PlantController(DefaultPlantManager defaultPlantManager) {
        this.defaultPlantManager = defaultPlantManager;
    }

    @GetMapping
    public List<PlantComponent> getAll()
    {
        return defaultPlantManager.getAll();
    }
    @GetMapping("/{id}")
    public PlantComponent get(@PathVariable String id)
    {
        return defaultPlantManager.get(id);
    }
    @PutMapping
    public void update(@RequestBody PlantComponent component)
    {
        defaultPlantManager.update(component);
    }
    @PostMapping
    public  void create(@RequestBody PlantComponent component)
    {
        defaultPlantManager.save(component);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id)
    {
        defaultPlantManager.delete(id);
    }

}
