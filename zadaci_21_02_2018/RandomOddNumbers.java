package zadaci_21_02_2018;
/* 10. Napisati program koji uèitava neodreðen broj brojeva iz filea te ispisuje samo neparne brojeve. 
 * File možete nasumièpno generisati.
 * Program može da prima ime filea kao argument a i ne mora. Na vama je.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class RandomOddNumbers {

	public static void main(String[] args) throws IOException {
		generateFileWithNumbers();
		Path path = Paths.get("numbers.txt");
		BufferedReader reader = Files.newBufferedReader(path);
		String line;
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		while ((line = reader.readLine()) != null) {

			String[] var = line.split(" ");
			for (int i = 0; i < var.length; i++) {
				numbers.add(Integer.parseInt(var[i]));
				if (numbers.get(i) % 2 != 0) {
					System.out.print(numbers.get(i) + "  ");
				}

			}
		}
		System.out.println();

		reader.close();
	}

	public static void generateFileWithNumbers() throws IOException {
		int n = (int) (Math.random() * 100);
		int temp;
		String fileName = "numbers.txt";
		
		File tempFile = new File(fileName);

		
		// true = append file - dozvoljeno dodavanje na kraj fajla
		FileWriter fw = new FileWriter(tempFile.getAbsoluteFile(), true);
		BufferedWriter bw = new BufferedWriter(fw);
		for (int i = 0; i < n; i++) {
			temp= (int) (Math.random() * 100);
			//System.out.print(temp+" ");
			bw.write(temp + " ");
		}
		
		bw.close();
		fw.close();
		
	}
}
