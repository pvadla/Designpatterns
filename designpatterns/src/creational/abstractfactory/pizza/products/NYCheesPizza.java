package creational.abstractfactory.pizza.products;

import creational.abstractfactory.pizza.ingredientFactory.PizzaIngredientFactory;

public class NYCheesPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public NYCheesPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public NYCheesPizza() {

        toppings.add("Toppings for cheese");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing : "+ name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
    }
}
