package daothuan.web.com.travelsocial.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
@Getter
@AllArgsConstructor
public class ServiceException extends Exception{

    private final String causeId;
}
