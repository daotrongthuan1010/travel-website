package daothuan.web.com.travelsocial.service.serviceIpm;

import daothuan.web.com.travelsocial.dto.Get_List_Destination_By_Name_DTO;
import daothuan.web.com.travelsocial.repository.DestinationCustomRepository;
import daothuan.web.com.travelsocial.repository.DestinationRepository;
import daothuan.web.com.travelsocial.service.DestinationService;
import daothuan.web.com.travelsocial.validation.ServiceException;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */

@Service
@Transactional
public class DestinationServiceIpm implements DestinationService {

  @Autowired
  private DestinationRepository destinationRepository;

  @Autowired
  private DestinationCustomRepository destinationCustomRepository;


  @Override
  public List<Get_List_Destination_By_Name_DTO> findListDestinationByName(String nameDestination,
      int offset, int limit) throws ServiceException {
    List<Get_List_Destination_By_Name_DTO> list = destinationCustomRepository.findListDestination(nameDestination, offset, limit);

    return list;
  }
}
