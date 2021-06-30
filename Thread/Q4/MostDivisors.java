import java.time.*;
public class MostDivisors {
    public static void main(String[] args) {
        Instant start = Instant.now();
        int N;
        int maxDivisors;
        int numWithMax;
        maxDivisors = 1;
        numWithMax = 1;
        for (N = 2; N <= 100000; N++) {
            int D;
            int divisorCount;
            divisorCount = 0;
            for (D = 1; D <= N; D++) {
                if (N % D == 0)
                    divisorCount++;
            }
            if (divisorCount > maxDivisors) {
                maxDivisors = divisorCount;
                numWithMax = N;
            }
        }
        System.out.println("Among integers between 1 and 100000,");
        System.out.println("The maximum number of divisors is " + maxDivisors);
        System.out.println("A number with " + maxDivisors + " divisors is " + numWithMax);
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start,end);
        System.out.println("The time elapsed is : "+timeElapsed.getSeconds()+" seconds");
    }

}