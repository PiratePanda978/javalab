import java.util.Scanner;

public class q1 {

    public static int GCD(int n1,int n2){
        if(n1==0)
        return n2;
        if(n2==0)
        return n1;
        if(n1==n2)
        return n1;
        if(n1>n2)
        return GCD(n1-n2,n2);
        return GCD(n1,n2-n1);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = GCD(a,b);
        System.out.println("The greatest common divisor is : "+ans);
    }
}
