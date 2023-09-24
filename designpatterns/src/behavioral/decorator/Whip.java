package behavioral.decorator;

public class Whip extends CondimentDecorator{
    Beverage beverage;


    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "With Whip";
    }
}
