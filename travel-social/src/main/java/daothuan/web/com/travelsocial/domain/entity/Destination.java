package daothuan.web.com.travelsocial.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

/**
 * Destination class marks a destination for the user
 *
 * @author thuandao
 * @version 1.0
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Destination extends AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "location")
    private String location;




}
