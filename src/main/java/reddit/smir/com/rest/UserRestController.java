package reddit.smir.com.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;
import reddit.smir.com.model.entities.User;
import reddit.smir.com.repository.UserRepository;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserRestController {

    private final UserRepository userRepository;

    public UserRestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/{username}")
    public ResponseEntity<?> getUser(@PathVariable String username){
        User user = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException(" user doesn't exist"));

        Map<Object, Object> response = new HashMap<>();
        response.put("username", user.getUsername());
        response.put("email", user.getEmail());
        response.put("date_of_birth", user.getDate_of_birth());

        return ResponseEntity.ok(response);
    }
}
