package creational.abstractfactory1;

public class IosUIFactory implements FlutterUIFactory{


    @Override
    public IosFLutterButton FlutterButton() {
        return new IosFLutterButton();
    }

    @Override
    public IosFlutterText FlutterText() {
        return new IosFlutterText();
    }
}
