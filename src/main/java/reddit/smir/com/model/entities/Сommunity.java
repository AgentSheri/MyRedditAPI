package reddit.smir.com.model.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reddit.smir.com.model.BaseEntity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "communities")
public class Сommunity extends BaseEntity {

    @Column(name = "name", unique = true)
    @NotNull
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "id_user_creator")
    private Long id_user_creator;

    @Column(name = "number_of_subscribers")
    private Long number_of_subscribers;

    @OneToMany()
    @JoinColumn(name = "id_community", referencedColumnName = "id")
    private Set<Post> posts;

    @OneToMany()
    @JoinColumn(name = "id_community", referencedColumnName ="id")
    private List<Subscription> subscriptions;

}
