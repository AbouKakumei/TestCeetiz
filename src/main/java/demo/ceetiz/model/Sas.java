package demo.ceetiz.model;

public class Sas extends Societe {
	private String Adresse;
	private long impotSas;
	
	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}


	public Sas(String numSiret, String dénomination, Long ca) {
		super(numSiret, dénomination, ca);
		// TODO Auto-generated constructor stub
	}
	public long getCaForSas() {
		
		this.impotSas = (33 +this.getCA() /100)* this.impotSas;
		return this.impotSas;
		
	}

	


}
