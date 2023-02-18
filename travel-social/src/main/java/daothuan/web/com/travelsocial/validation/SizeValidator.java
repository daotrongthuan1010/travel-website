package daothuan.web.com.travelsocial.validation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import daothuan.web.com.travelsocial.utils.ConstanstValidation;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.constraints.AssertFalse;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */

public class SizeValidator implements ConstraintValidator<Size,String> {




  @Override
  public boolean isValid(String minString, ConstraintValidatorContext context) {
    return minString.length() > 0 && minString.length() < Integer.MAX_VALUE;
  }


}
