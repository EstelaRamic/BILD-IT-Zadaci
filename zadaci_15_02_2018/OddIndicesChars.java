package zadaci_15_02_2018;
/* Napisati program koji pita korisnika da unese neki string te mu ispisuje sve karaktere koji se nalaze na neparnim pozicijama.
 *  Na primjer, ako korisnik unese string Beijing Chicago, program vraæa BiigCiao.
 */

import java.util.Scanner;

public class OddIndicesChars {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite string:");
		String str = unos.nextLine();
		
		String strOdd="";
		for (int i =0; i<str.length(); i+=2){
			strOdd=strOdd + str.charAt(i);
		}
		System.out.println("String napravljen od karaktera na neparnim pozicijama je: \"" + strOdd + "\".");
		
		unos.close();

	}

}
