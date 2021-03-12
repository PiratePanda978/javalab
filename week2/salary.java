import java.util.Scanner;
public class salary
{
	public static void main(String[] args) {
	    int sal;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the salary");
        sal = in.nextInt();
	    for (int i=1; i<30; i++)
	    {
	        sal=2*sal;
	    }
		System.out.println(sal);
	}
}