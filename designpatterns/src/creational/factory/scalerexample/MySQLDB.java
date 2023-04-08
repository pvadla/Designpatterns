package creational.factory.scalerexample;

import creational.factory.scalerexample.Dependencies.MySQLQuery;
import creational.factory.scalerexample.Dependencies.Query;

public class MySQLDB extends Database {
    Query getQuery() {
        return new MySQLQuery();
    }
}
