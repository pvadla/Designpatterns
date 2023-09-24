package creational.abstractfactory.pizza.creators;

import creational.abstractfactory.pizza.products.Pizza;

public abstract class PizzaStore {

    Pizza pizza;
    String type;



    public Pizza orderPizza(String type){
        pizza = createPizza(type);
        pizza.prepare();

        return pizza;

    }

    public abstract Pizza createPizza(String type);
}
