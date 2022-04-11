public class Task3_3 {

    public static void main(String[] args) {

        int squareSum = 0;

        for (int i = 1; i <= 100; i++) {
            squareSum += i * i;
        }

        System.out.println("The sum of squares is " + squareSum);
    }
}