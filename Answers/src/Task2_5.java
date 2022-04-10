import java.util.Scanner;

public class Task2_5 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println();
            System.out.print("Input X: ");
            double x = scan.nextDouble();
         
            double function;

            if (x <= 3) {
                function = x * x - 3 * x + 9;
            } else {
                function = 1 / (Math.pow(x, 3) + 6);
            }
            
            System.out.println("F(x) = " + function);
        }
    }
}