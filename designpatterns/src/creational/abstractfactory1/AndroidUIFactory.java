package creational.abstractfactory1;

public class AndroidUIFactory implements FlutterUIFactory{


    @Override
    public AndroidFlutterButton FlutterButton() {
        return new AndroidFlutterButton();
    }

    @Override
    public AndroidFlutterText FlutterText() {
        return new AndroidFlutterText();
    }
}
