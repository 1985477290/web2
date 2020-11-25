package com.xu.web2.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Min {
    int min() default 1;
}
