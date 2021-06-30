import java.io.*;
import java.util.Scanner;

class InvalidNumber extends Exception {
    InvalidNumber(String s) {
        super(s);
    }
}

class Record implements Serializable{
    private int n;
    private double d;
    Record(int n,double d){
        this.n = n;
        this.d = d;
    }
    @Override
    public String toString(){
        return "Item Number : "+n+" Price : "+d+"\n";
    }
}

public class Q4 {
    static void validate(int n) throws InvalidNumber {
        if (n != 101 && n != 105 && n != 108 && n != 115 && n != 125)
            throw new InvalidNumber("Item Number not valid.");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            File newFile = new File("Files/test4.txt");
            newFile.createNewFile();
            FileOutputStream f = new FileOutputStream(new File("Files/test4.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            int n, i;
            double d;
            Record[] obj = new Record[5];
            for (i = 0; i < 5; i++) {
                System.out.print("Item Number : ");
                n = in.nextInt();
                validate(n);
                System.out.print("Price : ");
                d = in.nextDouble();
                obj[i] = new Record(n,d);
                o.writeObject(obj[i]);
            }
            o.close();
            f.close();
        } catch (InvalidNumber e) {
            System.out.println(e);
        } catch (IOException s) {
            System.out.println(s);
        }
    }
}