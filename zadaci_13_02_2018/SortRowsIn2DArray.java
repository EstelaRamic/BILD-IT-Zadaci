package zadaci_13_02_2018;

/* Implementirati sljedeæu metodu da sortira redove u 2D nizu.
		public static double[ ][ ] sortRows(double[ ][ ] array)
Napisati testni program koji pita korisnika da unese 3x3 matricu (ili da pita korisnika koliku matricu želi unijeti) te mu ispisuje na konzoli matricu sa sortiranim redovima - od najmanjeg broja do najveæeg. */


public class SortRowsIn2DArray {
	
	public static double[ ][ ] sortRows(double[ ][ ] array){
		
		for(int row=0; row<array.length; row ++){
			java.util.Arrays.sort(array[row]);
		}
		return array;
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
		
		matrica = sortRows(matrica);
		
		System.out.println("Sortirana matrica po redovima: ");
		for (int red = 0; red < matrica.length; red++) {
			for (int kolona = 0; kolona < matrica[red].length; kolona++) {
				System.out.print(matrica[red][kolona]+ "  ");
			}
			System.out.println();
		}
		
	}

}
