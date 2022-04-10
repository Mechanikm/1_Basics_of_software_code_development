import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Task3_2 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println();
            System.out.print("Input start of line: ");
            double startLine = scan.nextDouble();
            System.out.print("Input finish of line: ");
            double finishLine = scan.nextDouble();
            System.out.print("Input interval: ");
            double interval = scan.nextDouble();
            
            List <Double> function = new ArrayList<>();
            
            for (double i = startLine; i <= finishLine; i+=interval) {
                if (i <= 2) {
                    function.add(-i);
                } else {
                    function.add(i);
                }
            }
            
            for (int i = 0; i < function.size(); i++) {
                System.out.println(function.get(i));
            }
        }
    }
}