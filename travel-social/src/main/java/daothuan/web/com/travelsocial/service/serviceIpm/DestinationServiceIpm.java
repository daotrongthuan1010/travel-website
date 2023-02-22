package daothuan.web.com.travelsocial.service.serviceIpm;

import daothuan.web.com.travelsocial.api.destination_api.apirequest.Save_Destination_ApiRequest;
import daothuan.web.com.travelsocial.api.destination_api.apiresponse.Get_Destination_By_Id_ApiResponse;
import daothuan.web.com.travelsocial.dto.Get_List_Destination_By_Name_DTO;
import daothuan.web.com.travelsocial.repository.DestinationCustomRepository;
import daothuan.web.com.travelsocial.repository.DestinationRepository;
import daothuan.web.com.travelsocial.service.DestinationService;
import daothuan.web.com.travelsocial.validation.ServiceException;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */

@Service
@RequiredArgsConstructor
@Transactional
public class DestinationServiceIpm implements DestinationService {


  private final DestinationRepository destinationRepository;


  private final DestinationCustomRepository destinationCustomRepository;


  @Override
  public List<Get_List_Destination_By_Name_DTO> findListDestinationByName(String nameDestination,
      int offset, int limit) throws ServiceException {
    List<Get_List_Destination_By_Name_DTO> list = destinationCustomRepository.findListDestination(nameDestination, offset, limit);

    return list;
  }

  @Override
  public Optional<Get_Destination_By_Id_ApiResponse> findById(Long id) {

//    Optional<Save_Destination_ApiRequest> opt = destinationRepository.findById(id);
    return Optional.empty();
  }

  @Override
  public void save(Save_Destination_ApiRequest destination) {


  }

  @Override
  public void update(Save_Destination_ApiRequest destination) {

  }

  @Override
  public void deleteById(int id) {

  }
}
