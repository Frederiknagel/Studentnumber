import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Press 1 for new entry%nPress 2 to see list%nPress 3 to delete entry%npress 4 to quit");
        System.out.println();
        try{
        int choice = scan.nextInt();
            switch (choice) {
                case 1:

                break;
                case 2:

                break;
                case 3:

                break;
                case 4:
                    System.out.println("Thank you for using our program");
                    System.exit(0);
                break;
                default:
                    System.out.println("please only choose one of the following");
                    menu();
            }
        } catch(Exception inputMismatch){
            System.out.println("please only choose one of the following");
            menu();
        }
    }
    public static void writeTofile(String [] studentList) {
        try {
            PrintStream output = new PrintStream(new File("studentList.txt"));
            output.print
        } catch(Exception inputMismatch) {
            //test
        }
    }


}