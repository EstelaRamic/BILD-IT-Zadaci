package zadaci_13_02_2018;

import java.util.Scanner;

/* Nizovi niz1 i niz2 su striktno identièni ukoliko su svi njihovi elementi na istim pozicijama jednaki. Napisati metodu koja vraæa true ukoliko su nizovi niz1 i niz2 striktno identièni. Koristiti sljedeæi header:
	public static boolean equals(int[ ] niz1, int[ ] niz2)
Napisati testni program koji pita korisnika da unese dva niza cijelih brojeva te provjerava da li su striktno identièni. */

public class IdenticalArrays {

	public static boolean equals(int[] niz1, int[] niz2) {
		boolean indikator = true;

		for (int i = 0; i < niz1.length; i++) {
			if (niz1[i] != niz2[i]) {
				indikator = false;
				break;
			}
		}

		return indikator;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite duzinu nizova: ");
		int duzina = unos.nextInt();
		System.out.print("Unesite prvi niz: ");
		int[] niz1 = new int[duzina];
		for (int i = 0; i < duzina; i++) {
			niz1[i] = unos.nextInt();
		}

		System.out.print("Unesite drugi niz: ");
		int[] niz2 = new int[duzina];
		for (int i = 0; i < duzina; i++) {
			niz2[i] = unos.nextInt();
		}

		if ((equals(niz1, niz2)) == true) {
			System.out.println("Dva niza su striktno identicna");
		} else {
			System.out.println("Dva niza nisu striktno identicna");
		}
		unos.close();
	}

}
