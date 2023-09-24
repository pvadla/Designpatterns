package creational.factory.pizza.creators;

import creational.factory.pizza.products.Pizza;

public abstract class PizzaStore {

    Pizza pizza;
    String type;



    public Pizza orderPizza(String type){
        pizza = createPizza(type);
        pizza.bake();

        return pizza;

    }

    public abstract Pizza createPizza(String type);
}
