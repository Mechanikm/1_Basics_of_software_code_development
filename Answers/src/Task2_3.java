import java.util.Scanner;

/* Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
Определить, будут ли они расположены на одной прямой */

public class Task2_3 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println();
            System.out.println("Input coordinates A");
            System.out.print("X: ");
            long coordinateX1 = scan.nextLong();
            System.out.print("Y: ");
            long coordinateY1 = scan.nextLong();
            System.out.println("Input coordinates B");
            System.out.print("X: ");
            long coordinateX2 = scan.nextLong();
            System.out.print("Y: ");
            long coordinateY2 = scan.nextLong();
            System.out.println("Input coordinates C");
            System.out.print("X: ");
            long coordinateX3 = scan.nextLong();
            System.out.print("Y: ");
            long coordinateY3 = scan.nextLong();

            if ((coordinateX2 - coordinateX1) / (coordinateX3 - coordinateX1) == (coordinateY2 - coordinateY1) / (coordinateY3 - coordinateY1)) {
                System.out.println();
                System.out.println("These three points lie on the same line");
            } else {
                System.out.println("These three points do not lie on the same line");
            }
        }
    }
}