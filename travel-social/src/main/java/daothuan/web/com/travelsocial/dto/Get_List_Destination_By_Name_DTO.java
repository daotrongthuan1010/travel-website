package daothuan.web.com.travelsocial.dto;

import lombok.Builder;
import lombok.Getter;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
@Getter
@Builder
public class Get_List_Destination_By_Name_DTO {

  private final String codeTour;

  private final String name;

  private final String description;

  private final Double price;


}
