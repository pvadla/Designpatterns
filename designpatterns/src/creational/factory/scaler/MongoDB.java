package creational.factory.scaler;

import creational.factory.scaler.Dependencies.MongoDBQuery;
import creational.factory.scaler.Dependencies.Query;

public class MongoDB extends Database {

    @Override
    Query getQuery() {
        return new MongoDBQuery();
    }
}
