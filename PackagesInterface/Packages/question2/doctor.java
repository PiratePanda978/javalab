package pack4;

import pack2.staff;

public class doctor extends staff{
    String qualification;
    String specialisation;
    public doctor(String name,String sex,int age,String dateOfJoin,int salary,String qual,String spec){
        super(name,sex,age,dateOfJoin,salary);
        qualification = qual;
        specialisation = spec;
    }
    public void display(){
        System.out.println("Name = "+name);
        System.out.println("Gender = "+sex);
        System.out.println("Age = "+age);
        System.out.println("Date of joining = "+dateOfJoin);
        System.out.println("Salary = "+salary);
        System.out.println("Qualification = "+qualification);
        System.out.println("Specialisation = "+specialisation);
    }
}