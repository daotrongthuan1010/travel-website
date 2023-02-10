package daothuan.web.com.travelsocial.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
