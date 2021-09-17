package Spring02ouhe;
// 工厂模式
// 使用工厂模式，代码更加灵活

//单例模式 ，已经经过6 种 常用2种
//面试官问：spring框架中 ，使用到了哪些设计模式！

public class FactoryBean {
    public static Usb getInstance(String beanName) {
        Usb usb = null;
        if (beanName.equals("MyTv")) {
            usb = new MyTv();
        } else if (beanName.equals("Computer")) {
            usb = new Computer();
        } else if (beanName.equals("Mp4")) {
            usb = new Mp4();
        }
        return usb;
        //结论： 大量new 对象是造成 耦合的关键 ， 那么 就需要一个框架 来解决 new 对象的 耦合
        //什么框架可以解决 这个呢？ 是Spring ，为什么spring可以解决 new对象的耦合呢？ --》 底层反射是可以的！！！
    }
}
