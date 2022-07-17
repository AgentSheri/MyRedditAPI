package reddit.smir.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import reddit.smir.com.model.entities.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {


}
