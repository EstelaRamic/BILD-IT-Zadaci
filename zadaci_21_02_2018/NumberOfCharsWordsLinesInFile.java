package zadaci_21_02_2018;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 1. Napisati program koji kao argument prima ime filea te:
	a. vraæa broj karaktera u datom fileu
	b. vraæa broj rijeèi u datom fileu
	c. vraæa broj linija teksta u datom fileu
Rijeèi su razdvojene jednim spaceom. 
*/

public class NumberOfCharsWordsLinesInFile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of file:");
		String fileName = input.nextLine();

		Path path = Paths.get(fileName);

		try {

			File file = new File(fileName);

			if (file.exists()) {
				System.out.println("File \"" + fileName + "\" has " + numOfChars(path) + " characters.");
				System.out.println("File \"" + fileName + "\" has " + numOfWords(path) + " words .");
				System.out.println("File \"" + fileName + "\" has " + numOfLines(path) + " lines.");

			} else {
				System.out.println("File does not exists!");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			input.close();
		}
	}

	public static int numOfLines(Path path) throws IOException {
		BufferedReader reader = Files.newBufferedReader(path);
		String line;
		int noLines = 0;
		while ((line = reader.readLine()) != null) {
			noLines++;
		}
		reader.close();
		return noLines;
	}

	public static int numOfWords(Path path) throws IOException {
		BufferedReader reader = Files.newBufferedReader(path);
		String line;
		int noWords = 0;
		while ((line = reader.readLine()) != null) {
			String[] var = line.split(" ");
			noWords += var.length;
		}
		reader.close();
		return noWords;
	}

	public static int numOfChars(Path path) throws IOException {
		BufferedReader reader = Files.newBufferedReader(path);
		String line;
		int noChars = 0;
		while ((line = reader.readLine()) != null) {
			String[] var = line.split(" ");
			for (int i = 0; i < var.length; i++) {
				noChars += var[i].length();
			}

		}
		reader.close();
		return noChars;
	}

}
