package creational.factory.scaler.Dependencies;

public class MySQLQuery implements Query{
    @Override
    public void execute() {
        System.out.println("Work done by d11");
    }
}
