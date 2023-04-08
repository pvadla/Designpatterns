package creational.factory.scaler;
import creational.factory.scaler.Dependencies.*;
import creational.factory.scaler.Dependencies.Query;


public class MySQLDB extends Database {
    Query getQuery() {
        return new MySQLQuery();
    }
}
