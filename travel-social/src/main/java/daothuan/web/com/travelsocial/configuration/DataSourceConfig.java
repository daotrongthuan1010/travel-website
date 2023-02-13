/**
 * @author ThuanDao
 */
package daothuan.web.com.travelsocial.configuration;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

  @Bean
  public DataSource getDataSource(){

      return DataSourceBuilder.create()
          .driverClassName("com.mysql.cj.jdbc.Driver")
          .url("jdbc:mysql://localhost:3306/test1")
          .username("root")
          .password("mk123654")
          .build();
    }
}
