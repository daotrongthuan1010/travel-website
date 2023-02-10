package daothuan.web.com.travelsocial.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rating extends AuditLog  {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name="POINT_RATE")
    private Double pointRate;

    @Column(name = "content")
    private String content;

    @Column(name = "description")
    private String description;



}
