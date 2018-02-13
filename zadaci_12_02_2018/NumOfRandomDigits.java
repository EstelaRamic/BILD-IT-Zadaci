package zadaci_12_02_2018;
/* Napišite program koji generiše 100 nasumiènih cijelih brojeva izmeðu 0 i 9 te ispisuje koliko se puta koji broj ponovio.*/

public class NumOfRandomDigits {
	/** Metoda koja kreira niz od 100 cifara */
	public static int[] kreirajNizBrojeva() {
		// deklarisati i kreirati niz cifara duzine 100
		int[] brojevi = new int[100];

		// nasumicno generisati cifre i dodijeliti ih nizu
		for (int i = 0; i < brojevi.length; i++) {
			brojevi[i] = (int) (Math.random() * 10);
		}
		// vrati niz
		return brojevi;
	}

	/** Metoda koja ispisuje niz karaktera */
	public static void ispisiNiz(int[] brojevi) {
		// ispisati 25 brojeva po liniji
		for (int i = 0; i < brojevi.length; i++) {
			if ((i + 1) % 25 == 0) {
				System.out.println(brojevi[i]);
			} else {
				System.out.print(brojevi[i] + " ");
			}
		}
		System.out.println();
	}

	/** Metoda koja broji ponavljanja svake cifre */
	public static int[] prebrojiCifre(int[] brojevi) {
		// deklarisati i kreirati int niz duzine 26
		int[] brojac = new int[10];
		// prebroji sva mala slova u nizu
		for (int i = 0; i < brojevi.length; i++) {
			brojac[brojevi[i] - 0]++;
		}
		// vrati niz
		return brojac;
	}

	/** Metoda koja ispisuje broj ponavljanja karaktera */
	public static void ispisiBrojPonavljanjaCifara(int[] brojac) {
		for (int i = 0; i < brojac.length; i++) {
			// ispisati 5 karaktera po liniji
			if ((i + 1) % 5 == 0) {
				System.out.println(i + " : " + brojac[i]);
			} else {
				System.out.print(i + ": " + brojac[i] + ",   ");
			}
		}
	}

	/** Main metoda */
	public static void main(String[] args) {
		// deklarisati i kreirati niz
		int[] brojevi = kreirajNizBrojeva();

		// ispisati niz na konzoli
		System.out.println("100 sluèajnih cifara je: \n");
		ispisiNiz(brojevi);

		// prebrojati ponavljanje svakog karaktera
		int[] brojac = prebrojiCifre(brojevi);

		// ispisati broj ponavljanja karkatera
		System.out.println("Broj ponavljanja svake cifre: \n");
		ispisiBrojPonavljanjaCifara(brojac);
	}

}
