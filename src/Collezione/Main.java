package Collezione;
import java.util.Scanner;
/**
 * Main class
 * @author gians_ji5genm
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Collezione collection = new Collezione("Leonardo Da Vinci", "Firenze");

		int scelta;
		do {
			System.out.println("MENU");
			System.out.println("1) Inserisci opera");
			System.out.println("2) Accedere ad un'opera");
			System.out.println("3) Stampare la collezione");
			System.out.println("0) Per uscire");
			System.out.print("Scelta: ");
			scelta = input.nextInt();

			switch(scelta) {
			case 1:
				collection.inserisciOpera();
				break;
			case 2:
				String frase = collection.accediOpera();
				System.out.println(frase);
				break;
			case 3:
				collection.visualizzaCollezione();
				break;
			case 0:
				System.out.println("Arrivederci!");
				return;
			default:
				System.out.println("Carattere non consentito, rirpova");
			}
		} while(scelta != 0);
		input.close();
	}

}
