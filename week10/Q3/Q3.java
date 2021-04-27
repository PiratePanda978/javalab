import java.io.*;
import java.util.Scanner;
class InvalidNumber extends Exception{
    InvalidNumber(String s){
        super(s);
    }
}
public class Q3{
    static void validate(int n) throws InvalidNumber{
        if(n!=101&&n!=105&&n!=108&&n!=115&&n!=125)
        throw new InvalidNumber("Item Number not valid.");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            File newFile = new File("Files/test3.txt");
            newFile.createNewFile();
            int n,i;
            FileWriter obj = new FileWriter("Files/test3.txt");
            obj.write("Item-Number Price\n");
            double d;
            for(i=0;i<5;i++){
                System.out.print("Item Number : ");
                n = in.nextInt();
                validate(n);
                System.out.print("Price : ");
                d = in.nextDouble();
                obj.write(n+"        "+d+"\n");
            }
            obj.close();
        }
        catch(InvalidNumber e){
            System.out.println(e);
        }
        catch(IOException s){
            System.out.println(s);
        }
    }
}