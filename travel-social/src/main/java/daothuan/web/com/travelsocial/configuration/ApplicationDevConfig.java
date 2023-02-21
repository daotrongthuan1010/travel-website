
package daothuan.web.com.travelsocial.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
/**
 * Class ApplicationDevConfig for develop.
 * @author thuandao1010
 * @version 1.0
 */
@Configuration
@Profile("dev")
@PropertySource("classpath:application.yml")
public class ApplicationDevConfig {

}
