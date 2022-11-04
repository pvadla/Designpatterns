package creational.factory;

public class VanillaMilkShake implements MilkShake{
    String name;

    @Override
    public String toString() {
        return "VanillaMilkShake{" +
                "name='" + name + '\'' +
                '}';
    }
}
