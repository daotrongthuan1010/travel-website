package daothuan.web.com.travelsocial.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Price class marks price change
 *
 * @author thuandao
 * @version 1.0
 */
@Entity
@NoArgsConstructor
@Getter
public class Price  extends AuditLog{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "price")
    private Double price;

    @Column(name = "updateAt")
    private LocalDateTime updatedAt;


}
