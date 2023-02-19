/**
 * @author ThuanDao
 */
package daothuan.web.com.travelsocial.repository.repositoryIpm;

import daothuan.web.com.travelsocial.entity.User;
import daothuan.web.com.travelsocial.repository.UserRepository;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryIpm implements UserRepository {

  @Override
  public void loadByUserName() {

  }

  @Override
  public Optional<User> findByUsername(String username) {
    return Optional.empty();
  }
}
