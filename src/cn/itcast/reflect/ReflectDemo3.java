package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo3 {

    /*
    class对象功能，
    1. 获取成员变量们
        * Field[] getField()  ：获取所有public修饰的成员变量
        * Field getField(String name)   ：获取指定名称的public修饰的成员变量

        * Field[] getDeclareFields()    :获取所有的成员变量，不考虑修饰符
        * Field getDeclareField(String name)
     2. 获取构造方法们
        * Constructor<?>[] getConstructors()
        * Constructor<T> getConstructors(类<?>... parameterTypes)

        * Constructor<T> getDeclareConstructor(类<?>... parameterTypes)
        * Constructor<?>[] getDeclareConstructors()

      3.获取成员方法们
        * Method[] getMethods()
        * Method getMethod(String name, 类<?>... parameterTypes)

        * Method[] getDeclareMethods()
        * Method getDeclareMethod(String name, 类<?>... parameterTypes)

      4. 获取类名
        * String getName()
     */

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {

        //0.获取Person的Class对象
        Class<Person> personClass = Person.class;
        /*
        2. 获取构造方法们
        * Constructor<?>[] getConstructors()
        * Constructor<T> getConstructors(类<?>... parameterTypes)

        * Constructor<T> getDeclareConstructor(类<?>... parameterTypes)
        * Constructor<?>[] getDeclareConstructors()
         */
        //1. Constructor<?>[] getConstructors()
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        //创建对象
        Person person = constructor.newInstance("张三", 23);
        System.out.println(person);

        System.out.println("====================================================================");

        //1. Constructor<?>[] getConstructors()
        Constructor constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        //创建对象
        Person person1 = constructor.newInstance();
        System.out.println(person1);

        Object o = personClass.newInstance();
        System.out.println(o);
    }
}
