package structural.facade;

import java.sql.Connection;

public class MySQLHelper {

    public static Connection getMySQLDBConnection(){
        return null;
    }

    public void MySQLPdfReport(String tablename, Connection con){
        //get data from table and generate pdf report
    }

    public void MySQLHtmlReport(String tablename, Connection con){
        //get data from table and generate html report
    }
}
