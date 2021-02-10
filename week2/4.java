import java.util.Scanner;

public class GoldSilver{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of customers: ");
		int customers = input.nextInt();
		int goldCoin = 0, silverCoin = 0;
		for (int i=1;i<=customers;i++){

			System.out.print("Enter the name of customer"+i+": ");
			String Name = input.next();

			System.out.print("Enter the customer number"+i+": ");
			int customerNumber = input.nextInt();

			if  ((customerNumber%250==0)){
				System.out.println(Name+" Gold");
				goldCoin++;
			}
			else if (customerNumber%100==0){
				System.out.println(Name+" Silver");
				silverCoin++;
			}
			else{
				System.out.println(Name+", Sorry no coins for you!!!");
			}

		}
		System.out.println("Number of gold coins: "+goldCoin);
		System.out.println("Number of silver coins: "+silverCoin);
	}
}