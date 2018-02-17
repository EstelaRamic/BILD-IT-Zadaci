package zadaci_16_02_2018;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LCDsimulation {

	public static void main(String[] args) {

		int size = 3;
		
		Scanner input = new Scanner(System.in);

		// pitati korisnika da unese velicinu ispisa cifara
		
		
		do {
			try {
				System.out.print("Unesite velicinu cifara (od 2 do 5):  ");
				size = input.nextInt();
				if ((size < 2) || (size>5)) {
					System.out.println("Velicina nije korektna. pokusajte ponovo.");
					System.out.println("-----------------------------------------------------");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Tray again. (" + "Incorect input.)");
				System.out.println("---------------------------------------------------");
				input.nextLine(); // discard input
			}
		} while ((size < 2) || (size>5));
		input.close();
		
		// postavljanje šablona za ispis redova
		String[] list = new String[5];
		rowPattern(list, size);

		// odreðivanje visine cifre - broj kolona matrice u kojoj se ispisuje cifra
		int columnNumber = size * 2 + 3;

		int[][] digitPattern = new int[10][columnNumber];
		digitPattern = digitsInitialization(digitPattern, size, columnNumber);

		for (int i=0; i<10; i++){
			printDigit(columnNumber, digitPattern[i], list);
			System.out.println();
		}
		
	}

	public static void printDigit(int columnNumber, int[] digitPattern, String[] list) {
		
		for (int i = 0; i < columnNumber; i++) {

			System.out.println(list[digitPattern[i]]);
		}
	}

	public static String[] rowPattern(String[] list, int size) {
		list[0] = " ";
		list[1] = " ";
		list[2] = " ";
		list[3] = "|";
		list[4] = "|";
		int i;

		// adiing one row print cominations depending on size - there are 5
		// different
		for (i = 1; i <= size; i++) {

			list[0] += " ";
			list[1] += "-";
			list[2] += " ";
			list[3] += " ";
			list[4] += " ";
		}
		list[0] += " ";
		list[1] += " ";
		list[2] += "|";
		list[3] += " ";
		list[4] += "|";

		return list;
	}

	public static int[][] digitsInitialization(int[][] digitPattern, int size, int columnNumber) {
		int i;
		// patern for digit 0
		digitPattern[0][0] = 1;
		for (i = 1; i <= size; i++) {
			digitPattern[0][i] = 4;
		}
		digitPattern[0][columnNumber / 2] = 0;
		for (i = columnNumber / 2 + 1; i <= columnNumber - 1; i++) {
			digitPattern[0][i] = 4;
		}
		digitPattern[0][columnNumber - 1] = 1;

		// patern for digit 1
		digitPattern[1][0] = 0;
		for (i = 1; i <= size; i++) {
			digitPattern[1][i] = 2;
		}
		digitPattern[1][columnNumber / 2] = 0;
		for (i = columnNumber / 2 + 1; i <= columnNumber - 1; i++) {
			digitPattern[1][i] = 2;
		}
		digitPattern[1][columnNumber - 1] = 0;

		// patern for digit 2
		digitPattern[2][0] = 1;
		for (i = 1; i <= size; i++) {
			digitPattern[2][i] = 2;
		}
		digitPattern[2][columnNumber / 2] = 1;
		for (i = columnNumber / 2 + 1; i <= columnNumber - 1; i++) {
			digitPattern[2][i] = 3;
		}
		digitPattern[2][columnNumber - 1] = 1;

		// patern for digit 3
		digitPattern[3][0] = 1;
		for (i = 1; i <= size; i++) {
			digitPattern[3][i] = 2;
		}
		digitPattern[3][columnNumber / 2] = 1;
		for (i = columnNumber / 2 + 1; i <= columnNumber - 1; i++) {
			digitPattern[3][i] = 2;
		}
		digitPattern[3][columnNumber - 1] = 1;

		// patern for digit 4
		digitPattern[4][0] = 0;
		for (i = 1; i <= size; i++) {
			digitPattern[4][i] = 4;
		}
		digitPattern[4][columnNumber / 2] = 1;
		for (i = columnNumber / 2 + 1; i <= columnNumber - 1; i++) {
			digitPattern[4][i] = 2;
		}
		digitPattern[4][columnNumber - 1] = 0;

		// patern for digit 5
		digitPattern[5][0] = 1;
		for (i = 1; i <= size; i++) {
			digitPattern[5][i] = 3;
		}
		digitPattern[5][columnNumber / 2] = 1;
		for (i = columnNumber / 2 + 1; i <= columnNumber - 1; i++) {
			digitPattern[5][i] = 2;
		}
		digitPattern[5][columnNumber - 1] = 1;

		// patern for digit 6
		digitPattern[6][0] = 1;
		for (i = 1; i <= size; i++) {
			digitPattern[6][i] = 3;
		}
		digitPattern[6][columnNumber / 2] = 1;
		for (i = columnNumber / 2 + 1; i <= columnNumber - 1; i++) {
			digitPattern[6][i] = 4;
		}
		digitPattern[6][columnNumber - 1] = 1;

		// patern for digit 7
		digitPattern[7][0] = 1;
		for (i = 1; i <= size; i++) {
			digitPattern[7][i] = 2;
		}
		digitPattern[7][columnNumber / 2] = 0;
		for (i = columnNumber / 2 + 1; i <= columnNumber - 1; i++) {
			digitPattern[7][i] = 2;
		}
		digitPattern[7][columnNumber - 1] = 0;

		// patern for digit 8
		digitPattern[8][0] = 1;
		for (i = 1; i <= size; i++) {
			digitPattern[8][i] = 4;
		}
		digitPattern[8][columnNumber / 2] = 1;
		for (i = columnNumber / 2 + 1; i <= columnNumber - 1; i++) {
			digitPattern[8][i] = 4;
		}
		digitPattern[8][columnNumber - 1] = 1;

		// patern for digit 9
		digitPattern[9][0] = 1;
		for (i = 1; i <= size; i++) {
			digitPattern[9][i] = 4;
		}
		digitPattern[9][columnNumber / 2] = 1;
		for (i = columnNumber / 2 + 1; i <= columnNumber - 1; i++) {
			digitPattern[9][i] = 2;
		}
		digitPattern[9][columnNumber - 1] = 1;

		return digitPattern;
	}

}
