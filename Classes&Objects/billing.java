import java.util.Scanner;
class billing{

    static double computeBill(int n1){
        double cost = n1+(0.08*n1);
        return cost;
    }

    static double computeBill(int n1,int n2){
        double cost = (n1*n2)+(n1*n2*0.08);
        return cost;
    }

    static double computeBill(int n1,int n2,int n3){
        double cost = (n1*n2);
        double discount = (n3*cost)/100;
        cost = cost - discount;
        double tax = 0.08*cost;
        cost = cost + tax;
        return cost;

    }



public static void main(String args[]){
    int n1,n2,n3;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the cost of book : ");
    n1 = in.nextInt();
    System.out.println("Enter the number of books : ");
    n2 = in.nextInt();
    System.out.println("Enter the coupon discount : ");
    n3 = in.nextInt();
    System.out.println("The cost of buying one book of "+n1+" cost is : "+computeBill(n1));
    System.out.println("The cost of buying "+n2+" books of "+n1+" cost is : "+computeBill(n1,n2));
    System.out.println("The cost of buying "+n2+" books of "+n1+" cost and "+n3+" discount is : "+computeBill(n1,n2,n3));
}
}