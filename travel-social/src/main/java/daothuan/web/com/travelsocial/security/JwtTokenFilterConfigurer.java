//package daothuan.web.com.travelsocial.security;
//
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.DefaultSecurityFilterChain;
//import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//
//public class JwtTokenFilterConfigurer extends
//    SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
//
//  @Autowired
//  private JwtTokenProvider jwtTokenProvider;
//
//  public JwtTokenFilterConfigurer(JwtTokenProvider jwtTokenProvider) {
//    this.jwtTokenProvider = jwtTokenProvider;
//  }
//
//
//
//}