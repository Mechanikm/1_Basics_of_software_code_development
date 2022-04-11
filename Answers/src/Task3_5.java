import java.math.BigInteger;

public class Task3_5 {

    public static void main(String[] args) {

        BigInteger squareMultiply = new BigInteger("1");

        for (int i = 1; i <= 200; i++) {
            squareMultiply = squareMultiply.multiply(BigInteger.valueOf((long) (i * i)));
        }

        System.out.println("The multiply of squares is " + squareMultiply);
    }
}