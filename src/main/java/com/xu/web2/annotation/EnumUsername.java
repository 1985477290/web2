package com.xu.web2.annotation;

import java.lang.annotation.*;

/**
 * @Author Administrator
 * @Date 2020/11/23 14:23
 * @Version 1.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnumUsername {
    String[] enums() default {};
}
