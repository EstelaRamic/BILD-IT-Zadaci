package zadaci_19_02_2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadData {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("scores.txt");
		BufferedReader reader = Files.newBufferedReader(path);
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		reader.close();
	}

}
