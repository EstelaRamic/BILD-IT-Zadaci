package zadaci_15_02_2018;
/* Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u rasponu godina koje korisnik unese. 
 * Program pita korisnika da unese poèetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu. 
 * Razmak izmeðu godina treba biti jedan space. 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYears {
	
	public static boolean isLeapYear(int year){
		if (year % 4 != 0){
			return false;
		} else if (year % 100 != 0){
			return true;
		} else if (year% 400 != 0){
			return false;
		} else {
			return true;
		}
		
	}
	
	public static void main(String[] args) {
		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese godinu, dodijeliti istu varijabli
		
		int startYear = 0;
		do {
			try {
				System.out.print("Molimo unesite godinu sa pocetka vremenskog razdoblja:  ");
				startYear = unos.nextInt();
				if (startYear <= 0) {
					System.out.println("Year must be positive number. Tray again.");
					System.out.println("-----------------------------------------------------");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Tray again. (" + "Incorect input.)");
				System.out.println("---------------------------------------------------");
				unos.nextLine(); // discard input
			}
		} while (startYear <= 0);
		
		
		int finalYear = 0;
		do {
			try {
				System.out.print("Molimo unesite godinu sa kraja vremenskog razdoblja:  ");
				finalYear = unos.nextInt();
				if (finalYear <= 0) {
					System.out.println("Year must be positive number. Tray again.");
					System.out.println("-----------------------------------------------------");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Tray again. (" + "Incorect input.)");
				System.out.println("---------------------------------------------------");
				unos.nextLine(); // discard input
			}
		} while (finalYear <= 0);
		
		int godina =startYear;
		int brojac = 0;
		
				
		System.out.println("Prestupne godine izmedju " + startYear + ".godine  i  " + finalYear + ".godine  su:");
		
		
		for(godina=startYear; godina <= finalYear; godina++){
			if(isLeapYear(godina)){
				System.out.print(godina+ " ");
				brojac++;
				if ((brojac%10)==0){
					System.out.println();
				}
			}
			
		}
	}
}
