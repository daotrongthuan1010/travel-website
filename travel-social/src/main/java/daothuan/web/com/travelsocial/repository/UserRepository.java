/**
 * @author ThuanDao
 */
package daothuan.web.com.travelsocial.repository;

import daothuan.web.com.travelsocial.domain.entity.User;
import java.util.Optional;

public interface UserRepository {

  void loadByUserName();
  Optional<User> findByUsername(String username);

}
