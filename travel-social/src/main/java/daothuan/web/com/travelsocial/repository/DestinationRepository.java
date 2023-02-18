package daothuan.web.com.travelsocial.repository;

import daothuan.web.com.travelsocial.domain.entity.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Long> {



}
