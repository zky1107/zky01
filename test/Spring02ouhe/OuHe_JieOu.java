package Spring02ouhe;

public class OuHe_JieOu {
    public static Usb getInstance(String s){

        Usb usb =null;
        try {
            Class<Usb> aclass = (Class<Usb>) Class.forName(s);
            usb = aclass.newInstance();
            System.out.println("aclass = " + aclass);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return (Usb) usb;
    }
}
