package creational.factory.pizza.creators;

import creational.factory.pizza.creators.PizzaStore;
import creational.factory.pizza.products.ChicagoCheesePizza;
import creational.factory.pizza.products.Pizza;

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
