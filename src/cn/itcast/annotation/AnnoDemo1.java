package cn.itcast.annotation;

/**
 * 注解作用：
 * 1.编写文档：通过代码里标示的注解生成文档【javadoc】
 * 2.代码分析：通过代码里标示的注解对代码进行分析【使用反射】
 * 3.编译检查：通过代码里标示的注解能让编译器实现基本的编译检查【Override】
 */

/**
 * 注解Javadoc演示
 *
 * @author lin
 * @version 1.0
 * @since 1.5
 */
public class AnnoDemo1 {

    /**
     * 计算两数的和
     * @param a 整数
     * @param b 整数
     * @return 两数之和
     */

    public int add(int a,int b) {
        return a + b;
    }
}
