import java.util.Scanner;
public class shirts {
    int collar,sleeve;
    String s1 = "Cotton";

    public shirts(int n1,int n2){
        collar = n1;
        sleeve = n2;
    }

    public void display(){
        System.out.println("Collar\tSleeve\tMaterial");
        System.out.println("........................");
        System.out.println(collar+"\t"+sleeve+"\t"+s1);
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter collar length : ");
        int n1 = in.nextInt();
        System.out.println("Enter sleeve length : ");
        int n2 = in.nextInt();
        shirts obj = new shirts(n1,n2);
        obj.display();
    }
}
