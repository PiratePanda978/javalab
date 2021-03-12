import java.util.Scanner;
import java.io.*;

public class Student{
	
	public static void main(String[] args){
		
		Scanner in=new Scanner(System.in);
		
		int i;
		for(i=1;i<=5;i++)
		{
		int prac_mark,theory_mark;
		System.out.println("\nStudent "+i);
		System.out.println("Enter the lab and theory marks: ");
		
		prac_mark=in.nextInt();
		theory_mark=in.nextInt();
		
		int total_marks;
		total_marks=prac_mark+theory_mark;
		if(prac_mark>=15 && theory_mark>=15)
		{
			System.out.println("PASS");
			
			if(total_marks==39)
			{
				total_marks=40;
			}
			System.out.println("Total marks="+total_marks);
		}
		
		else if(total_marks<40)
		{
			System.out.println("FAIL");
		}
		
		else if(prac_mark<15 || theory_mark<15)
		{
			System.out.println("TECHNICAL FAIL");
			System.out.println("Total marks="+total_marks);
		}
		
		else
		{
			System.out.println("FAIL");
		}
		}
	}
}