package daothuan.web.com.travelsocial.api.destination_api.apiresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */

@Getter
@Builder
public class Get_List_Destination_By_Name_ApiResponse {

  @JsonProperty(namespace = "code_tour")
  private final String codeTour;

  @JsonProperty(namespace = "name")
  private final String name;

  @JsonProperty(namespace = "description")
  private final String description;

  @JsonProperty(namespace = "price")
  private final String price;
}
