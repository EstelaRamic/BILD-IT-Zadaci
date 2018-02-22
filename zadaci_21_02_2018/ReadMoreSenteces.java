package zadaci_21_02_2018;
/* 5. Napisati program koji kao argument prima ime filea. Nakon �to je korisnik unio ime filea, 
 * program prolazi kroz file te ispisuje re�enice iz filea po sljede�im pravilima:
	a. Ukoliko je du�ina re�enice manja od 55 karaktera, ispisati re�enicu bez ikakvih promjena.
	b. Ukoliko je du�ina re�enice ve�a od 55 karaktera, promijeniti re�enicu na sljede�i na�in:
		i. Smanjiti du�inu re�enice na 40 karaktera
		ii. Dodati string ... <Read More> na kraj re�enice
		iii. Ispisati promjenjenu re�enicu na konzoli
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadMoreSenteces {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of file:");
		String fileName = input.nextLine();

		Path path = Paths.get(fileName);

		File tempFile = new File(fileName);

		try {

			// provjerava da li fajl postoji, ina�e ga kreira
			if (!tempFile.exists()) {
				tempFile.createNewFile();
			}

			printReadMore(path);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			input.close();
		}

	}

	public static void printReadMore(Path path) throws IOException {
		BufferedReader reader = Files.newBufferedReader(path);
		String line;

		while ((line = reader.readLine()) != null) {
			
			if (line.length() > 55) {
				int index = line.indexOf(" ", 35);
				if (index>35){
				line = line.substring(0, index) + "... <Read More>";
				} else{
					line = line.substring(0, 40) + "... <Read More>";
				}
			}
			System.out.println(line);
		}
		reader.close();

	}

}
