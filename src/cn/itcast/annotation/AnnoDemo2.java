package cn.itcast.annotation;

import java.util.Date;

/**
 * JDK中预定义的一些注解
 *      *@Override:检测被该注解标注的方法是否继承自父类接口；
 *      *@Deprecated:该注解标注的内容已过时；
 *      *@SuppressWarnings:压制警告；一般传递参数“all” @SuppressWranings("all")
 */

@SuppressWarnings("all")
public class AnnoDemo2 {

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1() {
        //有缺陷,不推荐使用
    }

    public void show2() {
        //代替show1方法
    }

    public void demo() {
        show1();
        Date date = new Date();
    }


}
