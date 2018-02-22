package zadaci_21_02_2018;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 6. Napisati program koji prima kao argument ime filea. 
 * Nakon što je program uèitao file, nalazi najdužu rijeè u svakoj liniji teksta 
 * te ispisuje istu korisniku.
 */
public class LongestWordInLine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of file:");
		String fileName = input.nextLine();

		Path path = Paths.get(fileName);

		try {

			File file = new File(fileName);

			if (file.exists()) {

				printLongestWords(path);
			} else {
				System.out.println("File does not exists!");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			input.close();
		}

	}

	public static void printLongestWords(Path path) throws IOException {
		BufferedReader reader = Files.newBufferedReader(path);
		String line;
		String maxWord = "";
		System.out.println("The longest words in each line are:");
		System.out.println("------------------------------------");
		while ((line = reader.readLine()) != null) {
			String[] var = line.split(" ");
			maxWord = var[0];
			for (int i = 1; i < var.length; i++) {
				if (maxWord.length() < var[i].length()) {
					maxWord = var[i];
				}
			}
			System.out.println(maxWord);
		}
		reader.close();

	}

}
