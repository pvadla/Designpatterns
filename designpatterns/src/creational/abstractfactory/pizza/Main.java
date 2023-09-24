package creational.abstractfactory.pizza;

import creational.abstractfactory.pizza.creators.ChicagoPizzaStore;
import creational.abstractfactory.pizza.creators.NYPizzaStore;
import creational.abstractfactory.pizza.creators.PizzaStore;
import creational.abstractfactory.pizza.products.Pizza;

public class Main {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        //PizzaStore pizzaStore1 = new ChicagoPizzaStore();

        Pizza pizza = pizzaStore.orderPizza("Cheese");
        System.out.println(pizza.getName());

//        Pizza pizza1 = pizzaStore1.orderPizza("Cheese");
//        System.out.println(pizza1.getName());





    }
}
