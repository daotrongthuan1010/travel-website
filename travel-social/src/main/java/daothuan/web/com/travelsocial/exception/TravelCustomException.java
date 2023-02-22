package daothuan.web.com.travelsocial.exception;
import lombok.RequiredArgsConstructor;
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

  @ExceptionHandler({ServiceException.class})
  public void ServiceException(){

  }

  @ExceptionHandler({ValidationException.class})
  public void ValidationException(){

  }

}
