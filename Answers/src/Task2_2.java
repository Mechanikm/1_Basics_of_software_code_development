import java.util.Scanner;

// Найти max{min(a, b), min(c, d)}.

public class Task2_2 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println();
            System.out.print("Input a: ");
            int numberA = scan.nextInt();
            System.out.print("Input b: ");
            int numberB = scan.nextInt();
            System.out.print("Input c: ");
            int numberC = scan.nextInt();
            System.out.print("Input d: ");
            int numberD = scan.nextInt();

            int result = Math.max((Math.min(numberA, numberB)),(Math.min(numberC, numberD)));

            System.out.println();
            System.out.println("The result max{min(a, b), min(c, d) is " + result);
            System.out.println();
        }
    }
}