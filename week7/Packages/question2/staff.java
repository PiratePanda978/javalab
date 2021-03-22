package pack2;

import pack1.person;

public class staff extends person {
    public String dateOfJoin;
    public int salary;
    public staff(String name,String sex,int age,String doj,int sal){
        super(name,sex,age);
        dateOfJoin = doj;
        salary = sal;
    }
}