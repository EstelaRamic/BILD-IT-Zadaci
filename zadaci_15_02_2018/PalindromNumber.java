package zadaci_15_02_2018;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Napisati metode sa sljedeæim headerima:
 *  public static int reverse(int number) i 
 *  public static boolean isPalindrome(int number). 
 *  Prva metoda prima cijeli broj kao argument i vraæa isti ispisan naopako. (npr. reverse(456) vraæa 654.) 
 *  Druga metoda vraæa true ukoliko je broj palindrom a false ukoliko nije. 
 *  Koristite reverse metodu da implementirate isPalindrome metodu. 
 *  Napišite program koji pita korisnika da unese broj te mu vrati da li je broj palindrome ili ne. 
 */

public class PalindromNumber {

	public static int reverse(int number) {
		String originStr = Integer.toString(number);
		String reverseStr = "";
		int reverseNum = 0;
		for (int j = originStr.length() - 1; j >= 0; j--) {
			reverseStr += originStr.charAt(j);
		}
		reverseNum = Integer.parseInt(reverseStr);
		return reverseNum;
	}

	public static boolean isPalindrome(int number) {
		return (number == reverse(number));
	}

	public static void main(String[] args) {

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		int number = 0;
		do {
			try {
				System.out.print("Molimo unesite jedan cijeli broj koji provjervate da li je palindrom:  ");
				number = unos.nextInt();
				if (number <= 0) {
					System.out.println("Number must be positive integer. Tray again.");
					System.out.println("-----------------------------------------------------");
				}
				
			} catch (InputMismatchException ex) {
				System.out.println("Tray again. (" + "Incorect input.)");
				System.out.println("---------------------------------------------------");
				unos.nextLine(); // discard input
			}
		} while (number <= 0);
		
		if (isPalindrome(number)) {
			System.out.println("Broj " + number + " jeste palindrom.");
		} else {
			System.out.println("Broj " + " NIJE palindrom.");
		}

		unos.close();

	}

}
