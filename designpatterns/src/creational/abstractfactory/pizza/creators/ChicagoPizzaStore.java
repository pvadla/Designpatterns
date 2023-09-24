package creational.abstractfactory.pizza.creators;

import creational.abstractfactory.pizza.products.ChicagoCheesePizza;
import creational.abstractfactory.pizza.products.Pizza;

public class ChicagoPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {

        if(type == "Cheese"){
            pizza = new ChicagoCheesePizza();
        }else if(type == "butter"){


        }
        return pizza;


    }
}
