package ai.bitki.orchestration.farm.controller;

import ai.bitki.orchestration.farm.dto.FarmComponent;
import ai.bitki.orchestration.farm.manager.DefaultFarmManager;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/farms")
public class FarmController {


    private final DefaultFarmManager farmManager;

    public FarmController(DefaultFarmManager farmManager) {
        this.farmManager = farmManager;
    }

    @GetMapping
    public List<FarmComponent> getAll()
    {
        return farmManager.getAll();
    }
    @GetMapping("/{id}")
    public FarmComponent get(@PathVariable String id)
    {
        return farmManager.get(id);
    }
    @PutMapping
    public void update(@RequestBody  FarmComponent component)
    {
        farmManager.update(component);
    }
    @PostMapping
    public void create(@RequestBody FarmComponent component)
    {
        farmManager.save(component);
    }
    @DeleteMapping("/{id}")
    public  void delete(@PathVariable String id)
    {
        farmManager.delete(id);
    }


}

