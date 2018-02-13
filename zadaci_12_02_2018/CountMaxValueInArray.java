package zadaci_12_02_2018;
/* Napisati program koji uèitava niz brojeva, pronalazi najveæi broj te ispisuje koliko se puta taj broj ponavlja. Pretpostavimo da se unos brojeva završava sa nulom.
*/

import java.util.Scanner;

public class CountMaxValueInArray {
	public static void main(String[] args) {

		// kreirati novi Scanner
		Scanner unos = new Scanner(System.in);

		int identifikator = 1, max = 0, brojac = 0;

		while (identifikator != 0) {
			System.out.print("Unesite cijeli broj razlièit od 0 (0 oznaèava kraj unosa): ");
			identifikator = unos.nextInt();
			if (identifikator > max) {
				brojac = 1;
				max = identifikator;
			} else if (identifikator == max) {
				++brojac;

			}
		}

		System.out.println("Unos je završen. ");
		System.out.println();
		System.out.println("Maksimalna vrijednost niza brojeva je " + max + " i ponavlja se " + brojac + " puta.");
		unos.close();

	}

}
