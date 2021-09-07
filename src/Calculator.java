import java.util.Random;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Random random = new Random();
        int ran1 = random.nextInt(100);
        int ran2 = random.nextInt(100);
        System.out.println("The two randomly generated numbers are: "
        + ran1 + ", "+ ran2);
        System.out.println("Please enter operation: +, *, -");
        Scanner scanner = new Scanner(System.in);
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
