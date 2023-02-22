/**
 * @author ThuanDao
 */
package daothuan.web.com.travelsocial.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("prod")
@PropertySource("classpath:application-pro.yml")
public class ApplicationProdConfig {

}
