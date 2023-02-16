package daothuan.web.com.travelsocial.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
public class EmailValidator implements ConstraintValidator<Email, String> {

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    return false;
  }
}
