package spring06_di;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring06DiTest {
    //刚刚 是 以set 的方式注入的 ，这叫做 set 注入
    @Test
    public void test01(){
        String xml = "spring06_di/applicationContext.xml";
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        //我们要拿主体
        Person person = ac.getBean("person", Person.class);
        person.play();
    }
}
