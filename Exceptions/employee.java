import java.util.Scanner;

class InvalidException extends Exception {
    InvalidException(String s) {
        super(s);
    }
}

public class employee {
    String emp_code, emp_name, dob, doa;

    employee(String ec, String en, String db, String da) {
        emp_code = ec;
        emp_name = en;
        dob = db;
        doa = da;
    }

    static void validate(String code) throws InvalidException{
        String s1, s3, s4;
        String s2;
        s1 = code.substring(0, 2);
        s2 = code.substring(3, 4);
        s3 = code.substring(5);
        if (s1.length() > 2 || s3.length() > 3||(!s2.equals("M") && !s2.equals("H") && !s2.equals("A") && !s2.equals("T") && !s2.equals("E"))) {
            throw new InvalidException("Not Valid");
        }
        else{
            return;
        }
    }

    static void validate(int a,int b) throws InvalidException{
        if(b>a){
            throw new InvalidException("Date of Birth error");
        }
        else{
            return;
        }
    }

    void display(){
        System.out.println("Employee name = "+emp_name);
        System.out.println("Employee code = "+emp_code);
        System.out.println("Employee date of birth = "+dob);
        System.out.println("Employee date of appontment = "+doa);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String emp_code, emp_name, dob, doa;
        System.out.println("Enter employee name : ");
        emp_name = in.next();
        System.out.println("Enter employee code : ");
        emp_code = in.next();
        System.out.println("Enter employee date of birth : ");
        dob = in.next();
        System.out.println("Enter employee date of appointment : ");
        doa = in.next();
        try{
            validate(emp_code);
            int d1,d2;
            d1 = Integer.parseInt(doa.substring(6,8));
            d2 = Integer.parseInt(dob.substring(6,8));
            try{
                validate(d1, d2);
                employee obj = new employee(emp_code,emp_name,dob,doa);
                obj.display();
            }
            catch(Exception m){
                System.out.println("Exception ocurred "+m);
            }
        }
        catch(Exception m){
            System.out.println("Exception ocurred "+m);
        }
    }
}