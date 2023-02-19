package daothuan.web.com.travelsocial.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * Comment class to store comment review of use.
 *
 * @author thuandao
 * @version 1.0
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment extends AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content")
    private String content;

    @Column(name = "description")
    private String description;

    @Column(name = "date_post")
    private LocalDateTime datePost;





}
