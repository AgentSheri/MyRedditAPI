package reddit.smir.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import reddit.smir.com.model.entities.Сommunity;

import java.util.List;
import java.util.Optional;

public interface CommunityRepository extends JpaRepository<Сommunity, Long> {
    List<Сommunity> findByNameContaining(String name);
    Optional<Сommunity> findByName(String name);
}
