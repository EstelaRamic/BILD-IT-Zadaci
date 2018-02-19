package zadaci_19_02_2018;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserAskForIntegerInArray {

	public static void main(String[] args) {
		int[] numbers = new int[100];
		for (int i = 0; i < 100; i++) {
			numbers[i] = (int) (Math.random() * 1000);
		}
		Scanner input = new Scanner(System.in);
		int index=0;
		try {

			System.out.println("Enter the index of the array: ");
			index = input.nextInt();
			System.out.println("Number on the " + (index) + ". place in array is " + numbers[index-1] + " . ");

		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of bounds.");
		} catch (InputMismatchException ex) {
			System.out.println("Incorect input. Try again.");
			input.nextLine();
		} finally {
			input.close();
		}

	}

}
