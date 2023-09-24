package behavioral.decorator;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println("Without Condiments : "+ beverage.getDescription() + ": " + beverage.cost());



        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        System.out.println("House Blend With Mocha Condiment: "+ beverage2.getDescription() + ": "+ beverage2.cost());
    }
}
