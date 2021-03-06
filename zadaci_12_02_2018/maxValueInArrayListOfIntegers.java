package zadaci_12_02_2018;
/* Napisati sljede�u metodu koja vra�a najve�u vrijednosti u ArrayListu Integera. Metoda vra�a null ukoliko je lista null iil ukoliko lista sadr�i 0 elemenata.
public static Integer max(ArrayList<Integer> list) */

import java.util.ArrayList;

public class maxValueInArrayListOfIntegers {

	public static Integer max(ArrayList<Integer> list){
	
		
		if (!list.isEmpty() && (list!=null)) {

			Integer max = list.get(0);
			
			for (Integer temp : list) {
				if (temp > max) {
					max = temp;
				}
			}
			return max;
		}else {
			return null;
		}
		
	}
	
	public static void main(String[] args){
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		int rand;
		int n=15; // broj elemenata liste
		
		System.out.println("Lista " + n + " slucajnih brojeva:");
		for (int i=1; i<=n; i++){
			rand=(int)(Math.random()*100)+1;
			list.add(rand);
			System.out.print(rand + "   ");
		}
		System.out.println();
		if(max(list)!=null){
			System.out.println("Maximalni elelement liste je " + max(list));
		}else{
			System.out.println("NULL.");
		}
	}
	
}
