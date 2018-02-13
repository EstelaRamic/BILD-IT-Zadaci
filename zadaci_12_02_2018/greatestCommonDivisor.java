package zadaci_12_02_2018;
// Napisati metodu koja prima dva cijela broja kao argumente te vraæa najveæi zajednièki djelilac za ta dva broja.

import java.util.Scanner;

public class greatestCommonDivisor {

	public static int GCD(int a, int b)
	{
	    int r;

	    if((a == 0) || (b == 0))
	        return 0;
	    else if((a < 0) || (b < 0))
	        return -1;

	    do	//Euklidov algoritam
	    {
	        r = a % b;
	        if(r == 0)
	            break;
	        a = b;
	        b = r;
	    }
	    while(true);

	    return b;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Unesite prvi broj: ");
		num1 = input.nextInt();
		
		System.out.println("Unesite drugi broj: ");
		num2 = input.nextInt();
		
		input.close();
	    
	    System.out.printf("Najveci zajednicki djelilac za brojeve %d i %d je %d\n", num1, num2, GCD(num1, num2));

	}

}
