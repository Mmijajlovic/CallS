package Telefon;

public class Poziv extends Usluga {

	private int trajanje_sekunde;
	
	
	public Poziv(Broj broj_sa, Broj broj_ka,int trajanje_sekunde) {
		super(broj_sa, broj_ka);
		this.trajanje_sekunde=trajanje_sekunde;
	}

	@Override
	public int cenaUsluge() {
		int cena=0,minuti=0;
		
		minuti=(trajanje_sekunde+59)/60;
		
		if(minuti==0) {
			return cena;
		}
		
		
		if(broj_sa.Provera(broj_ka)) {
			cena=minuti*10;
			return cena;
		}
		else {
			cena=30+minuti*50;
			return cena;
		}
		
		
	}
	
	@Override
	public String  toString() {
		return super.toString()+"("+(trajanje_sekunde / 60)+":"+(trajanje_sekunde % 60)+")";
	}

}
