package daothuan.web.com.travelsocial.exception.entityerror;

import com.fasterxml.jackson.annotation.JsonProperty;
import daothuan.web.com.travelsocial.validation.Validation;
import java.util.List;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.boot.context.properties.bind.validation.ValidationErrors;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
@Getter
@Builder
public class ValidationErrorResponse {

  @JsonProperty("result")
  private final String result;

  @JsonProperty("errorMessages")
  private final List<String> errorMessages;

  @JsonProperty("validationErrors")
  private final ValidationErrors  validationErrors;

  @Getter
  @Builder
  public static class ValidationError{

    @JsonProperty("title")
    private final String title;

    @JsonProperty("errors")
    private final List<Error> errors;
  }

  @Getter
  @Builder
  @EqualsAndHashCode
  public static class Error{
    @JsonProperty("name")
    private final String name;

    @JsonProperty("messages")
    private final List<String> messages;

  }


}
