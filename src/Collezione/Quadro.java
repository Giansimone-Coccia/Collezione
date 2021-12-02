package Collezione;

/**
 * Classe che stende la classe astratta operadarte
 * @author gians_ji5genm
 *
 */
public class Quadro extends operadarte{

	protected double altezza;
	protected double larghezza;

	/**
	 * Costruttore
	 * @param titolo
	 * @param artista
	 * @param altezza
	 * @param larghezza
	 */
	public Quadro(String titolo, String artista, double altezza, double larghezza) {
		super(titolo, artista);

		this.altezza = altezza;
		this.larghezza = larghezza;
	}

	/**
	 * Metodo per il calcolo dell'ingombro
	 */
	public double ingombro() {
		return altezza*larghezza;
	}

	/**
	 * @override equals
	 */
	public boolean equals(Object o) {
		if(o instanceof Quadro) {
			Quadro q = (Quadro) o;
			return ((q.altezza==this.altezza) && (q.larghezza==this.larghezza));
		}
		return false;
	}

}
