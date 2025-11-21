package ai.bitki.orchestration.farm.repository;

import ai.bitki.orchestration.farm.domain.Farm;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ömer Asaf Balıkçı
 */
public interface FarmRepository extends JpaRepository<Farm, Long> {
}
