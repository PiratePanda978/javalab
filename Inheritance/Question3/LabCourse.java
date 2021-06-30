package mypack;
import mypack.CollegeCourse;
public class LabCourse extends CollegeCourse{
    public LabCourse(String d,int c,int cr){
        super(d, c, cr);
    }
    public void display(){
        courseFees = credits*120;
        courseFees+=50;
        System.out.println("Department = "+department);
        System.out.println("Course Number = "+courseNumber);
        System.out.println("Course Credits = "+credits);
        System.out.println("Course Fees = "+courseFees);
    }
}
