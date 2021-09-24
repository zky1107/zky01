package spring04_iocrongqi;

public class Pc {
    //出生后的构造方法
    public Pc(){
        System.out.println("电脑无参构造，就是 对象 一诞生就会执行的方法，比如：人一诞生就会哭 ，这个哭就是构造方法");
        System.out.println("构造方法 是 对象一诞生就会执行的方法 ，一搬多用来 初始化自己的属性 ，如：颜色 ");
    }
    //初始化方法
    public void initShow(){
        System.out.println("电脑的初始化工作，一出生");
    }

    //对象的普通方法 周期中 ，成年中  打游戏
    public void playGame(){
        System.out.println("电脑的普通方法，用来打游戏");
    }

    //对象的死亡方法 ，参考过滤器
    public void destroyObj(){
        System.out.println("电脑中毒 死了，执行的方法");
    }
}
