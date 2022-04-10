import java.util.Scanner;

/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.*/

public class Task1_5 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println();
            System.out.print("Input duration: ");
            int duration = scan.nextInt();

            int remainder = duration % 3600;
            int hours = (duration - remainder) / 3600;
            int seconds = remainder % 60;
            int minutes = (remainder - seconds) / 60;
        
            System.out.println();
            System.out.println("Time: " + hours + "h " + minutes + "m " + seconds + "s");
            System.out.println();
        }
    }
}