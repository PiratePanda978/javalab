import java.util.*;

public class Q2 {
    static Double mean(ArrayList<Double> nums) {
        Iterator itr = nums.iterator();
        double len = 0d;
        double sum = 0d;
        while (itr.hasNext()) {
            len += 1d;
            sum += (double) itr.next();
        }
        return sum / len;
    }

    static Double mode(ArrayList<Double> nums) {
        Iterator itr1 = nums.iterator();
        double maxValue = 0d, maxCount = 0d;
        while (itr1.hasNext()) {
            double count = 0d;
            Iterator itr2 = nums.iterator();
            double i = (double) itr1.next();
            while (itr2.hasNext()) {
                if ((double) itr2.next() == i)
                    count += 1d;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = i;
            }
        }
        return maxValue;
    }

    static Double standardDeviation(ArrayList<Double> nums) {
        Double meanOfNums = mean(nums);
        Iterator itr = nums.iterator();
        double sd = 0d;
        double len = 0;
        while (itr.hasNext()) {
            double num = (double) itr.next();
            sd += (meanOfNums - num) * (meanOfNums - num);
            len += 1d;
        }
        return Math.sqrt(sd / len);
    }

    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<Double>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            Double num = in.nextDouble();
            nums.add(num);
        }
        System.out.println("Mean is: " + mean(nums));
        System.out.println("Mode is: " + mode(nums));
        System.out.println("SD is: " + standardDeviation(nums));
        nums.add(mean(nums));
        nums.add(mode(nums));
        nums.add(standardDeviation(nums));
        System.out.println("\n\nThe ArrayList items are: ");
        Iterator itr = nums.iterator();
        while (itr.hasNext()) {
            System.out.println((double) itr.next());
        }
    }
}