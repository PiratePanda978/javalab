import java.util.Scanner;

public class parseDouble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num;
        try {
            System.out.print("Enter a number : ");
            num = Double.parseDouble(in.nextLine());
        } catch (NumberFormatException e) {
            num = 0;
            System.out.println("Invalid input. Number entered should be a number in double type");
        }
        System.out.println(num);
    }
}