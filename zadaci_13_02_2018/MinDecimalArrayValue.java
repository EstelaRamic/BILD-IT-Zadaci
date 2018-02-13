package zadaci_13_02_2018;

import java.util.Scanner;

/* Napisati metodu koja nalazi najmanji element u nizu decimalnih vrijednosti koristeæi se sljedeæim headerom:
public static double min(double[ ] array)
Napišite potom test program koji pita korisnika da unese deset brojeva te poziva ovu metodu da vrati najmanji element u nizu. */


public class MinDecimalArrayValue {

	public static double min(double[ ] array){
		double min=array[0];
		for (int i =0; i<array.length; i++){
			if (array[i]<min){
				min=array[i];
			}
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		double[] numbers= new double[10];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite 10 realnih brojeva (u decimalnom zapisu) :");
		for (int i=0; i<10; i++){
			numbers[i] = input.nextDouble();
		}
		
		input.close();
		System.out.println("Najmanji elelement u nizu je " + min(numbers));

	}

}
