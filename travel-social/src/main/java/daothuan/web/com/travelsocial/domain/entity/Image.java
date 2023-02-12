package daothuan.web.com.travelsocial.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * Image class stores images for the system
 *
 * @author thuandao
 * @version 1.0
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Image extends AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Transient
    private MultipartFile multipartFile;

    @Transient
    private Double size;

    @Column(name = "url_img")
    private String url;

    @Column(name = "path")
    private String path;

}
