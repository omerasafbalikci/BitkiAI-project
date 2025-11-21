package ai.bitki.orchestration.common.dto;

import java.util.List;

/**
 * @author Ömer Asaf Balıkçı
 */
public interface LifecycleManager<T> {

  T get(String id);

  List<T> getAll();

  void save(T component);

  void update(T component);

  void delete(String id);
}
