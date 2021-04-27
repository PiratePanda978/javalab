import java.util.Scanner;

class InvalidNumberException extends Exception {
    InvalidNumberException(String s) {
        super(s);
    }
}

class generators {
    synchronized void generate(int n) {
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

    synchronized void findPrime(int n) {
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

class fibbonacci extends Thread {
    generators obj;
    int n;

    fibbonacci(generators obj, int n) {
        this.obj = obj;
        this.n = n;
    }

    public void run() {
        obj.generate(n);
    }
}

class Prime extends Thread {
    int n;
    generators obj;

    Prime(generators obj, int a) {
        n = a;
        this.obj = obj;
    }

    public void run() {
        obj.findPrime(n);
    }
}

public class fibPrimeSyncExc {

    static void validate(int n) throws InvalidNumberException {
        if (n < 0)
            throw new InvalidNumberException("Number must be greater than 0");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter a number : ");
        n = in.nextInt();
        try {
            validate(n);
            generators obj = new generators();
            fibbonacci fib = new fibbonacci(obj, n);
            Prime pri = new Prime(obj, n);
            fib.start();
            pri.start();
        } catch (InvalidNumberException e) {
            System.out.println(e);
        }

    }
}