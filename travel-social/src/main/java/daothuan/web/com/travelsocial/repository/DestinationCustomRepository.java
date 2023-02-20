package daothuan.web.com.travelsocial.repository;

import daothuan.web.com.travelsocial.dto.Get_List_Destination_By_Name_DTO;
import java.util.List;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
public interface DestinationCustomRepository {


  List<Get_List_Destination_By_Name_DTO> findListDestination(String nameDestination, int offset, int limit);


}
