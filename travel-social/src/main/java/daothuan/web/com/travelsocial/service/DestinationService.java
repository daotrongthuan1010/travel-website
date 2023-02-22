package daothuan.web.com.travelsocial.service;

import daothuan.web.com.travelsocial.api.destination_api.apirequest.Save_Destination_ApiRequest;
import daothuan.web.com.travelsocial.api.destination_api.apiresponse.Get_Destination_By_Id_ApiResponse;
import daothuan.web.com.travelsocial.dto.Get_List_Destination_By_Name_DTO;
import daothuan.web.com.travelsocial.entity.Destination;
import daothuan.web.com.travelsocial.validation.ServiceException;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Modifying;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
public interface DestinationService {

    List<Get_List_Destination_By_Name_DTO> findListDestinationByName(String name, int offset, int limit)
        throws ServiceException;

    Optional<Get_Destination_By_Id_ApiResponse> findById(Long id);


    void save(Save_Destination_ApiRequest destination);

    void update(Save_Destination_ApiRequest destination);


    void deleteById(int id);




}
