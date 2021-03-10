package Telefon;

public class Main {

	public static void main(String[] args) {
		Broj b1 = new Broj("381", "64", "0000000", false);
		Broj b2 = new Broj("381", "11", "0000000", true);
		Broj b3 = new Broj("454", "59", "0000000", false);
		Poziv poziv = new Poziv(b1, b3, 253);
		System.out.println(poziv);
		System.out.println(b1);
		System.out.println(poziv.cenaUsluge());

	}

}
