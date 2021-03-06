package reddit.smir.com.model.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reddit.smir.com.model.BaseEntity;
import reddit.smir.com.model.Role;
import reddit.smir.com.model.Status;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "date_of_birth", nullable = false)
    private Date date_of_birth;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status = Status.ACTIVE;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;

    @OneToMany()
    @JoinColumn(name = "id_user_creator", referencedColumnName ="id")
    private Set<Сommunity> communities;

    @OneToMany()
    @JoinColumn(name = "id_user_creator", referencedColumnName ="id")
    private Set<Post> posts;

    @OneToMany()
    @JoinColumn(name = "id_user", referencedColumnName ="id")
    private List<Subscription> subscriptions;

}