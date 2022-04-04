import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println();
            System.out.print("Input x (in degrees): ");
            double x = Math.toRadians(scan.nextDouble());
            System.out.print("Input y (in degrees): ");
            double y = Math.toRadians(scan.nextDouble());
            double answer = (Math.sin(x) + Math.cos(y)) / (Math.cos(y) - Math.sin(x)) * Math.tan(x * y);
        
            System.out.println();
            System.out.println("You answer is: " + answer);
            System.out.println();
        }
    }
}