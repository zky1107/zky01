package spring07_ren;

public class People {
    public People() {
        System.out.println("人在容器中诞生了");
    }

    private ChiWhat chiwhat;

    public ChiWhat getChiwhat() {
        return chiwhat;
    }

    public void setChiwhat(ChiWhat chiwhat) {
        this.chiwhat = chiwhat;
    }

    public void PeoplechiWhat() {
        System.out.println("人吃什么的方法");
        chiwhat.chiwhat();
    }
}
