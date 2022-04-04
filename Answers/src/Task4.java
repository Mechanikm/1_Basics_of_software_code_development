import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println();
            System.out.print("Input Number (like nnn.ddd): ");
            double number = scan.nextDouble();

            double fractionalPart = number %1;
            double wholePart = number - fractionalPart;

            double spare = Math.round(fractionalPart * 1000000 + wholePart);
            double answer = spare / 1000;
        
            System.out.println();
            System.out.println("You answer is: " + answer);
            System.out.println();
        }
    }
}