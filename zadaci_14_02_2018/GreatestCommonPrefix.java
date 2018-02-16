package zadaci_14_02_2018;
/* Napisati program koji pita korisnika da unese 2 stringa te ispisuje najveæi zajednièki prefix za ta dva stringa, 
 * ukoliko isti postoji. Na primjer, ukoliko korisnik unese sljedeæa dva stringa "Dobrodošli u Dubai" i "Dobrodošli u Vankuver" 
 * program treba da ispiše: Najveæi zajednièki prefix za dva stringa je "Dobrodošli u". 
 */

import java.util.Scanner;

public class GreatestCommonPrefix {
	public static void prefix(String str1, String str2){
		int min=str1.length();
		if(str2.length()<min){
			min = str2.length();
		}
		int i=0; 
		while ((i<min)&& (str1.charAt(i)==str2.charAt(i))){
			i++;
		}
		if (i!=0){
			System.out.println("Zajednicki prefiks za dva stringa je: "+ str1.substring(0, i));
		} else {
			System.out.println("Stringovi \""+ str1 + "\" i \""+str2+"\""
					+ " nemaju zajednicki prefiks.");
		}
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite prvi string:");
		String str1 = unos.nextLine();
		System.out.print("Unesite drugi string:");
		String str2 = unos.nextLine();
		
		unos.close();
		prefix(str1, str2);
	}
}
