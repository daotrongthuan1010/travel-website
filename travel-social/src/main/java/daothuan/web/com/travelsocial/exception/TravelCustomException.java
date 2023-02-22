package daothuan.web.com.travelsocial.exception;
import daothuan.web.com.travelsocial.exception.entityerror.ValidationErrorResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
@RestControllerAdvice
@RequiredArgsConstructor
public class TravelCustomException extends RuntimeException{

  private static final String RESULT_NG = "ng";

  private MessageSource messageSource;

  @ExceptionHandler({ServiceException.class})
  public void ServiceException(){

  }

  @ExceptionHandler({ValidationException.class})
  public ResponseEntity<ValidationErrorResponse> ValidationException(
      jakarta.validation.ValidationException validationException){

    ValidationErrorResponse.ValidationError validationError = ValidationErrorResponse.ValidationError
        .builder()
        .title(messageSource.getMessage(MessagePro))

    ValidationErrorResponse response = ValidationErrorResponse.builder()
        .result(RESULT_NG)
        .validationErrors()

  return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
  }

}
