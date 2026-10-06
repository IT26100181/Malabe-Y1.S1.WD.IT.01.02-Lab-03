import java.util.Scanner;
public class IT26100181Lab3Q1B{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter the price of a kilo : ");
		double priceOfkilo = input.nextDouble();

		System.out.print("Enter the number of kilos you want : ");
		int totalKilos = input.nextInt();

		// total price of the rice having...
		double totalPrice = priceOfkilo * totalKilos;
		// finding the discounted price
		double discountPrice = totalPrice - (totalPrice * 10.0/100);
		
		System.out.print("\nTotal price of the rice is : Rs." + discountPrice + "/=");
	}
}

