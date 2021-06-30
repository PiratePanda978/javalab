import java.util.*;

public class Q1 {
    public static void Palindrome(String s) {
        int len = s.length();
        String reverse = "";
        for (int i = len - 1; i >= 0; i--)
            reverse = reverse + s.charAt(i);

        if (reverse.equals(s))
            System.out.println(s + " is palindrome");
        else
            System.out.println(s + " is not palindrome");
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the strings : ");
        for (int i = 0; i < 5; i++) {
            String name = in.next();
            names.add(name);
        }
        System.out.println("\nResult : ");
        Iterator itr = names.iterator();
        while (itr.hasNext()) {
            String name = (String) itr.next();
            Palindrome(name);
        }
    }
}