package creational.factory;

public class Client {
    public static void main(String[] args) {
        MilkShakeFactory milkShakeFactory = new MilkShakeFactory();

        OreoMilkShake oreoMilkShake = (OreoMilkShake) milkShakeFactory.prepare(MilkShakeNames.MilkshakeName.OreoMilkshake);
        VanillaMilkShake vanillaMilkShake = (VanillaMilkShake) milkShakeFactory.prepare(MilkShakeNames.MilkshakeName.VannilaMilkshake);
        ButterScotchMilkShake butterScotchMilkShake = (ButterScotchMilkShake) milkShakeFactory.prepare(MilkShakeNames.MilkshakeName.ButterscotchMilkshake);

    }
}
