package zadaci_21_02_2018;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 9. Napisati program koji èita reèenice iz filea i vraæa svaku rijeè u reèenicu sa poèetnim velikim slovom. 
 * Da li æe program da prima ime filea kao argument ili ne, na vama je. 
 * (Reèenica “Hello world“ u outputu treba biti pretvorena u “Hello World“)
 */


public class UpercaseWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of file:");
		String fileName = input.nextLine();

		Path path = Paths.get(fileName);

		try {

			File file = new File(fileName);

			if (file.exists()) {

				printUpercaseWords(path);
			} else {
				System.out.println("File does not exists!");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			input.close();
		}

	}

	public static void printUpercaseWords(Path path) throws IOException {
		BufferedReader reader = Files.newBufferedReader(path);
		String line;
		
		while ((line = reader.readLine()) != null) {
			String[] var = line.split(" ");
			for(int i=0; i<var.length; i++){
				char temp=var[i].charAt(0);
				var[i]=Character.toUpperCase(temp)+var[i].substring(1);
				System.out.print(var[i]+" ");
			}
			System.out.println();
			
		}
		reader.close();

	}


}
