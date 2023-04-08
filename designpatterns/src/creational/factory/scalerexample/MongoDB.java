package creational.factory.scalerexample;

import creational.factory.scalerexample.Dependencies.MongoDBQuery;
import creational.factory.scalerexample.Dependencies.Query;

public class MongoDB extends Database {

    @Override
    Query getQuery() {
        return new MongoDBQuery();
    }
}
