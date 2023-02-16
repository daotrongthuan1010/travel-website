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
public class PhoneValidator implements ConstraintValidator<Phone, String> {

  private static final Pattern PHONE_PATTERN = Pattern.compile(ConstanstValidation.PHONE_REGEX);

  @Override
  public boolean isValid(String phoneNumber, ConstraintValidatorContext context) {
    Matcher matcher = PHONE_PATTERN.matcher(phoneNumber);
    return matcher.matches();
  }


}
