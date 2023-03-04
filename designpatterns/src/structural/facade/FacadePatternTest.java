package structural.facade;

import java.sql.Connection;

public class FacadePatternTest {

    public static void main(String[] args) {

        //Without using Facade
        MySQLHelper mySQLHelper = new MySQLHelper();
        Connection con = mySQLHelper.getMySQLDBConnection();
        mySQLHelper.MySQLHtmlReport("test",con);


        //With using Facade
        //This code is pretty cleaner
        HelperFacade.generatereport(HelperFacade.DBtypes.MYSQL, HelperFacade.ReportTypes.HTML,"test");

    }
}
