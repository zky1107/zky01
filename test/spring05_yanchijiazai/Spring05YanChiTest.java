package spring05_yanchijiazai;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring05YanChiTest {
    @Test
    public void test01(){
        String xml = "spring05_yanchijiazai/applicationContext.xml";
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        System.out.println("ac = " + ac);  //是否出现 茶叶类的构造

        //lazy-init="true"  属性一加上 就是懒加载
    }
}
