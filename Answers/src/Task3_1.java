import java.util.Scanner;

public class Task3_1 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println();
            System.out.print("Input any number: ");
            long number = scan.nextLong();
         
            long sum = 0;

            for (int i = 1; i <= number; i++) {
                sum+=i;
            }
            
            System.out.println("Sum of all numbers from 1 to your number is " + sum);
        }
    }
}