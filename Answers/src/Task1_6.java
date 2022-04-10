import java.util.Scanner;

/*Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае*/

public class Task1_6 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println();
            System.out.print("Input x-coordinate: ");
            int x = scan.nextInt();
            System.out.print("Input y-coordinate: ");
            int y = scan.nextInt();

            boolean isDotInside = (Math.abs(x) <= 2 && (y <= 4 && y >= 0)) || (Math.abs(x) <= 4 && (y <= 0 && y >= -3));

            System.out.println();
            System.out.println("Is the dot lay inside the figure? " + isDotInside);
            System.out.println();
        }
    }
}