package daothuan.web.com.travelsocial.entity;


import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * User class to store user information.
 *
 * @author ThuanDao1010
 * @version 1.0
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name= "full_name")
    private String fullName;

    @Column(name = "number_phone")
    private String numberPhone;

    @Column(name = "email")
    private String email;

    @Column(name = "oauth_provider")
    private String oauth2Provider;

    @Column(name = "oauth_provider_id")
    private String oauth2ProviderId;

    @Column(name = "access_token")
    private String accessToken;

    @Column(name = "expires_at")
    private LocalDateTime expiresAt;

    @Column(name = "refresh_token")
    private String refreshToken;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<Role> roles;










}
