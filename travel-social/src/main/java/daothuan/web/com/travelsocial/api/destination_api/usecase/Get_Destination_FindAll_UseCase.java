package daothuan.web.com.travelsocial.api.destination_api.usecase;

import daothuan.web.com.travelsocial.api.destination_api.apiresponse.Get_List_Destination_By_Name_ApiResponse;
import daothuan.web.com.travelsocial.service.DestinationService;
import daothuan.web.com.travelsocial.validation.ServiceException;
import jakarta.validation.Validator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
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
@RequiredArgsConstructor
public class Get_Destination_FindAll_UseCase {

  private final DestinationService destinationService;

  private Validator validator;




  public ResponseEntity<List<Get_List_Destination_By_Name_ApiResponse>> execute(Optional<String> name, Optional<Integer> page) {

    int pageSize = 3; // number of items per page
    int offset = 0; // calculate the offset based on the current page number

    if(name.isPresent()){

    }

    {
      List<Get_List_Destination_By_Name_ApiResponse> response = destinationService.findListDestinationByName(name.get(), offset, pageSize).stream()
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

}
