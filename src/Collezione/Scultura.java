package Collezione;

public class Scultura extends operadarte{

	protected double altezza;
	protected double larghezza;
	protected double profondita;

	public Scultura(String titolo, String artista, double altezza, double larghezza, double profondita) {
		super(titolo, artista);

		this.altezza = altezza;
		this.larghezza = larghezza;
		this.profondita = profondita;
	}

	public double ingombro() {
		return altezza*larghezza*profondita;
	}

	public boolean equals(Object o) {
		if(o instanceof Scultura) {
			Scultura s = (Scultura) o;
			return ((s.altezza==this.altezza) && (s.larghezza==this.larghezza));
		}
		return false;
	}

}
