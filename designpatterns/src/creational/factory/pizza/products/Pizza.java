package creational.factory.pizza.products;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    ArrayList<String> toppings = new ArrayList<>();

    public void bake(){
        System.out.println("Baked");
    }
    public String getName(){
        return name;
    }




}
