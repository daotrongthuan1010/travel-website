package daothuan.web.com.travelsocial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Customer class marks a user as a guest
 *
 * @author thuandao
 * @version 1.0
 */
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User_Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;












}
