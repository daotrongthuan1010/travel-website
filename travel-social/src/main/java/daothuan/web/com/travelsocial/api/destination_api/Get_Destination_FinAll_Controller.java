/**
 * @author ThuanDao
 */
package daothuan.web.com.travelsocial.api.destination_api;

import daothuan.web.com.travelsocial.api.destination_api.apiresponse.Get_List_Destination_By_Name_ApiResponse;
import daothuan.web.com.travelsocial.api.destination_api.usecase.Get_Destination_FindAll_UseCase;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/destination")
@RequiredArgsConstructor
public class Get_Destination_FinAll_Controller {

  private Get_Destination_FindAll_UseCase destination_findAll_useCase;

  @GetMapping("/find-all")
  public ResponseEntity<List<Get_List_Destination_By_Name_ApiResponse>> findAllDestination(
      @Param("nameDestination") String name, int page){



    return destination_findAll_useCase.execute(name,page);

  }

}
