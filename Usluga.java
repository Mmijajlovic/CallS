package Telefon;

public abstract class Usluga {

	protected Broj broj_sa,broj_ka;

	public Usluga(Broj broj_sa, Broj broj_ka) {
		super();
		this.broj_sa = broj_sa;
		this.broj_ka = broj_ka;
	}
	
	public abstract int cenaUsluge();
	
	
	@Override
	public String toString() {
		return broj_sa + " -> " + broj_ka; 
	}
}
