package cn.itcast.junit;

public class CalculaterTest {

    public static void main(String[] args) { 

        //创建对象
        Calculater c = new Calculater();
        //调用方法
//        int result = c.add( 1, 2);
//        System.out.println(result);

        int result = c.sub( 3,2);
        System.out.println(result);
    }
}
