import java.util.Scanner;

public class percentChange {

	public static void main(String[] args) {
		Scanner chk = new Scanner(System.in);
		double intiVal, finalVal;
		double change;

		while(true) {
			System.out.println(" ");
			System.out.println("Please enter your initial investment: ");
			System.out.println("Type 0 to exit.");
			intiVal = chk.nextDouble();

			if(intiVal <= 0 ) {
				break;
			}

			System.out.println("Please enter your the final value: ");
			finalVal = chk.nextDouble();


			change = (finalVal - intiVal)/intiVal;
			change = change*100;

			System.out.print("Your investment changed by: " );
			System.out.format("%2.2f", change);
			System.out.print("%.");
			System.out.println();

		}
		chk.close();
		System.out.println(" ");
		System.out.println("Thanks your using using this program");

	}

}
