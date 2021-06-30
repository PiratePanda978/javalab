import java.util.Scanner;
public class patient{
    int id,age,blood;

    public patient(){
        id=0;
        age=0;
        blood=0;
    }

    public patient(int a,int b,int c){
        id=a;
        age=b;
        blood=c;
    }

    public static int getId(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ID : ");
        int n1 = in.nextInt();
        return n1;
    }

    public static int getAge(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter age : ");
        int n1 = in.nextInt();
        return n1;
    }

    public static int getBlood(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Blood : ");
        int n1 = in.nextInt();
        return n1;
    }

    public void Display(){
        System.out.print("ID\tAge\tBlood\n");
        System.out.print(id+"\t"+age+"\t"+blood+"\n");
    }
}