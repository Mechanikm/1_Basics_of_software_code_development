import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println();
            System.out.print("Input a: ");
            double a = scan.nextDouble();
            System.out.print("Input b: ");
            double b = scan.nextDouble();
            System.out.print("Input c: ");
            double c = scan.nextDouble();    
            
            double z = ( (a - 3 ) * b / 2) + c;
            System.out.println();
            System.out.println("( (a - 3 ) * b / 2) + c = " + z);
        }
        System.out.println();
    }
}