package zadaci_19_02_2018;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesPathTest {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("test.txt");

		System.out.println("Da li fajl postoji?" + Files.exists(path));
		System.out.println("Velicina fajla " + Files.size(path) + " bajta.");
		System.out.println("Da li fajl moze biti procitan? " + Files.isReadable(path));

	}

}
