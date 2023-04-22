package creational.factory.scalerexample;

import creational.factory.scalerexample.Dependencies.Query;

public abstract class Database {

    // the factory method
    abstract Query getQuery();

    void work(){
        System.out.println("Work Begins");

        Query query = getQuery();
        query.execute();

        System.out.println("Work Ends");
    }
}
