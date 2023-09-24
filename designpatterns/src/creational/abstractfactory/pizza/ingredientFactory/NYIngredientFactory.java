package creational.abstractfactory.pizza.ingredientFactory;

public class NYIngredientFactory implements PizzaIngredientFactory{


    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Sauce createSauce() {
        return new RedSauce();
    }
}
