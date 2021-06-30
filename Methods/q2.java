import java.util.Scanner;
public class q2 {

    public static int lengthOf(long n){
        int c=0;
        while(n!=0){
            n=n/10;
            c++;
        }
        return c;
    }

    public static boolean isValidTicket(long n){
        int length = lengthOf(n);
        if(length!=10 && length!=11)
        return false;
        else if(length==10){
            n = (n*10)+(n%7);
            System.out.println("The valid ticket number is : "+n);
            return true;
        }
        else{
            long last = n%10;
            n = n/10;
            long rem = n%7;
            if(rem==last)
            return true;
            return false;
        }
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        long a = in.nextLong();
        boolean b1 = isValidTicket(a);
        System.out.println(b1);
    }
}
