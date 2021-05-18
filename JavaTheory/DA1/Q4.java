import java.util.Scanner;
class Student{
    int availableSeats;
    int s;
    public Student(int a) {
        availableSeats = a;
        s=1;
    }
    public void register() {
        synchronized(this){
            if (availableSeats > 0) {
                availableSeats--;
                System.out.println("Student "+s+" registered.");
                System.out.println("Available seats: " + availableSeats);
                s++;
            } else {
                System.out.println("Student "+s+" added to waiting list");
                s++;
            }
        }
    }
}
public class Q4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of seats : ");
        int n = in.nextInt();
        Student obj = new Student(n);
        System.out.println("Enter number of students : ");
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            Thread t1 = new Thread(){
                public void run() {
                    obj.register();
                }
            };
            t1.start();
        }
    }
}