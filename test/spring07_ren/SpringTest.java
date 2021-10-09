package spring07_ren;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test01() {
        String xml = "spring07_ren/applicationContext.xml";
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        //我们要拿主体
        People people = ac.getBean("people", People.class);
        people.PeoplechiWhat();
    }
}
