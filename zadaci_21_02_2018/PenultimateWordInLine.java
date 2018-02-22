package zadaci_21_02_2018;
/* 7. Napisati program koji prima kao argument ime fiela. 
 * Nakon što je program uèitao file, nalazi predzadnju rijeè na svakoj liniji teksta 
 * te ispisuje istu korisniku.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PenultimateWordInLine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of file:");
		String fileName = input.nextLine();

		Path path = Paths.get(fileName);

		try {

			File file = new File(fileName);

			if (file.exists()) {

				printPenultimatetWords(path);
			} else {
				System.out.println("File does not exists!");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			input.close();
		}

	}

	public static void printPenultimatetWords(Path path) throws IOException {
		BufferedReader reader = Files.newBufferedReader(path);
		String line;
		
		System.out.println("The penultimate words in each line are:");
		System.out.println("------------------------------------");
		while ((line = reader.readLine()) != null) {
			String[] var = line.split(" ");
			
			System.out.println(var[var.length-2]);
		}
		reader.close();

	}


}
