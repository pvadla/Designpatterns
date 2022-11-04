package creational.factory;

import java.util.HashMap;
import java.util.Map;

public class MilkShakeFactory {

    Map<MilkShakeNames.MilkshakeName, MilkShake> milkShakeMap = new HashMap<>();

    public MilkShakeFactory(){
        buildMilkShakes();
    }

    public MilkShake prepare(MilkShakeNames.MilkshakeName milkShake){
        if(milkShake == null){
            System.out.println("Please provide the milkshake");
            return null;
        }
        System.out.println(milkShake + " ready!");
        return milkShakeMap.get(milkShake);
    }

    private void buildMilkShakes() {
        milkShakeMap.put(MilkShakeNames.MilkshakeName.OreoMilkshake, new OreoMilkShake());
        milkShakeMap.put(MilkShakeNames.MilkshakeName.ButterscotchMilkshake, new ButterScotchMilkShake());
        milkShakeMap.put(MilkShakeNames.MilkshakeName.VannilaMilkshake, new VanillaMilkShake());
    }
}
