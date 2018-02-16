package zadaci_14_02_2018;
/*/* Napisati program koji simulira nasumièno izvlaèenje karte iz špila od 52 karte. 
 * Program treba ispisati koja karta je izvuèena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K) 
 * te znak u kojem je data karta (Srce, Pik, Djetelina, Kocka). Primjer: Karta koju ste izvukli je 10 u znaku kocke. 
 */
 
import java.util.Scanner;

public class RandomCard {
	public static void main(String[] args) {
		// kreirati novi Scanner
		Scanner unos = new Scanner(System.in);
		
		int cardNum = (int) (Math.random() * 14);
		int cardSign = (int) (Math.random() * 5);
		String cardNumIspis="0";
		String cardSignIspis="";
		
		switch (cardNum){
		case 1: 
			cardNumIspis="A";
			break;
		case 11: 
			cardNumIspis="J";
			break;
		case 12: 
			cardNumIspis="Q";
			break;
		case 13: 
			cardNumIspis="K";
			break;
		case 10:
			cardNumIspis="10";
			break;
	    default:
	    	cardNumIspis=Character.toString((char)('0'+cardNum));
	    	break;
		}
		
		switch (cardSign){
		case 1: 
			cardSignIspis="HERC";
			break;
		case 2: 
			cardSignIspis="PIK";
			break;
		case 3: 
			cardSignIspis="TREF";
			break;
		case 4: 
			cardSignIspis="KARO";
			break;
		}
		
		System.out.println("Card you pull from pile is " + cardNumIspis + " with sign " + cardSignIspis);
		
		unos.close();

	}
}
