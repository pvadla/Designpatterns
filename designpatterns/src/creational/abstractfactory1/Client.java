package creational.abstractfactory1;

public class Client {

    public static void main(String[] args) {

        FlutterPage fp = new LoginUser();

        fp.setUiFactory(new IosUIFactory());

        Button b = fp.getUiFactory().FlutterButton();

        System.out.println(b.setLayout());

        System.out.println(fp.setPage());





    }










}
