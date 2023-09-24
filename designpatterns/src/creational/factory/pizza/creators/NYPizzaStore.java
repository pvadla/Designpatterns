package creational.factory.pizza.creators;

import creational.factory.pizza.creators.PizzaStore;
import creational.factory.pizza.products.NYCheesPizza;
import creational.factory.pizza.products.Pizza;

public class NYPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {

        if(type == "Cheese"){
           return new NYCheesPizza();
        }else if(type == "butter"){


        }
        return null;

    }
}
