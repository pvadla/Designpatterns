package creational.abstractfactory1;

abstract class FlutterPage {

    private FlutterUIFactory uiFactory;


    public FlutterUIFactory getUiFactory() {
        return uiFactory;
    }

    public void setUiFactory(FlutterUIFactory uiFactory) {
        this.uiFactory = uiFactory;
    }

    public FlutterPage() {

    }


    abstract String setPage();
}
