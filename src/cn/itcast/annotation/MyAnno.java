package cn.itcast.annotation;

/**
 * 自定义注解：
 *      格式：元注解
 *           public @interface 注解名称{
 *               属性列表
 *           }
 *
 * 本质：注解本质上就是个接口，该接口默认继承：java.lang.annotation.Annotation接口
 *      public interface MyAnno extends java.lang.annotation.Annotation{}
 *
 * 属性：接口中可以定义的抽象方法
 *      要求：
 *          1.属性点返回值类型有下列取值
 *            *基本数据类型
 *            *String
 *            *枚举
 *            *注解
 *            *以上的数据类型
 *          2.定义了属性，在使用时需要给属性赋值
 *            *如果定义属性时，使用default关键字给属性默认初始化值，则使用注解时，可以不进行属性点赋值。
 *            *如果只有一个属性需要赋值，且属性名称是value，则value可省略，直接定义值即可。
 *            *数组赋值时，值使用{}包裹。如果数组中只有一个值，则{}省略
 *
 * 元注解：用于描述注解的注解
 *        *@Target:描述注解能够作用的位置；
 *        *@Retention:描述注解被保留的阶段；
 *        *@Documented:描述注解是否被抽取到api文档中；
 *        *@Inherited:描述注解是否被子类继承；
 *
 *
 * 在程序中（使用）解析注解：获取注解中定义的属性值
 *      1.获取注解定义的位置（Class, Method, Field)
 *      2.获取指定的注解
 *          *getAnnotation（Class）
 *     //其实就是在内存中生成了一个该注解接口的子类实现对象。
 *     public class ProImpl implements Pro{
 *         public String className(){
 *             return "cn.itcast.annotation.Demo1";
 *         }
 *         public String methodName(){
 *             return "show";
 *         }
 *     }
 *
 *      3.调用注解中的抽象方法获取配置的属性值。
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
public @interface MyAnno {

    int value();
//    String name(); //defalut "张三"
//    String show2();

    Person per();
    MyAnno2 anno2();

    String[] strs();

}
