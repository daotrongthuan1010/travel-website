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
@Getter
@Builder
public class Destination extends AuditLog  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;

    @Column(name = "name")
    private final String name;

    @Column(name = "description")
    private final String description;

    @Column(name = "location")
    private final String location;


}
