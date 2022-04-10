import java.util.Arrays;
import java.util.Scanner;

/* Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
Определить, пройдет ли кирпич через отверстие. */

public class Task2_4 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println();
            System.out.print("Input height of hole: ");
            int holeHeight = scan.nextInt();
            System.out.print("Input width of hole: ");
            int holeWidth = scan.nextInt();
            System.out.print("Input brick height: ");
            int brickHeight = scan.nextInt();
            System.out.print("Input brick width: ");
            int brickWidth = scan.nextInt();
            System.out.print("Input brick length: ");
            int brickLength = scan.nextInt();

            int[] brickSizes = {brickHeight, brickWidth, brickLength};
            Arrays.sort(brickSizes);

            if (brickSizes[0] <= Math.min(holeHeight, holeWidth) && brickSizes[1] <= Math.max(holeHeight, holeWidth)) {
                System.out.println();
                System.out.println("The brick will pass through the hole");
            } else {
                System.out.println("The brick will not pass through the hole");
            }
        }
    }
}