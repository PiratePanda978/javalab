import java.util.Random;
public class q2{
    public static void main(String args[]){
        Random rand = new Random();
        System.out.print("City : Code\n...........\nDelhi : 01\nMumbai : 02\nChennai : 03\nHyderabad : 04\nPune : 05\n\n");
        int [][] temp = new int[5][6];
        int i,j;
        for(i=0;i<5;i++){
            temp[i][0] = i+1;
        }
        for(i=0;i<5;i++){
            for(j=1;j<6;j++){
                temp[i][j] = rand.nextInt(50);
            }
        }                                                                                    
        System.out.println("The temperature matrix : ");
        for(i=0;i<5;i++){
            for(j=0;j<6;j++){
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
        int max = temp[0][1];
        int city = 0;
        for(i=0;i<5;i++){
            for(j=1;j<6;j++){
                if(temp[i][j]>max){
                    max = temp[i][j];
                    city = temp[i][0];
                }
            }
        }
        System.out.println("\nThe city-code of city with highest temperature is : "+city);
        System.out.println("The max temperature recorded is : "+max);
    }
}