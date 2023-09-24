package creational.abstractfactory.pizza.ingredientFactory;

public class ChicagoIngredientFactory implements PizzaIngredientFactory{


    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Sauce createSauce() {
        return new GreenSauce();
    }
}
