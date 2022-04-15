import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа

public class Task3_8 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println();
            System.out.print("Input the first number: ");
            int firstNumber = scan.nextInt();
            System.out.print("Input the second number: ");
            int secondNumber = scan.nextInt();

            ArrayList<Integer> firstNumberArray = new ArrayList<>();
            ArrayList<Integer> secondNumberArray = new ArrayList<>();
            Set<Integer> matchNumbers = new HashSet<>();

            while (firstNumber != 0 && secondNumber != 0) {
                if (firstNumber != 0) {
                    firstNumberArray.add(firstNumber % 10);
                    firstNumber = firstNumber / 10;
                }
                if (secondNumber != 0) {
                    secondNumberArray.add(secondNumber % 10);
                    secondNumber = secondNumber / 10;
                }
            }

            for (int i = 0; i < firstNumberArray.size(); i++) {

                for (int j = 0; j < secondNumberArray.size(); j++) {
                    if (firstNumberArray.get(i) == secondNumberArray.get(j)) {
                        matchNumbers.add(firstNumberArray.get(i));
                    }
                }
            }

            for (int i = 0; i < matchNumbers.size(); i++) {
                System.out.println(matchNumbers);
            }
            if (matchNumbers.size() == 0) {
                System.out.println("There is no any matching");
            }
        }
    }
}