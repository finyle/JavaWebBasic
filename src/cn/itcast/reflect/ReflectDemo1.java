package cn.itcast.reflect;

import cn.itcast.domain.Person;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.desktop.SystemSleepEvent;

public class ReflectDemo1 {

    /**
     * 获取Class对象的3中方式
     * 1.Class.forName("全类名“),将字节码文件加载进内存，返回Class对象；
     * 2.类名.class,通过类名的属性class获取；
     * 3.对象.getClass(),getClass()方法在Object类中定义
     */

    public static void main(String[] args) throws ClassNotFoundException {

        //1.Class.forName("全类名”)
        //多用于配置文件，将类名定义在配置文件中。读取文件，加载类
        Class cls1 = Class.forName("cn.itcast.domain.Person");
        System.out.println(cls1);
        //2.类名.class
        //多用于参数的传递
        Class cls2 = Person.class;
        System.out.println(cls2);
        //3.对象get.class()
        //多用于对象的获取字节码的方式
        Person p  = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        /**
         * 结论：同一个字节码文件（*.class)在一次程序运行过程中，只会被加载一次，不论通过那种方法得到的class对象都是同一个
         */
        System.out.println(cls1 == cls2); //True
        System.out.println(cls1 == cls3); //True
    }

}
