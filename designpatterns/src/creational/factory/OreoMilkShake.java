package creational.factory;

public class OreoMilkShake implements MilkShake{
    String name;

    public OreoMilkShake(){
        this.name = MilkShakeNames.MilkshakeName.OreoMilkshake.toString();
    }


    public void print(){
        System.out.println("In oreo print");
    }

    @Override
    public String toString() {
        return "OreoMilkShake is getting ready{" +
                "name='" + name + '\'' +
                '}';
    }
}
