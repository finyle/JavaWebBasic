package cn.itcast.reflect;

import cn.itcast.domain.Person;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Field;
import java.sql.SQLOutput;

public class ReflectDemo2 {

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

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        //0.获取Person的Class对象
        Class personClass = Person.class;
        /*
        1. 获取成员变量们
        * Field[] getFields()
        * Field getField(String name)

        * Field[] getDeclareFields()
        * Field getDeclareField(String name)
         */
        //1. Field[] getFields()
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println(".........................");
        //2. Field getField(String name)
        Field a = personClass.getField("a");
        //获取成员变量的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        //设置a的值
        a.set(p,"张三");
        System.out.println(p);

        System.out.println(".........................");

        //Field[] getDeclareFields()
        Field[] declarefields = personClass.getDeclaredFields();
        for (Field declarefield : declarefields) {
            System.out.println(declarefield);
        }
        //Field getDeclareField(String name)
        Field d = personClass.getDeclaredField("d");



    }
}
