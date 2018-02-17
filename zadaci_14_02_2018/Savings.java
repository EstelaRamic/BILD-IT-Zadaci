package zadaci_14_02_2018;
/*/*  Pretpostavimo da uplatimo $100 svaki mjesec na �tedni ra�un koji ima godi�nju interesnu stopu od 5%. 
 * Mjese�na interesna stopa je 
 * stoga 0.05 / 12 = 0.00417. Nakon prvog mjeseca vrijednost na ra�unu postaje 100 * (1 + 0.00417) = 100.417. Nakon drugog mjeseca, 
 * vrijednost na ra�unu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. Nakon tre�eg mjeseca, vrijednost na ra�unu postaje 
 * (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. Napisati program koji pita korisnika da unese mjese�ni iznos �tednje 
 * te broj mjeseci nakon kojeg bi �elio znati stanje ra�una. 
 */
 
import java.util.InputMismatchException;
import java.util.Scanner;

public class Savings {

	public static void main(String[] args) {
		// new Scanner object
		Scanner unos = new Scanner(System.in);
		boolean continueInput = true;
		double monthAmount=0;
		int noMonths=0;
		
		// input
		do {
			try {
				do {
					System.out.print("please enter monthly amount of savings: ");
					monthAmount = unos.nextDouble();
					if (monthAmount <= 0) {
						System.out.println("Monthly amount must be positive number. Tray again.");
						System.out.println("---------------------------------------------------");
					}
				} while (monthAmount <= 0);
				
				
				do {
					try{
					System.out.print("please enter number of months: ");
					noMonths = unos.nextInt();
					if (noMonths <= 0) {
						System.out.println("Number of months must be positive number. Tray again.");
						System.out.println("-----------------------------------------------------");
					}
					}catch (InputMismatchException ex){
						System.out.println("Tray again. (" + "Incorect input.)");
						System.out.println("---------------------------------------------------");
						unos.nextLine(); // discard input
					}
				} while (noMonths <= 0);

				// processing
				double sum = 0, gks = 5, mks;
				int i;
				mks = 1 + (gks / 100) / 12;

				for (i = 1; i <= noMonths; i++) {
					sum = (monthAmount + sum) * mks;
				}

				// output
				System.out.println("******************************************************************");
				System.out.printf("After %d months, on your account will be amount of %.3f money.\n", noMonths, sum);
				System.out.println("******************************************************************");
				
				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("Tray again. (" + "Incorect input.)");
				System.out.println("---------------------------------------------------");
				unos.nextLine(); // discard input
			}
		} while (continueInput);

		unos.close();
	}

}