package pack5;

import pack2.staff;

public class nurse extends staff{
    String type;
    int shift;
    public nurse(String name,String sex,int age,String dateOfJoin,int salary,String t,int sh){
        super(name,sex,age,dateOfJoin,salary);
        type = t;
        shift = sh;
    }
    public void display(){
        System.out.println("Name = "+name);
        System.out.println("Gender = "+sex);
        System.out.println("Age = "+age);
        System.out.println("Date of joining = "+dateOfJoin);
        System.out.println("Salary = "+salary);
        System.out.println("Nurse Type = "+type);
        System.out.println("Hours per day = "+shift);
    }
}