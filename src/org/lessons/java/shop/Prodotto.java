package org.lessons.java.shop;

public class Prodotto {
	private int codice;
	public String nome;
	public String descrizione;
	public double prezzo;
	public double iva;
	
	public void Prodotto(String nome, String descrizione, double prezzo, double iva) {
		this.codice = creaCodice();
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	
	public int creaCodice() {
		double codiceProvvisorio = Math.random();
		codice =  (int) (codiceProvvisorio * 100);
		return codice;
	}
	public void prezzoBase() {
		System.out.println("Il prezzo base del prodotto " + nome + " è: " + prezzo + " €");
	}
	public double prezzoConIva() {
		double prezzoIva =  prezzo + (prezzo * (iva/100));
		System.out.println("Il prezzo con IVA al " + iva + "% del prodotto " + nome + 
				" è: " + prezzoIva + " €");
		return prezzoIva;
	}
	public void nomeEsteso() {
		System.out.println("Il nome esteso del prodotto è: " + codice + "-" + nome);
	}
//	public static int codiceLeftPad() {
//		int codiceEsteso;
//		if(codice)
//		return codiceEsteso;
//	}
}
