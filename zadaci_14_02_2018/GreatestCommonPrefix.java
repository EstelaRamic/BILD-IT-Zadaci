package zadaci_14_02_2018;
/* Napisati program koji pita korisnika da unese 2 stringa te ispisuje najve�i zajedni�ki prefix za ta dva stringa, 
 * ukoliko isti postoji. Na primjer, ukoliko korisnik unese sljede�a dva stringa "Dobrodo�li u Dubai" i "Dobrodo�li u Vankuver" 
 * program treba da ispi�e: Najve�i zajedni�ki prefix za dva stringa je "Dobrodo�li u". 
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
