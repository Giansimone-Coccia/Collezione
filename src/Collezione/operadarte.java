package Collezione;
import java.util.Scanner;

//Definizione di una classe astratta operadarte
public abstract class operadarte {

	Scanner input = new Scanner(System.in);

	private String titolo;
	private String artista;

	//Costrutttore
	public operadarte(String titolo, String artista) {
		this.titolo = titolo;
		this.artista = artista;
	}


	//Definizione di alcuni metodi astratti
	public abstract double ingombro();

	public abstract boolean equals(Object o);

	//Metodo per il calcolo dell'ingombro
	public void printingombro() {
		System.out.println("Lopera occupa "+ ingombro() + "");
	}

	//Vari metodi get e set
	public String getTitolo() {
		return this.titolo;
	}

	public String getArtista() {
		return artista;
	}

}
