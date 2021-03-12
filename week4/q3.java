import java.util.Scanner;
import java.util.Random;
public class q3 {
   public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       Random rand = new Random();
       int[] ballots = new int[6];
       int i;
       for(i=0;i<6;i++){
           ballots[i]=0;
       }
       int vote;
       System.out.print("Enter the total number of voters : ");
       int voters = in.nextInt();
       for(i=0;i<voters;i++){
           vote = rand.nextInt(6);
           switch(vote){
               case 1 :
               ballots[0]+=1;
               break;
               case 2 :
               ballots[1]+=1;
               break;
               case 3 :
               ballots[2]+=1;
               break;
               case 4 :
               ballots[3]+=1;
               break;
               case 5 :
               ballots[4]+=1;
               break;
               default:
               ballots[5]+=1;
               break;
           }
       }
       System.out.println("\nCandidate Number\tVotes");
       System.out.println(".........................");
       for(i=0;i<5;i++){
           System.out.println("\t"+(i+1)+"\t\t"+ballots[i]);
       }
       System.out.println("\nSpoilt Ballots : "+ballots[5]);
   } 
}