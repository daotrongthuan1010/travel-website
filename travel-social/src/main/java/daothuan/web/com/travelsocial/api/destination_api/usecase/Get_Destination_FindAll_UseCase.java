package daothuan.web.com.travelsocial.api.destination_api.usecase;

import daothuan.web.com.travelsocial.api.destination_api.apiresponse.Get_List_Destination_By_Name_ApiResponse;
import daothuan.web.com.travelsocial.dto.Get_List_Destination_By_Name_DTO;
import daothuan.web.com.travelsocial.entity.Destination;
import daothuan.web.com.travelsocial.repository.repositoryIpm.DestinationRepositoryIpm;
import daothuan.web.com.travelsocial.service.DestinationService;
import jakarta.validation.Validator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
@Service
public class Get_Destination_FindAll_UseCase {
  @Autowired
  private DestinationService destinationService;

  @Autowired
  private Validator validator;


  public ResponseEntity<List<Get_List_Destination_By_Name_ApiResponse>> execute(String name, int page) {

    int pageSize = 1; // number of items per page
    int offset = page * pageSize; // calculate the offset based on the current page number

    List<Get_List_Destination_By_Name_ApiResponse> response = destinationService.findListDestinationByName(name, offset, pageSize).stream()
        .map(destination -> Get_List_Destination_By_Name_ApiResponse.builder()
            .codeTour(destination.getCodeTour())
            .name(destination.getName())
            .description(destination.getDescription())
            .price(destination.getPrice() != null ? destination.getPrice().toString() : "") // Check null
            .build())
        .collect(Collectors.toList());

    return ResponseEntity.ok(response);
  }

}
