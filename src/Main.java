import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Menu();
    }

    public static void Menu(){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Press 1 for new entry%nPress 2 to see list%nPress 3 to delete entry%npress 4 to quit");
        int choice = scan.nextInt();
        switch (choice){
            case 1:

            break;
            case 2:

            break;
            case 3:

            break;
            case 4:

            break;
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