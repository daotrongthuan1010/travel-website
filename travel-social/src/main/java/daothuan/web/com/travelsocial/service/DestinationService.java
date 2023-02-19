package daothuan.web.com.travelsocial.service;

import daothuan.web.com.travelsocial.dto.Get_List_Destination_By_Name_DTO;
import java.util.List;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
public interface DestinationService {

    List<Get_List_Destination_By_Name_DTO> findListDestinationByName(String name);
}
