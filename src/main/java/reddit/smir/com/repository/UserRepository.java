package reddit.smir.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import reddit.smir.com.model.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
