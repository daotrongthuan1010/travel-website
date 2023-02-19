package daothuan.web.com.travelsocial.service.serviceIpm;

import daothuan.web.com.travelsocial.dto.Get_List_Destination_By_Name_DTO;
import daothuan.web.com.travelsocial.repository.DestinationRepository;
import daothuan.web.com.travelsocial.service.DestinationService;
import jakarta.transaction.Transactional;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */

@Service
@Transactional
@RequiredArgsConstructor
public class DestinationServiceIpm implements DestinationService {

  @Qualifier("DestinationRepositoryIpm")
  private DestinationRepository destinationRepository;

  @Override
  public List<Get_List_Destination_By_Name_DTO> findListDestinationByName(String name) {
    return null;
  }
}
