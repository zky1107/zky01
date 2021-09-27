package spring06_di;
//我是手机对象 ，我是 次要的类 ，是被主体 人类来使用 ，来依赖的
public class Phone {
    public Phone(){
        System.out.println("手机对象诞生了");
    }
    public void game(){
        System.out.println("手机 打游戏");
    }
}
