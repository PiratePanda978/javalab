package pack3;

import pack1.person;

public class patient extends person{
    String condition;
    int bill;
    public patient(String name,String sex,int age,String cond,int b){
        super(name,sex,age);
        condition = cond;
        bill = b;
    }
    public void display(){
        System.out.println("Name = "+name);
        System.out.println("Gender = "+sex);
        System.out.println("Age = "+age);
        System.out.println("Condition = "+condition);
        System.out.println("Bill = "+bill);
    }
}