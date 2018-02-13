package zadaci_13_02_2018;

/* Napisati metodu koja prima 2 argumenta: poèetni broj i krajnji broj te printa sve proste brojeve u zadanom rangu.
BONUS: metoda može primati i treæi argument, broj brojeva za isprintati po liniji. */

import java.util.Scanner;

public class RangedPrimes {

	public static boolean isPrime(int a) {

		int j = 2, brojac = 0;
		double gornjaGranica = (double) Math.sqrt(a);

		while (((double) j <= gornjaGranica) && (brojac == 0)) {
			if ((a % j) == 0) {
				brojac++;
			}
			j++;
		}
		if (brojac == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void printPrimes(int donjaGranica, int gornjaGranica, int n) {
		
		int i, brojac=0;
		
		for (i = donjaGranica; i <= gornjaGranica; i++) {

			if (isPrime(i)) {
				System.out.printf("%4s ", i);
				brojac++;
				if ((brojac % n) == 0) {
					System.out.println();

				} // if brojac
			} // if prost

		} // for
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int donjaGranica, gornjaGranica, n;

		System.out.println("Unesite donju granicu intervala: ");
		donjaGranica = input.nextInt();
		System.out.println("Unesite gornju granicu intervala: ");
		gornjaGranica = input.nextInt();
		
		System.out.println("Koliko brojeva u jednoj liniji zelite pri ispisu n = ");
		n = input.nextInt();
		
		input.close();
		printPrimes(donjaGranica, gornjaGranica, n);

	}
}
