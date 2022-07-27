package reddit.smir.com.dto;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class RegisterRequest {
    private String username;

    private String email;

    private String password;

    private Date date_of_birth;
}
