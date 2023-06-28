package com.example.ApiTons;


public class ConjuntoNotas {
	private String acorde;
	
	public ConjuntoNotas(String acorde) {
		this.acorde = acorde;
	}
	
	public void setAcorde(String acorde) {
		this.acorde = acorde;
	}
	
	public String getAcorde() {
		return filtrarAcorde(acorde);
	}
	
	public String filtrarAcorde(String acorde) {
		acorde = acorde.replaceAll("/.*", "");
		acorde = acorde.replaceAll("\\d.*", "");
		acorde = acorde.replaceAll("\\(.*","");
		acorde = acorde.replaceAll("[^ABCDEFGm#b]", "");
	
		return acorde;
	}
	
	
}

