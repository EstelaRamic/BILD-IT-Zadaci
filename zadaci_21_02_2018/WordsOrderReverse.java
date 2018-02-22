package zadaci_21_02_2018;

/* 4. Napisati program koji kao argument prima ime filea. 
 * U fileu – jedna linija, jedna reèenica. 
 * Ispisati sve reèenice iz filea u obrnutom redosljedu rijeèi. 
 * (Npr. ukoliko je prva reèenica u fileu “Hello World“ program treba da ispiše “World Hello“)
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
import java.util.Scanner;

public class WordsOrderReverse {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of file:");
		String fileName = input.nextLine();

		Path path = Paths.get(fileName);
		
		File tempFile = new File(fileName);

		

		try {

			// provjerava da li fajl.tmp postoji, inaèe ga kreira
			if (!tempFile.exists()) {
				tempFile.createNewFile();
			}

			printWordsOrderReverse(path);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			input.close();
		}

	}

	public static void printWordsOrderReverse(Path path) throws IOException {
		BufferedReader reader = Files.newBufferedReader(path);
		String line;


		System.out.println();
		System.out.println("Words from file  \"" + path + "\"  in reverse order by each line:");
		System.out.println("-------------------------------------------------------");
		
		while ((line = reader.readLine()) != null) {
			String[] var = line.split(" ");
			for(int i=var.length; i>0; i--){
				System.out.print(var[i-1]+" ");
			}
			System.out.println();
		}
		reader.close();

	}

}
