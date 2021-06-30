import java.util.Scanner;
public class julian{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Julian Number : ");
        int jul = in.nextInt();
        int weekday = (jul+1)%7;
        switch(weekday){
            case 0 : 
            System.out.println("Julian day "+jul+" is a Sunday");
            break;
            case 1 : 
            System.out.println("Julian day "+jul+" is a Monday");
            break;
            case 2 : 
            System.out.println("Julian day "+jul+" is a Tuesday");
            break;
            case 3 : 
            System.out.println("Julian day "+jul+" is a Wednesday");
            break;
            case 4 : 
            System.out.println("Julian day "+jul+" is a Thursday");
            break;
            case 5 : 
            System.out.println("Julian day "+jul+" is a Friday");
            break;
            case 6 : 
            System.out.println("Julian day "+jul+" is a Saturday");
            break;
        }
    }
}
