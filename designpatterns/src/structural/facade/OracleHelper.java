package structural.facade;

import java.sql.Connection;

public class OracleHelper {

    public static Connection getMyOracleDBConnection(){
        return null;
    }

    public void MyOraclePdfReport(String tablename, Connection con){
        //get data from table and generate pdf report
    }

    public void MyOracleHtmlReport(String tablename, Connection con){
        //get data from table and generate html report
    }
}
