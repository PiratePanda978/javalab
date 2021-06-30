package mypack;
public class CollegeCourse {
    String department;
    int courseNumber;
    int courseFees;
    int credits;
    public CollegeCourse(String d,int c,int cr){
        department = d;
        courseNumber = c;
        credits = cr;
    }
    public void display(){
        courseFees = credits*120;
        System.out.println("Department = "+department);
        System.out.println("Course Number = "+courseNumber);
        System.out.println("Course Credits = "+credits);
        System.out.println("Course Fees = "+courseFees);
    }
}