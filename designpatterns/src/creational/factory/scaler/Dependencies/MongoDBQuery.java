package creational.factory.scaler.Dependencies;

public class MongoDBQuery implements Query{
    @Override
    public void execute() {
        System.out.println("Work done by D12");
    }
}
