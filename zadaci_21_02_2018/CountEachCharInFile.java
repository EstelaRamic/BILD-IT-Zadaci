package zadaci_21_02_2018;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/* 2. Napisati program koji pita korisnika da unese ime filea. 
 * Nakon što je korisnik unio ime filea, program vraæa koliko se puta koje slovo ponovilo u fileu. 
 * Program pravi razliku izmeðu velikih i malih slova – to jeste, vraæa koliko puta se ponovilo slovo 'a' 
 * i koliko se puta ponovilo slovo 'A'.
 */
public class CountEachCharInFile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of file:");
		String fileName = input.nextLine();

		Path path = Paths.get(fileName);
		ArrayList<Character> chars = new ArrayList<Character>();
		ArrayList<Integer> numOfChar = new ArrayList<Integer>();

		try {

			File file = new File(fileName);

			if (file.exists()) {
				BufferedReader reader = Files.newBufferedReader(path);
				String line;

				char temp;
				int tempNumber;
				while ((line = reader.readLine()) != null) {
					String[] var = line.split(" ");
					for (int i = 0; i < var.length; i++) {
						for (int j = 0; j < var[i].length(); j++) {
							temp = var[i].charAt(j);

							if (chars.contains(temp)) {
								tempNumber = numOfChar.get(chars.indexOf(temp));
								numOfChar.set(chars.indexOf(temp), (tempNumber + 1));
							} else {
								chars.add(temp);
								numOfChar.add(1);
							}
						}

					}

				}
				for (int i = 0; i < chars.size(); i++) {
					System.out.println("Char " + chars.get(i) + " apears in file "
							+ (numOfChar.get(i) == 1 ? numOfChar.get(i) + " time." : numOfChar.get(i) + " times."));
				}
				reader.close();

			} else {
				System.out.println("File does not exists!");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			input.close();
		}
	}

}
