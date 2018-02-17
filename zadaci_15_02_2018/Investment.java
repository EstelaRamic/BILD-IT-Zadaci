package zadaci_15_02_2018;
/* Napisati program koji uèitava iznos investicije, godišnju interesnu stopu i broj godina 
 * te vraæa buduæu vrijednost investicije koristeæi se sljedeæom formulom: 
 * buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12. 
 * Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao godišnju interesnu stopu i 1 kao broj godina 
 * program vam vraæa 1032.98 kao buducu vrijednost investicije.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Investment {

	public static void main(String[] args) {
		// kreirati novi Scanner
		Scanner unos = new Scanner(System.in);

		// ask user for data
		double startInvestment = 0;
		do {
			try {
				System.out.println("Please insert amount of the investment:");
				startInvestment = unos.nextDouble();
				if (startInvestment <= 0) {
					System.out.println("Investment must be positive number. Tray again.");
					System.out.println("-----------------------------------------------------");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Tray again. (" + "Incorect input.)");
				System.out.println("---------------------------------------------------");
				unos.nextLine(); // discard input
			}
		} while (startInvestment <= 0);

		double anualRate = 0;

		do {
			try {
				System.out.println("Please insert annual interest rate:");
				anualRate = unos.nextDouble();
				if ((anualRate <= 0) || (anualRate >= 100)) {
					System.out.println("Anual interst rate must be positive number,and smaller than 100. Tray again.");
					System.out.println("-----------------------------------------------------");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Tray again. (" + "Incorect input.)");
				System.out.println("---------------------------------------------------");
				unos.nextLine(); // discard input
			}
		} while ((anualRate <= 0) || (anualRate >= 100));
		
		double monthlyRate = (anualRate / 100) / 12;

		
		int numYears = 0;
		
		do {
			try {
				System.out.println("Please insert number of years for investment:");
				numYears = unos.nextInt();
				if (numYears <= 0) {
					System.out.println("Number of years must be positive integer. Tray again.");
					System.out.println("-----------------------------------------------------");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Tray again. (" + "Incorect input.)");
				System.out.println("---------------------------------------------------");
				unos.nextLine(); // discard input
			}
		} while (numYears <= 0);

		// data processing
		double finalInvestment = startInvestment * Math.pow((1 + monthlyRate), numYears * 12);

		// output
		System.out.println("**********************************************");
		System.out.printf("The final investment is %.2f\n ", finalInvestment);
		System.out.println("**********************************************");
		
		unos.close();
	}

}
