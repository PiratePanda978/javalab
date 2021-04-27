import java.util.Scanner;

class fibbonacci extends Thread {
    int n;

    fibbonacci(int a) {
        n = a;
    }

    public void run() {
        int a, b, c, i;
        a = 0;
        b = 1;
        i = 0;
        System.out.println("Fibbonacci Series");
        System.out.print(a + " " + b);
        while (i <= n - 2) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            i++;
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

class Prime extends Thread {
    int n;

    Prime(int a) {
        n = a;
    }

    public void run() {
        System.out.print("Prime factors : ");
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        if (n > 2)
            System.out.print(n);
        System.out.println();
    }
}

public class fibPrime{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter a number : ");
        n = in.nextInt();
        try{
            fibbonacci fib = new fibbonacci(n);
            fib.start();
            Prime pri = new Prime(n);
            pri.start();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
