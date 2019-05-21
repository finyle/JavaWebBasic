package cn.itcast.test;

import cn.itcast.junit.Calculater;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculaterTest {

    /**
     * 初始化方法
     * 用于资源申请，所有测试方法在执行前都会执行该方法
     */
    @Before
    public void init() {
        System.out.println("init...");
    }

    /**
     * 释放资源方法
     * 在所有测试方法执行完后，都会自动执行该方法
     */
    @After
    public void close() {
        System.out.println("close...");
    }

    /**
     * 加法测试
     */
    @Test
    public void testAdd() {
        //System.out.println("已执行");
        //创建对象
        Calculater c = new Calculater();
        //调用方法
        int result = c.add(1,2);
        System.out.println("testAdd...");
        //System.out.println(result);

        //断言 断言结果为3
        Assert.assertEquals(3,result);

    }
}
