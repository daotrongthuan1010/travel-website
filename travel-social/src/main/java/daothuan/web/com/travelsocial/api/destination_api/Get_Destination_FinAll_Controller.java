/**
 * @author ThuanDao
 */
package daothuan.web.com.travelsocial.api.destination_api;

import daothuan.web.com.travelsocial.api.destination_api.apiresponse.Get_List_Destination_By_Name_ApiResponse;
import daothuan.web.com.travelsocial.api.destination_api.usecase.Get_Destination_FindAll_UseCase;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/destination")
public class Get_Destination_FinAll_Controller {


//  @GetMapping("/find-all")
//  public ResponseEntity<Get_List_Destination_By_Name_ApiResponse> findAllDestination(
//      @Param("nameDestination") String name){
//
//    Get_Destination_FindAll_UseCase.execute(name);
//
//    return ResponseEntity.ok().build();
//
//  }

}
