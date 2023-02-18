/**
 * @author ThuanDao
 */
package daothuan.web.com.travelsocial.api.destination_api;

import daothuan.web.com.travelsocial.api.destination_api.apirequest.Get_Destination_FindAll_ApiRequest;
import daothuan.web.com.travelsocial.api.destination_api.apiresponse.Get_Destination_FindAll_ApiResponse;
import daothuan.web.com.travelsocial.api.destination_api.usecase.Get_Destination_FindAll_UseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/destination/")
public class Get_Destination_FinAll_Controller {


  @GetMapping("/find-all")
  public ResponseEntity<Get_Destination_FindAll_ApiResponse> findAllDestination(
      Get_Destination_FindAll_ApiRequest apiRequest){

    Get_Destination_FindAll_UseCase.execute(apiRequest);

    return ResponseEntity.ok().build();

  }

}
