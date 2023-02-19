package daothuan.web.com.travelsocial.repository;

import daothuan.web.com.travelsocial.entity.Destination;
import java.awt.print.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Long> {






}
