import java.io.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int n, i, j;
        j = 0;
        char c;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of characters : ");
        n = in.nextInt();
        try {
            File obj1 = new File("Files/test2.txt");
            obj1.createNewFile();
            System.out.println("\nReading Characters : ");
            FileWriter obj2 = new FileWriter("Files/test2.txt");
            for (i = 0; i < n; i++) {
                System.out.print("Enter character " + i + " : ");
                c = in.next().charAt(0);
                obj2.append(c);
            }
            obj2.close();
            System.out.println("\nWriting Characters : ");
            FileReader obj3 = new FileReader("Files/test2.txt");
            while ((i = obj3.read()) != -1) {
                System.out.println("Character at " + j + " : " + Character.toUpperCase((char) i));
                j++;
            }
            obj3.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
