import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class OneOptionSelectedForMenu {


    public static void oneOptionSelectedFromMenu(Connection connection, Scanner sc) {

        System.out.println("Enter name of the table :");
        String tableName = sc.next();

        System.out.println("How many columns do you want ");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");


        System.out.println("Choose columns :");
        int columnsCount = sc.nextInt();

        if(columnsCount == 1){

            columnOneSelected(tableName,sc,connection);

        } else if (columnsCount == 2) {

            columnTwoSelected(tableName,sc,connection);

        } else if (columnsCount == 3) {
            columnThreeSelected(tableName,sc,connection);

        } else if (columnsCount == 4) {
            columnFourSelected(tableName,sc,connection);
        } else{
            System.out.println("Invalid columns ");
            Main.displayMenuBar(sc);
        }





    }

    private static void columnThreeSelected(String tableName, Scanner sc, Connection connection) {
        System.out.println("Column 1");
        System.out.println("Datatype :");
        System.out.println("1. INT");
        System.out.println("2. FLOAT");
        System.out.println("3. VARCHAR");
        System.out.println("Choose");

        String columnOneDatatype = "";

        int columnOneDt = sc.nextInt();


        if(columnOneDt == 1){
            columnOneDatatype = "INT";
        } else if (columnOneDt == 2) {
            columnOneDatatype = "FLOAT";
        } else if (columnOneDt == 3){
            columnOneDatatype = "VARCHAR";
        }else {
            System.out.println("invalid choice ");
            Main.displayMenuBar(sc);
        }



        System.out.println("Enter column name :");
        String columnOneName = sc.next();

        System.out.println("Enter Size of column :");
        int columnOneSize = sc.nextInt();


        System.out.println("Column 2");
        System.out.println("Datatype :");
        System.out.println("1. INT");
        System.out.println("2. FLOAT");
        System.out.println("3. VARCHAR");
        System.out.println("Choose");

        String columntwoDatatype = "";

        int columntwoDt = sc.nextInt();


        if(columntwoDt == 1){
            columntwoDatatype = "INT";
        } else if (columntwoDt == 2) {
            columntwoDatatype = "FLOAT";
        } else if (columntwoDt == 3){
            columntwoDatatype = "VARCHAR";
        }else {
            System.out.println("invalid choice ");
            Main.displayMenuBar(sc);
        }



        System.out.println("Enter column name :");
        String columntwoName = sc.next();

        System.out.println("Enter Size of column :");
        int columntwoSize = sc.nextInt();


        System.out.println("Column 3");
        System.out.println("Datatype :");
        System.out.println("1. INT");
        System.out.println("2. FLOAT");
        System.out.println("3. VARCHAR");
        System.out.println("Choose");

        String columnthreeDatatype = "";

        int columnthreeDt = sc.nextInt();


        if(columnthreeDt == 1){
            columnthreeDatatype = "INT";
        } else if (columnthreeDt == 2) {
            columnthreeDatatype = "FLOAT";
        } else if (columnthreeDt == 3){
            columnthreeDatatype = "VARCHAR";
        }else {
            System.out.println("invalid choice ");
            Main.displayMenuBar(sc);
        }



        System.out.println("Enter column name :");
        String columnthreeName = sc.next();

        System.out.println("Enter Size of column :");
        int columnthreeSize = sc.nextInt();

        String createQueryFor1 = "CREATE TABLE " + tableName + " (" + columnOneName + " " + columnOneDatatype + "(" + columnOneSize + "),"+columntwoName+ " "+columntwoDatatype+"("+columntwoSize+"),"+columnthreeName+ " "+columnthreeDatatype+"("+columnthreeSize+"));";



        try(PreparedStatement preparedStatement1 = connection.prepareStatement(createQueryFor1)){

            preparedStatement1.execute();
            System.out.println("Table created ");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    private static void columnFourSelected(String tableName, Scanner sc, Connection connection) {

        System.out.println("Column 1");
        System.out.println("Datatype :");
        System.out.println("1. INT");
        System.out.println("2. FLOAT");
        System.out.println("3. VARCHAR");
        System.out.println("Choose");

        String columnOneDatatype = "";

        int columnOneDt = sc.nextInt();


        if(columnOneDt == 1){
            columnOneDatatype = "INT";
        } else if (columnOneDt == 2) {
            columnOneDatatype = "FLOAT";
        } else if (columnOneDt == 3){
            columnOneDatatype = "VARCHAR";
        }else {
            System.out.println("invalid choice ");
            Main.displayMenuBar(sc);
        }



        System.out.println("Enter column name :");
        String columnOneName = sc.next();

        System.out.println("Enter Size of column :");
        int columnOneSize = sc.nextInt();


        System.out.println("Column 2");
        System.out.println("Datatype :");
        System.out.println("1. INT");
        System.out.println("2. FLOAT");
        System.out.println("3. VARCHAR");
        System.out.println("Choose");

        String columntwoDatatype = "";

        int columntwoDt = sc.nextInt();


        if(columntwoDt == 1){
            columntwoDatatype = "INT";
        } else if (columntwoDt == 2) {
            columntwoDatatype = "FLOAT";
        } else if (columntwoDt == 3){
            columntwoDatatype = "VARCHAR";
        }else {
            System.out.println("invalid choice ");
            Main.displayMenuBar(sc);
        }



        System.out.println("Enter column name :");
        String columntwoName = sc.next();

        System.out.println("Enter Size of column :");
        int columntwoSize = sc.nextInt();


        System.out.println("Column 3");
        System.out.println("Datatype :");
        System.out.println("1. INT");
        System.out.println("2. FLOAT");
        System.out.println("3. VARCHAR");
        System.out.println("Choose");

        String columnthreeDatatype = "";

        int columnthreeDt = sc.nextInt();


        if(columnthreeDt == 1){
            columnthreeDatatype = "INT";
        } else if (columnthreeDt == 2) {
            columnthreeDatatype = "FLOAT";
        } else if (columnthreeDt == 3){
            columnthreeDatatype = "VARCHAR";
        }else {
            System.out.println("invalid choice ");
            Main.displayMenuBar(sc);
        }



        System.out.println("Enter column name :");
        String columnthreeName = sc.next();

        System.out.println("Enter Size of column :");
        int columnthreeSize = sc.nextInt();



        System.out.println("Column 4");
        System.out.println("Datatype :");
        System.out.println("1. INT");
        System.out.println("2. FLOAT");
        System.out.println("3. VARCHAR");
        System.out.println("Choose");

        String columnfourDatatype = "";

        int columnfourDt = sc.nextInt();


        if(columnfourDt == 1){
            columnfourDatatype = "INT";
        } else if (columnfourDt == 2) {
            columnfourDatatype = "FLOAT";
        } else if (columnfourDt == 3){
            columnfourDatatype = "VARCHAR";
        }else {
            System.out.println("invalid choice ");
            Main.displayMenuBar(sc);
        }



        System.out.println("Enter column name :");
        String columnfourName = sc.next();

        System.out.println("Enter Size of column :");
        int columnfourSize = sc.nextInt();

        String createQueryFor1 = "CREATE TABLE " + tableName + " (" + columnOneName + " " + columnOneDatatype + "(" + columnOneSize + "),"+columntwoName+ " "+columntwoDatatype+"("+columntwoSize+"),"+columnthreeName+ " "+columnthreeDatatype+"("+columnthreeSize+"),"+columnfourName+" "+columnfourDatatype+"("+columnfourSize+"));";



        try(PreparedStatement preparedStatement1 = connection.prepareStatement(createQueryFor1)){

            preparedStatement1.execute();
            System.out.println("Table created ");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }



    }

    private static void columnTwoSelected(String tableName, Scanner sc, Connection connection) {

        System.out.println("Column 1");
        System.out.println("Datatype :");
        System.out.println("1. INT");
        System.out.println("2. FLOAT");
        System.out.println("3. VARCHAR");
        System.out.println("Choose");

        String columnOneDatatype = "";

        int columnOneDt = sc.nextInt();


        if(columnOneDt == 1){
            columnOneDatatype = "INT";
        } else if (columnOneDt == 2) {
            columnOneDatatype = "FLOAT";
        } else if (columnOneDt == 3){
            columnOneDatatype = "VARCHAR";
        }else {
            System.out.println("invalid choice ");
            Main.displayMenuBar(sc);
        }



        System.out.println("Enter column name :");
        String columnOneName = sc.next();

        System.out.println("Enter Size of column :");
        int columnOneSize = sc.nextInt();


        System.out.println("Column 2");
        System.out.println("Datatype :");
        System.out.println("1. INT");
        System.out.println("2. FLOAT");
        System.out.println("3. VARCHAR");
        System.out.println("Choose");

        String columntwoDatatype = "";

        int columntwoDt = sc.nextInt();


        if(columntwoDt == 1){
            columntwoDatatype = "INT";
        } else if (columntwoDt == 2) {
            columntwoDatatype = "FLOAT";
        } else if (columntwoDt == 3){
            columntwoDatatype = "VARCHAR";
        }else {
            System.out.println("invalid choice ");
            Main.displayMenuBar(sc);
        }



        System.out.println("Enter column name :");
        String columntwoName = sc.next();

        System.out.println("Enter Size of column :");
        int columntwoSize = sc.nextInt();

        String createQueryFor1 = "CREATE TABLE " + tableName + " (" + columnOneName + " " + columnOneDatatype + "(" + columnOneSize + "),"+columntwoName+ " "+columntwoDatatype+"("+columntwoSize+")"+")";



        try(PreparedStatement preparedStatement1 = connection.prepareStatement(createQueryFor1)){

            preparedStatement1.execute();
            System.out.println("Table created ");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }


    }

    private static void columnOneSelected(String tableName,Scanner sc,Connection connection) {
        System.out.println("Column 1");
        System.out.println("Datatype :");
        System.out.println("1. INT");
        System.out.println("2. FLOAT");
        System.out.println("3. VARCHAR");
        System.out.println("Choose");

        String columnDatatype = "";

        int columnOneDt = sc.nextInt();


        if(columnOneDt == 1){
            columnDatatype = "INT";
        } else if (columnOneDt == 2) {
            columnDatatype = "FLOAT";
        } else if (columnOneDt == 3){
            columnDatatype = "VARCHAR";
        }else {
            System.out.println("invalid choice ");
            Main.displayMenuBar(sc);
        }



        System.out.println("Enter column name :");
        String columnOneName = sc.next();

        System.out.println("Enter Size of column :");
        int columnOneSize = sc.nextInt();

//            String createQueryFor1 = "Create table "+ tableName+"("+columnDatatype+ " "+columnOneName+"("+columnOneSize+"));";
        String createQueryFor1 = "CREATE TABLE " + tableName + " (" + columnOneName + " " + columnDatatype + "(" + columnOneSize + "))";



        try(PreparedStatement preparedStatement1 = connection.prepareStatement(createQueryFor1)){

            preparedStatement1.execute();
            System.out.println("Table created ");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
