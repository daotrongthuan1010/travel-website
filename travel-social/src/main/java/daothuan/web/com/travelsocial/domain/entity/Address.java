package daothuan.web.com.travelsocial.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Address class to store address for system.
 *
 * @author ThuanDao1010
 * @version 1.0
 */
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="street")
    private String street;

    @Column(name ="ward")
    private String ward;

    @Column(name="district")
    private String district;

    @Column(name="city")
    private String city;

    @Column(name="country")
    private String country;

    @Column(name ="zip_code")
    private String zipCode;

}
