import java.util.Scanner;

public class resistance{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length");
        double length = in.nextDouble();
        System.out.println("Enter diameter");
        double dia = in.nextDouble();
        System.out.println("Enter resistivity");
        double r = in.nextDouble();
        double rn = r*(4*length/3.14*dia*dia);
        System.out.println("The resistance is : "+rn);
    }
}