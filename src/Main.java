import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/DatabaseManipulation";

    private static final String username = "root";
    private static final String password = "vruhirapsh9981";



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(URL,username,password);

            int menuOptionSelected =  displayMenuBar(sc);


            if(menuOptionSelected == 1){
                OneOptionSelectedForMenu.oneOptionSelectedFromMenu(connection,sc);
            } else if (menuOptionSelected == 2) {
                DataManipulation.twoOptionSelectedFromMenu(connection,sc);
            } else if (menuOptionSelected == 3) {
                DataManipulation.threeOptionSelectedFromMenu(connection,sc);
            } else if (menuOptionSelected == 4) {
                DataManipulation.fourOptionSelectedFromMenu(connection,sc);
            } else if (menuOptionSelected == 5) {
                DataManipulation.fiveOptionSelectedFromMenu(connection,sc);
            } else if (menuOptionSelected == 6) {
                DataManipulation.sixOptionSelectedFromMenu(connection,sc);
            } else if (menuOptionSelected == 7) {
                DataManipulation.sevenOptionSelectedFromMenu(connection,sc);
            }else {
                System.out.println("Invalid Choice");
                displayMenuBar(sc);
            }


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }




    public static int displayMenuBar(Scanner sc) {

        System.out.println("DATABASE MENU");
        System.out.println("1. CREATE Table");
        System.out.println("2. INSERT Row");
        System.out.println("3. UPDATE Row");
        System.out.println("4. DELETE Row");
        System.out.println("5. FETCH ALL DATA Table");
        System.out.println("6. DROP Table");
        System.out.println("7. EXIT");

        System.out.println("Enter your choice");
        int menuOptionSelected = sc.nextInt();

        return menuOptionSelected;


    }
}



















