package creational.abstractfactory.pizza.creators;

import creational.abstractfactory.pizza.ingredientFactory.NYIngredientFactory;
import creational.abstractfactory.pizza.ingredientFactory.PizzaIngredientFactory;
import creational.abstractfactory.pizza.products.NYCheesPizza;
import creational.abstractfactory.pizza.products.Pizza;

public class NYPizzaStore extends PizzaStore {

    PizzaIngredientFactory pizzaIngredientFactory = new NYIngredientFactory();


    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type == "Cheese"){
            pizza = new NYCheesPizza(pizzaIngredientFactory);
            pizza.setName("New york cheese pizza");
        }else if(type == "butter"){


        }
        return pizza;

    }
}
