package zadaci_16_02_2018;
/* Napisati program koji nalazi njkraæi palindrom u nekoj reèenici. Primjer : "hamo vidi mu glave", najkraæi palindrom je "idi" 
*/

import java.util.Scanner;

public class ShortestSubstringPalindrome {
	public static boolean isPalindrome(String s) {
		// The index of the first character in the string
		int low = 0;

		// The index of the last character in the string
		int high = s.length() - 1;

		boolean isPalindrome = true;
		while (low < high) {
			if (s.charAt(low) != s.charAt(high)) {
				isPalindrome = false;
				break;
			}

			low++;
			high--;
		}

		return isPalindrome;
	}

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		int i, j, sublength = 2;

		while (sublength < s.length()) {
			for (i = 0; i < s.length(); i++) {
				for (j = i + sublength; j < s.length(); j++) {
					if (isPalindrome(s.substring(i, j))) {
						System.out.println("The shortest palindrome is \"" + s.substring(i, j) + "\" .");
						return;
					}
				}
			}
			sublength++;

		}

		input.close();

	}

}
