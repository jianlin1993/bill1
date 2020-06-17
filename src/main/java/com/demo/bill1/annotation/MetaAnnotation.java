package com.demo.bill1.annotation;


import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.METHOD, ElementType.TYPE })
public @interface MetaAnnotation {
    String value() default "初始化";//元注解MetaAnnotation设置有一个唯一的属性value
}
