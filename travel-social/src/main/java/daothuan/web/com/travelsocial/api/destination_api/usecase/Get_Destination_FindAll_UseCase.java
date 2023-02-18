package daothuan.web.com.travelsocial.api.destination_api.usecase;

import daothuan.web.com.travelsocial.api.destination_api.apirequest.Get_Destination_FindAll_ApiRequest;
import daothuan.web.com.travelsocial.domain.entity.Destination;
import daothuan.web.com.travelsocial.utils.Validate;
import java.util.List;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
public class Get_Destination_FindAll_UseCase {




  public static List<Destination> execute(Get_Destination_FindAll_ApiRequest apiRequest){
    Validate.validateAndGetErrorMessages(apiRequest);

    return null;
  }

}
