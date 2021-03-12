import java.util.Random;
import java.util.Scanner;
public class q1{
    static String[] country = {"India","Japan","Russia","China","England"};
    static String[] medals = {"Gold","Silver","Bronze"};

    public static void Sort(String[] s,int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] < arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[j] 
                    int temp = arr[j];
                    String temp1 = s[j];
                    arr[j] = arr[j+1];
                    s[j] = s[j+1];
                    arr[j+1] = temp;
                    s[j+1] = temp1; 
                } 
    
    }

    public static int index(String s,String[] arr){
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i].equals(s)){
                return i;
            }
        }
        return -1;
    }

    public static int countryTotal(String name,int[][] n){
        int index = index(name,country);
        int j,total;
        total = 0;
        for(j=0;j<3;j++){
            total+=n[index][j];
        }
        return total;
    }

    public static int medalTotal(String type,int[][] n){
        int index = index(type,medals);
        int i,total;
        total = 0;
        for(i=0;i<5;i++){
            total+=n[i][index];
        }
        return total;
    }

    public static int position(int[][] n){
        int i,total;
        int[] ranks = new int[5]; 
        for(i=0;i<5;i++){
            total = countryTotal(country[i],n);
            ranks[i]=total;
        }
        Sort(country,ranks);
        System.out.println("Country\tTotal Medals");
        System.out.println("..........................");
        for(i=0;i<5;i++){
            System.out.println(country[i]+"\t"+ranks[i]);
        }
        return index("India",country);
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int[][] medalTally = new int[5][3];
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<3;j++){
                medalTally[i][j] = rand.nextInt(10);
            }
        }
        System.out.println("Country\t\tGold Medals\tSilver Medals\tBronze Medals");
        System.out.println("................................................................");
        for(i=0;i<5;i++){
            System.out.print(country[i]+"\t");
            for(j=0;j<3;j++){
                System.out.print("\t\t"+medalTally[i][j]);
            }
            System.out.println();
        }
        System.out.print("\nEnter the country you want to know the total of : ");
        String s = in.next();
        System.out.println("The total number of medals for "+s+" is "+countryTotal(s,medalTally));
        System.out.print("\nEnter the medal you want to know total of (Gold, Silver, Bronze) : ");
        String s1 = in.next();
        System.out.println("The total number of "+s1+" medals is : "+medalTotal(s1,medalTally)+"\n");
        System.out.println("\nIndia is at "+(position(medalTally)+1)+"th position.");
    }
}