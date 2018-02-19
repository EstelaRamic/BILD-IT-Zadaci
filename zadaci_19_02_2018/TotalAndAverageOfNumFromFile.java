package zadaci_19_02_2018;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class TotalAndAverageOfNumFromFile {
	


		public static void main(String[] args) throws IOException {
			Path path = Paths.get("scores.txt");
			BufferedReader reader = Files.newBufferedReader(path);
			String line;
			// while ((line = reader.readLine()) != null){
			// System.out.println(line);
			// }
			// reader.close();
			// }
			//
			// String s;

			ArrayList<Integer> scores = new ArrayList<Integer>();
			int sum=0;
			
			while ((line = reader.readLine()) != null) {

				String[] var = line.split(" ");
				for (int i = 0; i < var.length; i++) {
					scores.add(Integer.parseInt(var[i]));
					System.out.print(scores.get(i) + "  ");
					sum += scores.get(i);
				}
			}
			System.out.println();
			System.out.println(" Total is : " + sum);
			System.out.println(" Average is : " + (double)(sum/scores.size()));
			reader.close();
		}
	
}
