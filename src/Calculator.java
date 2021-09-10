import java.util.Random;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        // Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int ran1 = Integer.valueOf(scanner.nextLine());
        int ran2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Please enter operation: +, *, -");

        String input = scanner.nextLine();

        System.out.print("The result is: ");

        if (input.equals("+")) {
            System.out.println(ran1 + ran2);
        }

        if (input.equals("*")) {
            System.out.println(ran1 * ran2);
        }

        if (input.equals("-")) {
            System.out.println(ran1 - ran2);
        }


    }


}
