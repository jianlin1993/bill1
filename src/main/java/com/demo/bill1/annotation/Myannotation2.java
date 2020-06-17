package com.demo.bill1.annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.METHOD, ElementType.TYPE })
@MetaAnnotation
public @interface Myannotation2 {
    MetaAnnotation value1() default @MetaAnnotation("默认");

    @AliasFor(annotation =MetaAnnotation.class)
    String value() ;


}
