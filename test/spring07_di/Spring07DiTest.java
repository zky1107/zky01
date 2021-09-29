package spring07_di;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring07DiTest {
    @Test
    public void test01(){
        String xml = "spring06_di/applicationContext.xml";
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        //我们要拿主体
        People people = ac.getBean("people", People.class);
        people.play();
    }
}
