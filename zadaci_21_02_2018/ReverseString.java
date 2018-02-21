package zadaci_21_02_2018;

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

/* 3. Napisati program koji pita korisnika da unese neki string. 
 *    Kada korisnik unese string, program sprema isti string u file 
 *    te ispisuje korisniku sve stringove iz filea naopako. */

public class ReverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string:");
		String str = input.nextLine();

		String fileName = "fajl.txt";
		// File file = new File("fajl.txt");
		File tempFile = new File(fileName);

		Path path = Paths.get(fileName);

		try {

			// provjerava da li fajl.tmp postoji, inaèe ga kreira
			if (!tempFile.exists()) {
				tempFile.createNewFile();
			}

			// true = append file - dozvoljeno dodavanje na kraj fajla
			FileWriter fw = new FileWriter(tempFile.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(str);
			bw.newLine();

			bw.close();
			fw.close();
			
			printReverse(path);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			input.close();
		}
	
	}
	
	public static void printReverse(Path path) throws IOException {
		BufferedReader reader = Files.newBufferedReader(path);
		String line;
		ArrayList<String> list= new ArrayList<String>();
		
		while ((line = reader.readLine()) != null) {
			list.add(line);
		}
		reader.close();
		
		System.out.println();
		System.out.println("Strings from file  \""+path+ "\"  in reverse order:");
		System.out.println("-------------------------------------------------------");
		for(int i=list.size();i>0; i--){
			System.out.println(list.get(i-1));
		}
	}
	
}
