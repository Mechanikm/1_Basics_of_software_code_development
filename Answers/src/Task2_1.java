import java.util.Scanner;

/*Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.*/

public class Task2_1 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println();
            System.out.print("Input first angle: ");
            int firstAngle = scan.nextInt();
            System.out.print("Input second angle: ");
            int secondAngle = scan.nextInt();

            boolean isTriangleExist = false;
            boolean isTriangleRight = false;

            if (firstAngle > 0 && secondAngle > 0) {
                if (firstAngle + secondAngle < 180) {
                    isTriangleExist = true;
                    if (firstAngle == 90 || secondAngle == 90 || firstAngle + secondAngle == 90) {
                        isTriangleRight = true;
                    }
                }
            }

            System.out.println();
            System.out.println("Can the triangle exist? " + isTriangleExist);
            if (isTriangleRight) {
                System.out.println("And it is a right triangle!");
            }
            System.out.println();
        }
    }
}