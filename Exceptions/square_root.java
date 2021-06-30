import java.util.Scanner;

public class square_root {

    public static void main(String[] args) {
        double squareRootOfNumber = 0.0;
        double number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = in.nextDouble();
        squareRootOfNumber = Math.sqrt(number);
        if (number < 0) {
            throw new ArithmeticException("Can't take square root of negative number");
        }
        System.out.format("Square root of number entered is %.2f %n", squareRootOfNumber);
    }

}
