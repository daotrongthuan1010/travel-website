package daothuan.web.com.travelsocial.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * Customer class marks a user as a guest
 *
 * @author thuandao
 * @version 1.0
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Role extends AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name_role")
    private String nameRole;



}
