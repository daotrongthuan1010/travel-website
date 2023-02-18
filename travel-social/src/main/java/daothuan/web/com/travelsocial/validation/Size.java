package daothuan.web.com.travelsocial.validation;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import daothuan.web.com.travelsocial.validation.Size.List;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author thuandao1010
 * @version 1.0
 * @since 2023-02-11
 */
@Documented
@Target({ METHOD, FIELD, CONSTRUCTOR, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(List.class)
@Constraint(validatedBy = SizeValidator.class)
public @interface Size {

    @jakarta.validation.constraints.Size
    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payloads() default {};

    int min() default Integer.MIN_VALUE;

    int max() default Integer.MAX_VALUE;


    @Target({ METHOD, FIELD, CONSTRUCTOR, PARAMETER})
    @Retention(RUNTIME)
    @Documented
    @interface List {

       Size[] value();
    }

}
