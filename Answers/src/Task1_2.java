import java.util.Scanner;

public class Task1_2 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println();
            System.out.print("Input a: ");
            double a = scan.nextDouble();
            System.out.print("Input b: ");
            double b = scan.nextDouble();
            System.out.print("Input c: ");
            double c = scan.nextDouble();    
            
            double answer = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

            System.out.println();
            System.out.println("You code is: " + answer);
            System.out.println();
        }
    }
}