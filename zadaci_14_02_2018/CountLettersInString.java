package zadaci_14_02_2018;

/*/*  Napisati metodu koja broji slova u stringu. 
 * Metoda treba koristiti sljedeæi header: public static int countLetters(String s). 
 * Napisati program koji pita korisnika da unese neki string te mu vrati koliko taj string ima slova.
 */
import java.lang.RuntimeException;
import java.util.Scanner;

public class CountLettersInString {

	public static int countLetters(String s) throws RuntimeException {
		int lnt = s.length();
		int i, brojac = 0;
		if (lnt != 0) {

			for (i = 0; i < lnt; i++) {
				if (Character.isLetter(s.charAt(i))) {
					brojac++;
				}
			}
		} else
			throw new RuntimeException("Metod countLetters cannot take in an empty String or null value.");
		return brojac;
	}

	public static void main(String[] args) {
		// input
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		do {
			System.out.print("Enter a string: ");
			String s = input.nextLine();

			try {
				int numberOfLetters = countLetters(s);

				System.out.println("There are " + numberOfLetters + " letters in the string \"" + s + "\".");

				continueInput = false;
			} catch (RuntimeException ex) {
				System.out.println(ex);
				System.out.println("----------------------------------------------------------");
			}
		} while (continueInput);
		input.close();
	}

}
