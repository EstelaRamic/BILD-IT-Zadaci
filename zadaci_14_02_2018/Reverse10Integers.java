package zadaci_14_02_2018;
/*/* Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom redosljedu. 
 * */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reverse10Integers {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		//boolean continueInput = true;
		int[] numbers=new int[10];
		int i=0;
		
		do {
			try{
			System.out.print("enter " + (i+1) + ". integer: ");
			numbers[i] = unos.nextInt();
						
			i++;
			//continueInput = false;
			}catch (InputMismatchException ex){
				System.out.println("Tray again. (" + "Incorect input. An integer is expected.)");
				System.out.println("---------------------------------------------------");
				unos.nextLine(); // discard input
			}
		} while (i<10);
		
		System.out.println("Numbers in reverse order are:");
		for(i=9; i>=0; i--){
			System.out.print(numbers[i] + "   ");
		}
		
		unos.close();

	}

}
