package demo.ceetiz.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Societe implements Serializable {
	@Id @GeneratedValue
	private String numSiret;
	
	private String dénomination;
	
	private Long CA;

	public String getNumSiret() {
		return numSiret;
	}

	public void setNumSiret(String numSiret) {
		this.numSiret = numSiret;
	}

	public String getDénomination() {
		return dénomination;
	}

	public void setDénomination(String dénomination) {
		this.dénomination = dénomination;
	}

	public Long getCA() {
		return CA;
	}

	public void setCA(Long cA) {
		CA = cA;
	}

	public Societe(String numSiret, String dénomination, Long cA) {
		super();
		this.numSiret = numSiret;
		this.dénomination = dénomination;
		CA = cA;
	}




}