package test;

import com.demo.bill1.annotation.MetaAnnotation;
import com.demo.bill1.annotation.MyAnnotation;
import com.demo.bill1.penum.EumTrafficLamp;

@MyAnnotation(
        color="red",
        value="葬瞳飘血",
        arrayAttr={3,5,6},
        lamp= EumTrafficLamp.GREEN,
        annotationAttr=@MetaAnnotation("gacl")
)
public class TestAnnatation {

    public static void main(String[] args) {

        /**
         * 这里是检查Annotation类是否有注解，这里需要使用反射才能完成对Annotation类的检查
         */
        if(TestAnnatation.class.isAnnotationPresent(MyAnnotation.class)) {
            /**
             * 用反射方式获得注解对应的实例对象后，在通过该对象调用属性对应的方法
             * MyAnnotation是一个类，这个类的实例对象annotation是通过反射得到的，这个实例对象是如何创建的呢？
             * 一旦在某个类上使用了@MyAnnotation，那么这个MyAnnotation类的实例对象annotation就会被创建出来了
             */
            MyAnnotation annotation = (MyAnnotation) TestAnnatation.class.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.color());//输出color属性的默认值：red
            System.out.println(annotation.value());//输出value属性的默认值：孤傲苍狼
            System.out.println(annotation.arrayAttr().length);//这里输出的数组属性的长度的结果为：3，数组属性有三个元素，因此数组的长度为3
            System.out.println(annotation.lamp());//这里输出的枚举属性值为：GREEN
            System.out.println(annotation.annotationAttr().value());//这里输出的注解属性值:gacl

            MetaAnnotation ma = annotation.annotationAttr();//annotation是MyAnnotation类的一个实例对象
            System.out.println(ma.value());//输出的结果为：gacl
        }

        }


}
