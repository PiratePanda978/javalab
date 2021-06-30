import java.time.*;
import java.util.Scanner;

class counter extends Thread {
    int start, end;

    counter(int s, int e) {
        start = s;
        end = e;
    }

    public void run() {
        threadCount obj = new threadCount();
        int i, divisors;
        for (i = start; i <= end; i++) {
            divisors = countDivisors(i);
            obj.report(divisors, i);
        }
    }

    int countDivisors(int n) {
        int i, divisors;
        divisors = 0;
        for (i = 1; i <= n; i++) {
            if (n % i == 0)
                divisors++;
        }
        return divisors;
    }

}

public class threadCount {
    static int maxDivisors = 1;
    static int numWithMax = 1;

    synchronized void report(int divisors, int i) {
        if (divisors > maxDivisors) {
            maxDivisors = divisors;
            numWithMax = i;
        }
    }

    public static void main(String[] args) {
        Instant startTime = Instant.now();
        Scanner in = new Scanner(System.in);
        int N, i;
        int numOfThread, intPerThread;
        System.out.println("Enter Number of threads : ");
        numOfThread = in.nextInt();
        intPerThread = 100000 / numOfThread;
        counter[] worker = new counter[numOfThread];
        int start, end;
        start = 1;
        end = start + intPerThread - 1;
        for (i = 0; i < numOfThread; i++) {
            if (i == numOfThread - 1) {
                end = 100000;
            }
            worker[i] = new counter(start, end);
            start = end;
            end = start + intPerThread - 1;
        }
        for (i = 0; i < numOfThread; i++)
            worker[i].start();
        for (i = 0; i < numOfThread; i++) {
            while (worker[i].isAlive()) {
                try {
                    worker[i].join();
                } catch (InterruptedException e) {
                }
            }
        }
        System.out.println("Among integers between 1 and 100000,");
        System.out.println("The maximum number of divisors is " + maxDivisors);
        System.out.println("A number with " + maxDivisors + " divisors is " + numWithMax);
        Instant endTime = Instant.now();
        Duration timeElapsed = Duration.between(startTime, endTime);
        System.out.println("The time elapsed is : " + timeElapsed.getSeconds() + " seconds");
    }

}