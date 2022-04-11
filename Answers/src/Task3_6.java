import java.util.Scanner;

// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Task3_6 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println();
            System.out.print("Input any character: ");
            
            String stringToChar = scan.next();
            char character = stringToChar.charAt(0); 
            
            System.out.println("Your input: " + character);
            System.out.println("Number for your character: " + Integer.valueOf(character));
        }
    }
}