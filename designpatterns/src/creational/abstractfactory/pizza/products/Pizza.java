package creational.abstractfactory.pizza.products;

import creational.abstractfactory.pizza.ingredientFactory.Dough;
import creational.abstractfactory.pizza.ingredientFactory.Sauce;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public abstract void prepare();

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }




}
