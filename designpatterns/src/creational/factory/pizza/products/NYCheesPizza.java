package creational.factory.pizza.products;

import creational.factory.pizza.products.Pizza;

public class NYCheesPizza extends Pizza {

    public NYCheesPizza() {

        name = "New York Cheese Pizza";
        dough = "New York dough";

        toppings.add("Toppings for cheese");
    }
}
