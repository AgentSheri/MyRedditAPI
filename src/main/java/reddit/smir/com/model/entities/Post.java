package reddit.smir.com.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reddit.smir.com.model.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "posts")
public class Post extends BaseEntity {
    @Column(name = "rating", nullable = false)
    private long rating;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "id_user_creator", nullable = false)
    private long id_user_creator;

    @Column(name = "id_community", nullable = false)
    private long id_community;


}
