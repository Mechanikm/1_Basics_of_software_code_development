import java.util.Scanner;

/* Для каждого натурального числа в промежутке от m до n вывести все делители, 
кроме единицы и самого числа. m и n вводятся с клавиатуры.*/

public class Task3_7 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println();
            System.out.print("Input m: ");
            int firstNumber = scan.nextInt();
            System.out.print("Input n: ");
            int lastNumber = scan.nextInt();

            int count = 1;

            System.out.flush();
            for (int i = firstNumber; i <= lastNumber; i++) {
                System.out.print("For number " + i + " the dividers ");

                for (int j = 2; j < i; j++) {

                    if (i % j == 0) {
                        System.out.print(" " + j);
                        count += 1;
                    }
                }
                if (count == 0) {
                    System.out.print(" not avaible");
                }
                count = 0;
                System.out.println();
            }
        }
    }
}