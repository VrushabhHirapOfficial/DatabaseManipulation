import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class DataManipulation {

    public static void sevenOptionSelectedFromMenu(Connection connection, Scanner sc) {
    }

    public static void sixOptionSelectedFromMenu(Connection connection, Scanner sc) {
    }

    public static void fiveOptionSelectedFromMenu(Connection connection, Scanner sc) {
    }

    public static void fourOptionSelectedFromMenu(Connection connection, Scanner sc) {
    }

    public static void threeOptionSelectedFromMenu(Connection connection, Scanner sc) {
    }

    public static void twoOptionSelectedFromMenu(Connection connection, Scanner sc) {
    }

//    public static void oneOptionSelectedFromMenu(Connection connection, Scanner sc) {
//
//        System.out.println("Enter name of the table :");
//        String tableName = sc.next();
//
//        System.out.println("How many columns do you want ");
//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        System.out.println("4");
//
//
//        System.out.println("Choose columns :");
//        int columnsCount = sc.nextInt();
//
//        if(columnsCount == 1){
//
//            columnOneSelected(tableName,sc,connection);
//
//        }else{
//            System.out.println("Invalid columns ");
//            Main.displayMenuBar(sc);
//        }
//
//
//
//
//
//    }
//
//    private static void columnOneSelected(String tableName,Scanner sc,Connection connection) {
//        System.out.println("Column 1");
//        System.out.println("Datatype :");
//        System.out.println("1. INT");
//        System.out.println("2. FLOAT");
//        System.out.println("3. VARCHAR");
//        System.out.println("Choose");
//
//        String columnDatatype = "";
//
//        int columnOneDt = sc.nextInt();
//
//
//        if(columnOneDt == 1){
//            columnDatatype = "INT";
//        } else if (columnOneDt == 2) {
//            columnDatatype = "FLOAT";
//        } else if (columnOneDt == 3){
//            columnDatatype = "VARCHAR";
//        }else {
//            System.out.println("invalid choice ");
//            Main.displayMenuBar(sc);
//        }
//
//
//
//        System.out.println("Enter column name :");
//        String columnOneName = sc.next();
//
//        System.out.println("Enter Size of column :");
//        int columnOneSize = sc.nextInt();
//
////            String createQueryFor1 = "Create table "+ tableName+"("+columnDatatype+ " "+columnOneName+"("+columnOneSize+"));";
//        String createQueryFor1 = "CREATE TABLE " + tableName + " (" + columnOneName + " " + columnDatatype + "(" + columnOneSize + "))";
//
//
//
//        try(PreparedStatement preparedStatement1 = connection.prepareStatement(createQueryFor1)){
//
//            preparedStatement1.execute();
//            System.out.println("Table created ");
//
//        }catch (SQLException e){
//            System.out.println(e.getMessage());
//        }
//
//    }
}
