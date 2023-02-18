/**
 * @author ThuanDao
 */
package daothuan.web.com.travelsocial.api.destination_api.apirequest;

import daothuan.web.com.travelsocial.validation.Email;
import daothuan.web.com.travelsocial.validation.Phone;
import daothuan.web.com.travelsocial.validation.Size;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Get_Destination_FindAll_ApiRequest {


  private final String id;

  @Size(min=1, max = 1000)
  private final String name;


}
