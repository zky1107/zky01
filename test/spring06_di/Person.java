package spring06_di;
//人 是我们 的主题 ，主要的类 ，他需要依赖 手机
public class Person {

    public Person(){
        System.out.println("人在容器中诞生了");
    }

    private Phone phone; //人 依赖了手机 ，所以 人就拥有了手机
    private Psp Psp; //人 依赖了手机 ，所以 人就拥有了手机
    private PlayGame PlayGame ; //人 依赖了手机 ，所以 人就拥有了手机

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {  //set 是暴漏给别人看的， 让别人给你东西的
        this.phone = phone;
    }

    public void play(){
        System.out.println("人玩的方法");
        phone.game();  //调用

    }
}
