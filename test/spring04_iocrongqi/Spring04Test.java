package spring04_iocrongqi;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;

/*
 * 容器由来：根据 刚刚的 工厂 模式 得出 ，一个项目中若有大量的对象
 * 那么 大量的对象需要管理， 如果管理更方便，使用 容器，把对象 统一处理
 *
 * Spring 中的容器  IOC
 * IOC 有个 思想： 控制反转，什么叫控制，我控制了你，你控制了我、 我如何才算能控制你，  你的出生， 使用，死亡.都归我管
 * 什么叫做 反转: 事情本来有A控制，现在变为B控制。
 * 反转：即：控制的主体  改变了！！
 * */
public class Spring04Test {
    /*
    * 传统的对象的 创建三种方式
    * 传统的对象 ，没有容器的统一管理
    * */
    @Test
    public void test01(){
        //因为 我们说 spring容器 是管理对象
        //对象 的创建 有几种方式呢?
        //传统的创建对象 有3种方式!

        //第一种:  new关键字
        Date date = new Date();  //1.创建对象方法
        System.out.println("date = " + date);
        System.out.println("============分隔符=============");
        //第二种：static 静态方法创建  静态工厂创建
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);
        System.out.println("============分隔符=============");
        //第三种：实例工厂创建
        Date time = calendar.getTime();
        System.out.println("time = " + time);
        System.out.println("以上就是 传统创建对象的3种方式");

        //传统的创建对象的 缺点：
        //1.控制权 在 哪里？   现在 在 test01 的方法中
        //2.对象创建的 执行顺序 有谁控制？

        //下面 使用 spring 如何 管理对象（创建，使用，销毁）
    }

    /*
    * 容器，作用域，生命周期
    * */
    @Test
    public void test02(){
        //1.加载 容器的 xml
        String xml = "spring04_iocrongqi/applicationContext.xml";
        //2. xml 文件一经加载，所有的对象都已经诞生了,这就和 传统的test01  创建对象不一样了.
        // 达到了 对象的 统一管理， 也就是对象的创建的 控制权 被 Spring拿走了
        //以前 是 new 出来的 对象，现在 是Spring通过反射 拿到了对象，这就是 控制权的改变 这就是控制反转
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        System.out.println("ac = " + ac);
        //如何 取得对象
        Date date = ac.getBean("date", Date.class);
        System.out.println("date = " + date);

        //作用域：测试 spring默认创建对象是否是单例模式
        Pc pc1 = ac.getBean("Pc", Pc.class);
        Pc pc2 = ac.getBean("Pc", Pc.class);
        System.out.println("pc1 = " + pc1);
        System.out.println("pc2 = " + pc2);
        System.out.println(pc1 == pc2);  //默认是 单例模式， ==为true,即：内存地址一样
        //加上scope="prototype" ==为 false
        ((ClassPathXmlApplicationContext) ac).close();  //关闭容器.

        //如果.生命周期中使用  原型模式看，那么无法调用 对象的 推毁方法， 所以少用 原型模式.

    }

}
