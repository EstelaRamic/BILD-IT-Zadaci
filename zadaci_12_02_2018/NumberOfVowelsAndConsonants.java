package zadaci_12_02_2018;
// Pretpostavimo da su slova A, E, I, O i U samoglasnici. (Smjela pretpostavka, znam) Napisati program koji pita korisnika da unese string // te mu ispište broj samoglasnika i suglasnika u datom stringu.


import java.util.Scanner;

public class NumberOfVowelsAndConsonants {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//List<char[]> vowels = Arrays.asList('a','A','e','E','i','I','o','O','u', 'U');
		String vowels="aAeEiIoOuU";
		
		//input
		System.out.print("Input a string:");
		String stringAC = input.nextLine();
		
		int stringLength = stringAC.length();
		int i, numberOfVowels=0, numberOfConconants=0;
		char temp;
		
		for (i=0; i<stringLength; i++){
			temp=stringAC.charAt(i);
			if (Character.isLetter(temp)==true){
				if (vowels.indexOf(temp)!=-1){
					numberOfVowels++;
				} else {
					numberOfConconants++;
				}
			}
		}
		
		System.out.println("Number of vowels in string \"" + stringAC + "\" is "+ numberOfVowels);
		System.out.println("Number of conconants in string \"" + stringAC + "\" is "+ numberOfConconants);
		
		input.close();

	}

}
