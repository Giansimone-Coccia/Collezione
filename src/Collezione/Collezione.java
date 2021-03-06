package Collezione;
import java.util.Scanner;
import java.util.Vector;
/**
 * Public class Collezione
 * @author gians_ji5genm
 *
 */
public class Collezione {
	private String nome;
	private String luogo;
	private Vector<operadarte> opere;

	//Creo l'oggetto per l'input
	Scanner input = new Scanner(System.in);

	/**
	 * Constructor 
	 * @param nome opera
	 * @param luogo opera
	 */
	public Collezione(String nome, String luogo) {
		this.nome = nome;
		this.luogo = luogo;
		opere = new Vector<operadarte>();
	}

	/**
	 * Metodo per l'inserimento di una nuova opera d'arte
	 * nella collezione
	 */
	public void inserisciOpera() {
		System.out.println("Inserisci tipologia opera d'arte [Q/S]");
		String lettera = input.next();
		if(lettera.charAt(0) == 'Q' || lettera.charAt(0) == 'q') {
			System.out.println("Inserisci titolo: ");
			String titolo = input.next();
			System.out.println("Inserisci artista: ");
			String artista = input.next();
			System.out.println("Inserisci altezza: ");
			double altezza = input.nextDouble();
			System.out.println("Inserisci larghezza: ");
			double larghezza = input.nextDouble();
			Quadro q = new Quadro(titolo, artista, altezza, larghezza);
			opere.add(q);
		}
		else {
			System.out.println("Inserisci titolo: ");
			String titolo = input.next();
			System.out.println("Inserisci artista: ");
			String artista = input.next();
			System.out.println("Inserisci altezza: ");
			double altezza = input.nextDouble();
			System.out.println("Inserisci larghezza: ");
			double larghezza = input.nextDouble();
			System.out.println("Inserisci profondita: ");
			double profondita = input.nextDouble();
			Scultura s = new Scultura(titolo, artista, altezza, larghezza, profondita);
			opere.add(s);
		}
	}

	/**
	 * Metodo per l'accesso ad un'opera d'arte tramite l'inserimento 
	//del nome
	 * @return true se l'operazione ? stata eseguita con successo,
	 * false altrimenti
	 */
	public String accediOpera() {
		System.out.println("Inserisci titolo: ");
		input.next();
		String titoloOp = input.nextLine();
		for(int i = 0; i < opere.size(); i++) {
			if(titoloOp.equals(opere.get(i).getTitolo()))
				return opere.get(i).getTitolo() + " " + opere.get(i).getArtista();
		}
		return null;
	}

	/**
	 * Metodo per la visualizzazione dell'intera collezione
	 */
	public void visualizzaCollezione() {
		for(int i = 0; i < opere.size(); i++) {
			System.out.print(opere.get(i).getTitolo()+ " ");
			System.out.print(opere.get(i).getArtista()+ " ");
			System.out.println(" ");
		}
	}

	/**
	 * Metodo per ottenre il nome
	 * @return nome opera
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Metodo per ottenre il luogo
	 * @return luogo
	 */
	public String getLuogo() {
		return luogo;
	}
}
