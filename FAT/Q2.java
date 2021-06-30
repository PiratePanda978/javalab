import java.util.Scanner;

class AgeException extends Exception{
    AgeException(String s){
        super(s);
    }
}

public class Q2{

    static void validate(int i) throws AgeException{
        if(i<4){
            throw new AgeException("Age not above 4 years!!");
        }
        else{
            System.out.println("Age Valid");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Child's Name : ");
        String name = in.next();
        System.out.println("Enter Child's date-of-birth in DD/MM/YYYY : ");
        String dob = in.next();
        int y = Integer.parseInt(dob.substring(6));
        int age = 2021 - y;
        System.out.println("Age of "+name+" is "+age);
        System.out.print("Result = ");
        try{
            validate(age);
        }
        catch(Exception e){
            System.out.println("Exception occured : "+e);
        }
    }
}