package daothuan.web.com.travelsocial.entity;

import org.springframework.security.core.GrantedAuthority;

/**
 * Customer class marks a user as a guest
 *
 * @author thuandao
 * @version 1.0
 */

public enum Role implements GrantedAuthority {
    ROLE_ADMIN, ROLE_CLIENT;

    public String getAuthority() {
        return name();
    }



}
