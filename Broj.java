package Telefon;


public class Broj {
	private String kod_drzave;
	private String pozivni_broj;
	private String broj_telefona;
	private boolean fiksni_tel;

	public Broj(String kod_drzave,String pozivni_broj, String broj_telefona, boolean fiksni_tel) {
		this.kod_drzave = kod_drzave;
		this.broj_telefona = broj_telefona;
		this.fiksni_tel = fiksni_tel;
		this.pozivni_broj=pozivni_broj;
	}

	public boolean isFiksni_tel() {
		return fiksni_tel;
	}
	
	public boolean Provera(Broj b1) {
		return this.kod_drzave==b1.kod_drzave;
	}
	
	
	@Override
	public String toString() {
		return "+" + kod_drzave + " " + pozivni_broj + " " + broj_telefona;
	}

}
