package daothuan.web.com.travelsocial.validation;

import daothuan.web.com.travelsocial.utils.ConstanstValidation;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
public class EmailValidator implements ConstraintValidator<Email, String> {

  private static final Pattern EMAIL_PATTERN = Pattern.compile(ConstanstValidation.EMAIL_REGEX);
  @Override
  public boolean isValid(String emailPattern, ConstraintValidatorContext context) {

    Matcher matcher = EMAIL_PATTERN.matcher(emailPattern);

    return matcher.matches();
  }
}
