package creational.abstractfactory.pizza.products;

import creational.abstractfactory.pizza.ingredientFactory.PizzaIngredientFactory;

public class ChicagoCheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public ChicagoCheesePizza() {

        toppings.add("Toppings for cheese");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing : "+ name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
    }

}
