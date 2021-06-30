import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        String s;
        ArrayList<String> name1 = new ArrayList<String>();
        System.out.println("Enter list 1 items : ");
        for(int i = 0;i<4;i++){
            s = in.next();
            name1.add(s);
        }

        System.out.println("First Name Array : " + name1);
        ArrayList<String> name2 = new ArrayList<String>();
        System.out.println("Enter list 2 items : ");
        for(int i = 0;i<4;i++){
            s = in.next();
            name2.add(s);
        }
        
        System.out.println("Second Name Array :  " + name2);
        name1.retainAll(name2); //Putting common elements in both array lists in name1
        Iterator<String> itr = name1.iterator();
        while(itr.hasNext()){
            itr.next();
            counter++;
        }
        System.out.println("The number of common elements in both array lists is "+counter);
    }
}