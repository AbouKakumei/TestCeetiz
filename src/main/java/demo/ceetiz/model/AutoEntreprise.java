package demo.ceetiz.model;

public class AutoEntreprise extends Societe {
	private long impotCA;

	

	public AutoEntreprise(String numSiret, String dénomination, Long ca) {
		super(numSiret, dénomination, ca);
		// TODO Auto-generated constructor stub
	}
	
	public long getCaForAe() {
		
		this.impotCA = (25 +this.getCA() /100)* this.impotCA;
		return this.impotCA;
		
	}

}
