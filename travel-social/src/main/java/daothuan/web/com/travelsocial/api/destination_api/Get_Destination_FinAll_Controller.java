/**
 * @author ThuanDao
 */
package daothuan.web.com.travelsocial.api.destination_api;

import daothuan.web.com.travelsocial.api.destination_api.apiresponse.Get_List_Destination_By_Name_ApiResponse;
import daothuan.web.com.travelsocial.api.destination_api.usecase.Get_Destination_FindAll_UseCase;
import daothuan.web.com.travelsocial.entity.Destination;
import daothuan.web.com.travelsocial.repository.DestinationRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/destination")
public class Get_Destination_FinAll_Controller {

  @Autowired
  private Get_Destination_FindAll_UseCase destination_findAll_useCase;

  @Autowired
  private DestinationRepository destinationRepository;



  @GetMapping("/find-all")
  public ResponseEntity<List<Get_List_Destination_By_Name_ApiResponse>> findAllDestination(
      @Param("name") String name, @Param("page") int page){

  System.out.println(name + page);

    return destination_findAll_useCase.execute(name,page);

  }

  @GetMapping("/find-by-id")
  public ResponseEntity<Optional<Destination>> findById(@RequestParam("id") Long id) {
    Optional<Destination> opt = destinationRepository.findById(id);
    if (opt.isPresent()) {
      return ResponseEntity.ok(opt);
    } else {
      return ResponseEntity.notFound().build();
    }
  }
}
