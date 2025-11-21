package ai.bitki.orchestration.farm.manager;

import ai.bitki.orchestration.common.dto.LifecycleManager;
import ai.bitki.orchestration.farm.dto.FarmComponent;

import java.util.List;

public class DefaultFarmManager implements LifecycleManager<FarmComponent> {


  @Override
  public FarmComponent get(String id) {
    return null;
  }

  @Override
  public List<FarmComponent> getAll() {
    return List.of();
  }

  @Override
  public void save(FarmComponent component) {

  }

  @Override
  public void update(FarmComponent component) {

  }

  @Override
  public void delete(String id) {

  }
}
