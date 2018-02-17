package zadaci_16_02_2018;
/* Zamislite da ste u naslijeðe dobili neku parcelu, predstavljenu kao matrica ispunjena sa karaterima x i o, 
 * na svakoj poziciji na kojoj je x znaèi da na tom mjestu raste drvo,olakštajte posao voji i napiši te program 
 * koji ispisuje koliko imate šumaraka na vašoj parceli, za dio parcele koji nazivamo šumarkom mora da sadrži 
 * najmanje 3-4 ulanèana 'x' karaktera. Nakon pokretanja programa od korisnika možete tražiti da unese velièinu 
 * parcele a program ispisuje generisanu "parcelu" matricu i ispisuje koliko šumaraka se nalazi na toj parceli
 */

public class Holts {

	public static void main(String[] args) {
		int n=8, m=13;
		char[][] parcela = new char[n][m];
		parcela = inicajaliziraj2DNiz(n, m); // inicijalizacija parcele
		System.out.println("Parcela je zadana slucajno generisanom matricom:");
		ispis2Dniza(parcela);
		System.out.println();

		// prirastaji za posjecivanje polja: gore, desno, dolje, lijevo
		int[] prX = { -1, -1, 0, 1, 1, 1, 0, -1 };
		int[] prY = { 0, 1, 1, 1, 0, -1, -1, -1 };
	
		int holtNum=0;
		int broj=0;
		
		for(int i=0; i<n;i++){
			for(int j=0; j<m; j++){
				if (parcela[i][j]=='x'){
					
					broj= Count(i,j,holtNum, prX, prY, n, m, parcela, broj);
					holtNum++;
					//System.out.println("Parcela " + holtNum + " broji " + broj + " drveca");
				}
			}
		}
		
		System.out.println("Ako bi svako drvo šumarka numerisali njegovim rednim brojem, parcela bi izgledala:");
		ispis2Dniza(parcela);
		System.out.println();
		System.out.println("Na parceli su "+ (holtNum) + " sumarka.");

	}

	public static boolean isTree(int x, int y, int n, int m, char[][] parcela) {
		return ((x >= 0) && (x < n) && (y >= 0) && (y < m) && (parcela[x][y] == 'x'));
	}

	public static int Count(int x, int y, int Num, int[] prX, int[] prY, int n, int m, char[][] parcela, int broj) {
		int i;
		parcela[x][y] = (char) (Num + 49);
		broj++;
		for (i = 0; i < 8; i++) {
			if (isTree(x + prX[i], y + prY[i], n, m, parcela)) {
				Count(x + prX[i], y + prY[i], Num, prX, prY, n, m, parcela, broj);
			}
		}
		return broj;
	}

	public static void ispis2Dniza(char[][] matrica) {
		for (int red = 0; red < matrica.length; red++) {
			for (int kolona = 0; kolona < matrica[red].length; kolona++) {
				System.out.print(" " + matrica[red][kolona]);
			}
			System.out.println();
		}
	}

	public static char[][] inicajaliziraj2DNiz(int n, int m) {
		char[][] lista = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if ((int) (Math.random() * 2) == 1) {
					lista[i][j] = 'x';
				} else {
					lista[i][j] = 'o';
				}
			}
		}
		return lista;
	}
}
