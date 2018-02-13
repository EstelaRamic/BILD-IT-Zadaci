package zadaci_13_02_2018;

/* Napisati metodu koja vraæa lokaciju najveæeg elementa u 2D nizu. Metoda treba da koristi sljedeæi header:
		public static int[ ] locateLargest(double[ ][ ] a)
Napisati test program koji pita korisnika da unese 2D niz te mu ispisuje lokaciju najveæeg elementa u nizu. */

public class MaxElementIn2DArray {
	public static int[ ] locateLargest(double[ ][ ] a){
		double maxEl=a[0][0];
		int[] lokacija = new int[2];
		
		for (int red = 0; red < a.length; red++) {
			for (int kolona = 0; kolona < a[red].length; kolona++) {
				if (a[red][kolona]>maxEl){
					maxEl=a[red][kolona];
					lokacija[0]=red;
					lokacija[1]=kolona;
				};
			}
		}
		return lokacija;
	}
	
	public static void main(String[] args) {
		java.util.Scanner unos = new java.util.Scanner(System.in);
		
		System.out.print("Unesite broj redova i kolona matrice?");
		int n=unos.nextInt();
		int m=unos.nextInt();
		
		double[][] matrica = new double[n][m];
		
		System.out.println("Unesite " + matrica.length + " x " + matrica[0].length + " matricu: ");
		for (int red = 0; red < matrica.length; red++) {
			for (int kolona = 0; kolona < matrica[red].length; kolona++) {
				matrica[red][kolona] = unos.nextDouble();
			}
		}
		unos.close();
		
		int[] lokacija = new int[2];
		
		lokacija=locateLargest(matrica);
		
		System.out.println("Lokacija najveæeg elementa: ("+lokacija[0]+", "+lokacija[1]+")");
	}


}
