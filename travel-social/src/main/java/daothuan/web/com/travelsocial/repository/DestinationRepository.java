package daothuan.web.com.travelsocial.repository;

import daothuan.web.com.travelsocial.dto.Get_List_Destination_By_Name_DTO;
import daothuan.web.com.travelsocial.entity.Destination;
import java.awt.print.Pageable;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Long> {


    Optional<Destination> findById(Long id);


}
