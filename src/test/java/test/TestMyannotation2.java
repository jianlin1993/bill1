package test;


import com.demo.bill1.annotation.MetaAnnotation;
import com.demo.bill1.annotation.Myannotation2;
import org.junit.Test;
import org.springframework.core.annotation.AnnotationUtils;

import java.lang.annotation.Annotation;

@Myannotation2(value="现在工程")
//@MetaAnnotation
public class TestMyannotation2 {

        @Test
        public void testAn(){
            Myannotation2 myannotation2=TestMyannotation2.class.getAnnotation(Myannotation2.class);
            Myannotation2 myannotationS= AnnotationUtils.findAnnotation(getClass(),Myannotation2.class);
            MetaAnnotation metaAnnotation=TestMyannotation2.class.getAnnotation(MetaAnnotation.class);
            Annotation a=myannotation2.getClass().getDeclaredAnnotation(MetaAnnotation.class);
            System.out.println("java获取注解");
            System.out.println(myannotation2.value());
            System.out.println(myannotation2.value1());
            System.out.println("spring获取注解");
            System.out.println(myannotationS.value());
            System.out.println(myannotationS.value1());
            System.out.println(metaAnnotation);
        }

//        Annotation [] annotations=myannotation2.getClass().getAnnotations();
//        for(Annotation ab:annotations){
//            System.out.println(ab);
//        }
//
////        System.out.println(annotations);
////        System.out.println(a);
//        System.out.println(metaAnnotation);




}
