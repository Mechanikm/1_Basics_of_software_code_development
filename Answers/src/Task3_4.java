public class Task3_4 {

    public static void main(String[] args) {

        double squareMultiply = 1L;

        for (int i = 1; i <= 200; i++) {
            squareMultiply *= (double)(i * i);
        }

        System.out.println("The multiply of squares is " + squareMultiply);
    }
}