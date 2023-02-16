/**
 * @author ThuanDao
 */
package daothuan.web.com.travelsocial.api.destination_api.apirequest;

import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Get_Destination_FindAll {

  @Size(min = 1)
  private final String id;

  private final String name;


}
