package zadaci_21_02_2018;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 8. Napisati program koji prima kao argument ime filea. 
 * Nakon što je program uèitao file, vraæa korisniku sve reèenice iz filea sa razmacima
 * izmeðu rijeèi uklonjenim. 
 */

public class RemoveBlanks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of file:");
		String fileName = input.nextLine();

		Path path = Paths.get(fileName);

		try {

			File file = new File(fileName);

			if (file.exists()) {

				printWithoutBlanks(path);
			} else {
				System.out.println("File does not exists!");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			input.close();
		}

	}

	public static void printWithoutBlanks(Path path) throws IOException {
		BufferedReader reader = Files.newBufferedReader(path);
		String line;

		System.out.println("The lines without blanks are:");
		System.out.println("------------------------------------");
		while ((line = reader.readLine()) != null) {
			String[] var = line.split(" ");
			for (int i = 0; i < var.length; i++) {
				System.out.print(var[i]);
			}
			System.out.println();
		}
		reader.close();

	}

}
