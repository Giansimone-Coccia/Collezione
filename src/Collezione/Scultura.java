package Collezione;

/**
 * Classe che stende la classe astratta operadarte
 * @author gians_ji5genm
 *
 */
public class Scultura extends operadarte{

	protected double altezza;
	protected double larghezza;
	protected double profondita;

	/**
	 * Costruttore
	 * @param titolo
	 * @param artista
	 * @param altezza
	 * @param larghezza
	 * @param profondita
	 */
	public Scultura(String titolo, String artista, double altezza, double larghezza, double profondita) {
		super(titolo, artista);

		this.altezza = altezza;
		this.larghezza = larghezza;
		this.profondita = profondita;
	}
	
	/**
	 * Metodo per calcolare l'ingombro
	 */
	public double ingombro() {
		return altezza*larghezza*profondita;
	}
	
	/**
	 * @override equals
	 */
	public boolean equals(Object o) {
		if(o instanceof Scultura) {
			Scultura s = (Scultura) o;
			return ((s.altezza==this.altezza) && (s.larghezza==this.larghezza));
		}
		return false;
	}

}
