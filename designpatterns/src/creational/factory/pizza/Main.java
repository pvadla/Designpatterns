package creational.factory.pizza;

import creational.factory.pizza.creators.ChicagoPizzaStore;
import creational.factory.pizza.creators.NYPizzaStore;
import creational.factory.pizza.creators.PizzaStore;
import creational.factory.pizza.products.Pizza;

public class Main {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        PizzaStore pizzaStore1 = new ChicagoPizzaStore();

        Pizza pizza = pizzaStore.orderPizza("Cheese");
        System.out.println(pizza.getName());

        Pizza pizza1 = pizzaStore1.orderPizza("Cheese");
        System.out.println(pizza1.getName());





    }
}
