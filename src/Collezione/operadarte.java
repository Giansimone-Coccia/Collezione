package Collezione;
import java.util.Scanner;

/**
 * Definizione di una classe astratta operadarte
 * @author gians_ji5genm
 *
 */
public abstract class operadarte {

	Scanner input = new Scanner(System.in);

	private String titolo;
	private String artista;

	/**
	 * Definizione di una classe astratta operadarte
	 * @param titolo
	 * @param artista
	 */
	public operadarte(String titolo, String artista) {
		this.titolo = titolo;
		this.artista = artista;
	}


	/**
	 * Classe astratta
	 * @return
	 */
	public abstract double ingombro();
	/**
	 * Classe astratta
	 */
	public abstract boolean equals(Object o);

	/**
	 * Metodo per il calcolo dell'ingombro
	 */
	public void printingombro() {
		System.out.println("Lopera occupa "+ ingombro() + "");
	}

	/**
	 * Metodo per ottenre il titolo
	 * @return titolo
	 */
	public String getTitolo() {
		return this.titolo;
	}
	/**
	 * Metodo per ottenre l'artista
	 * @return artista
	 */
	public String getArtista() {
		return artista;
	}

}
