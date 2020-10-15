import restaurant.*;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class Main {
    private static int numDays = 0;
    private static int numRolls = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of days for the restaurant to operate: ");
        numDays = sc.nextInt();
        System.out.println("Enter a number of Rolls for the restaurant to start their inventory with: ");
        numRolls = sc.nextInt();
        sc.close();

        PrintStream fileName;
        try {
            fileName = new PrintStream("output.txt");
            System.setOut(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Restaurant ourRestaurant = new Restaurant(numDays, numRolls);
    }
}