/**
 * @author ThuanDao
 */
package daothuan.web.com.travelsocial.repository;

import daothuan.web.com.travelsocial.domain.entity.Destination;
import java.util.List;
import java.util.Map;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository  {

  List<Destination> findListDestination(String nameDestination);





}
