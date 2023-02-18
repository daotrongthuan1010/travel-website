package daothuan.web.com.travelsocial.api.destination_api.apiresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
public class Get_Destination_FindAll_ApiResponse {


  @JsonProperty(namespace = "code_tour")
  private String codeTour;

  @JsonProperty(namespace = "name_tour")
  private String nameTour;

  @JsonProperty(namespace = "description")
  private String description;

  @JsonProperty(namespace = "price_id")
  private Double price;

  @JsonProperty(namespace ="location_id")
  private Long locationId;

  @JsonProperty(namespace = "url_img")
  private String urlImg;

  @JsonProperty(namespace = "category_id")
  private Long categoryId;

  @JsonProperty(namespace = "post_id")
  private Long postId;

}
