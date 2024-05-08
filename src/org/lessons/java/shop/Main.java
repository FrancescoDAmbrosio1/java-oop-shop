package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		
		Prodotto p1 = new Prodotto();
		p1.Prodotto("TV", "SCHERMOPIATTO", 29.90, 21);
		p1.prezzoBase();
		p1.prezzoConIva();
		p1.nomeEsteso();

	}

}
