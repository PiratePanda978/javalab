import java.util.Scanner;
import mypack.CollegeCourse;
import mypack.LabCourse;
public class UseCourse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String d;
        int cn,cr,cf;
        System.out.println("Enter Department : ");
        d = in.next();
        System.out.println("Enter Course Number : ");
        cn = in.nextInt();
        System.out.println("Enter Course Credits : ");
        cr = in.nextInt();
        
        System.out.println("................................");

        System.out.println("Course Details : ");

        if (d.equals("BIO")||d.equals("CHM")||d.equals("CIS")||d.equals("PHY")) {
            LabCourse obj1 = new LabCourse(d, cn, cr);
            obj1.display();
        }
        else{
            CollegeCourse obj2 = new CollegeCourse(d, cn, cr);
            obj2.display();
        }
    }
}
