package structural.facade;

import java.sql.Connection;

public class HelperFacade {

    public static void generatereport(DBtypes dbtype, ReportTypes reportType, String tableName){
        Connection con = null;

        switch(dbtype){

            case MYSQL:
                    con = MySQLHelper.getMySQLDBConnection();
                    MySQLHelper mySQLHelper = new MySQLHelper();
                    switch (reportType){
                        case HTML:
                            mySQLHelper.MySQLHtmlReport(tableName,con);
                            break;
                        case PDF:
                            mySQLHelper.MySQLPdfReport(tableName,con);
                            break;
                    }

            case ORACLE:
                con = OracleHelper.getMyOracleDBConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportType){
                    case HTML:
                        oracleHelper.MyOracleHtmlReport(tableName,con);
                        break;
                    case PDF:
                        oracleHelper.MyOraclePdfReport(tableName,con);
                        break;
                }

        }



    }



    public static enum DBtypes{ MYSQL,ORACLE;}
    public static enum ReportTypes{ HTML,PDF;}
}
