package zadaci_15_02_2018;
/* Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeæe v, možemo izraèunati minimalnu dužinu piste 
 * potrebne da avion uzleti koristeæi se sljedeæom formulom: dužina = v * v / 2a. 
 * Napisati program koji pita korisnika da unese v u m/s i a u m/s^2 te ispisuje korisniku minimalnu dužinu piste. 
 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje dužina piste je 514.286)
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class AirplaneRunway {

	public static void main(String[] args) {
		// kreirati novi Scanner
		Scanner unos = new Scanner(System.in);
		boolean continueInput = true;
		double v = 0;
		double a = 0;

		// ask user for speed and aceleration
		do {
			try {

				System.out.print("Please insert speed v (m/s) and acelaration a (m/s^2): ");
				v = unos.nextDouble();
				a = unos.nextDouble();
				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("Tray again. (" + "Incorect input.)");
				System.out.println("---------------------------------------------------");
				unos.nextLine(); // discard input
			}
		} while (continueInput);

		// counting length of runway
		double duzina = Math.pow(v, 2) / (2 * a);

		System.out.printf("Minimum length of a runway for this airplane is %.3f m.", duzina);

		unos.close();

	}

}
