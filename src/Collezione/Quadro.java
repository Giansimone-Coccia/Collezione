package Collezione;

public class Quadro extends operadarte{

	protected double altezza;
	protected double larghezza;

	public Quadro(String titolo, String artista, double altezza, double larghezza) {
		super(titolo, artista);

		this.altezza = altezza;
		this.larghezza = larghezza;
	}

	public double ingombro() {
		return altezza*larghezza;
	}

	public boolean equals(Object o) {
		if(o instanceof Quadro) {
			Quadro q = (Quadro) o;
			return ((q.altezza==this.altezza) && (q.larghezza==this.larghezza));
		}
		return false;
	}

}
