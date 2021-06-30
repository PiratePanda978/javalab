import java.util.Scanner;
public class DemoSugarSmash extends PremiumSugarSmashPlayer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,score,le;
        SugarSmashPlayer obj1 = new SugarSmashPlayer();
        obj1.fixArray();
        obj1.setId(1234);
        obj1.setName("Rohit");
        System.out.println("Enter level : ");
        le = in.nextInt();
        System.out.println("Enter score : ");
        score = in.nextInt();
        obj1.setScore(score,le);
        System.out.println("Name = "+obj1.getName());
        System.out.println("ID = "+obj1.getId());
        System.out.println("Enter level of which you need to know score : ");
        n = in.nextInt();
        System.out.print("Score at level "+n+" = ");
        obj1.getScore(n);
        System.out.println("Premium Player\n==================");
        PremiumSugarSmashPlayer obj2 = new PremiumSugarSmashPlayer();
        obj2.fixArray();
        obj2.setId(1235);
        obj2.setName("Rahul");
        System.out.println("Enter level : ");
        le = in.nextInt();
        System.out.println("Enter score : ");
        score = in.nextInt();
        obj2.setScore(score,le);
        System.out.println("Name = "+obj2.getName());
        System.out.println("ID = "+obj2.getId());
        System.out.println("Enter level of which you need to know score : ");
        n = in.nextInt();
        System.out.print("Score at level "+n+" = ");
        obj2.getScore(n);
    }
}
