package daothuan.web.com.travelsocial.utils;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */


public class Validate {

  private static Validator validator;

  public Validate() {
    validator = new LocalValidatorFactoryBean();
  }

  public static <T> Map<Class<?>, List<String>> validateAndGetErrorMessages(T object) {
    Set<ConstraintViolation<T>> violations = validator.validate(object);
    return violations.stream()
        .collect(Collectors.groupingBy(
            v -> v.getConstraintDescriptor().getAnnotation().annotationType(),
            Collectors.mapping(ConstraintViolation::getMessage, Collectors.toList())));
  }


}


