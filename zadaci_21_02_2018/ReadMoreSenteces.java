package zadaci_21_02_2018;
/* 5. Napisati program koji kao argument prima ime filea. Nakon što je korisnik unio ime filea, 
 * program prolazi kroz file te ispisuje reèenice iz filea po sljedeæim pravilima:
	a. Ukoliko je dužina reèenice manja od 55 karaktera, ispisati reèenicu bez ikakvih promjena.
	b. Ukoliko je dužina reèenice veæa od 55 karaktera, promijeniti reèenicu na sljedeæi naèin:
		i. Smanjiti dužinu reèenice na 40 karaktera
		ii. Dodati string ... <Read More> na kraj reèenice
		iii. Ispisati promjenjenu reèenicu na konzoli
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

			// provjerava da li fajl postoji, inaèe ga kreira
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
