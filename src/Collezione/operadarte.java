package Collezione;
import java.util.Scanner;

public abstract class operadarte {

	Scanner input = new Scanner(System.in);

	private String titolo;
	private String artista;

	public operadarte(String titolo, String artista) {
		this.titolo = titolo;
		this.artista = artista;
	}


	public abstract double ingombro();

	public abstract boolean equals(Object o);

	public void printingombro() {
		System.out.println("Lopera occupa "+ ingombro() + "");
	}

	public String getTitolo() {
		return this.titolo;
	}

	public String getArtista() {
		return artista;
	}

}
