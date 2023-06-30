package com.example.ApiTons;
import java.util.ArrayList;

public class Escala {
    private String acorde;
    private String[] campoHarmonico;
    private String acordeEquivalente;

    private ArrayList<Escala> campos = new ArrayList<>();

    public Escala() {
        inicializarCampos();
    }

    public Escala(String acorde, String notaEquivalente, String[] campoHarmonico) {
        this.acorde = acorde;
        this.acordeEquivalente = notaEquivalente;
        this.campoHarmonico = campoHarmonico;
    }

    private void inicializarCampos() {
        String[] campoC = {"C", "Dm", "Em", "F", "G", "Am", "Bm"};
        String[] campoD = {"D", "Em", "FHm", "G", "A", "Bm", "Cm"};
        String[] campoE = {"E", "FHm", "GHm", "A", "B", "CHm", "Dm"};
        String[] campoF = {"F", "Gm", "Am", "Bb", "C", "Dm", "Em"};
        String[] campoG = {"G", "Am", "Bm", "C", "D", "Em", "FHm"};
        String[] campoA = {"A", "Bm", "CHm", "D", "E", "FHm", "GHm"};
        String[] campoB = {"B", "CHm", "DHm", "E", "FH", "GHm", "AHm"};
        String[] campoDb = {"Db", "Ebm", "Fm", "Gb", "Ab", "Bbm", "Cm"};
        String[] campoEb = {"Eb", "Fm", "Gm", "Ab", "Bb", "Cm", "Dm"};
        String[] campoGb = {"Gb", "Abm", "Bbm", "Cb", "Db", "Ebm", "Fm"};
        String[] campoAb = {"Ab", "Bb", "Cm", "Db", "Eb", "Fm", "Gm"};
        String[] campoBb = {"Bb", "Cm", "Dm", "Eb", "F", "Gm", "Am"};
        
        campos.add(new Escala("C", "Am", campoC));
        campos.add(new Escala("D", "Bm", campoD));
        campos.add(new Escala("E", "CHm", campoE));
        campos.add(new Escala("F", "Dm", campoF));
        campos.add(new Escala("G", "Em", campoG));
        campos.add(new Escala("A", "FHm", campoA));
        campos.add(new Escala("B", "GHm", campoB));
        campos.add(new Escala("CH", "AHm", campoDb));
        campos.add(new Escala("DH", "Cm", campoEb));
        campos.add(new Escala("FH", "DHm", campoGb));
        campos.add(new Escala("GH", "Fm", campoAb));
        campos.add(new Escala("AH", "Gm", campoBb));
          
        campos.add(new Escala("Cb", "Abm", campoB));
        campos.add(new Escala("Db", "Bbm", campoDb));
        campos.add(new Escala("Eb", "Eb", campoEb));
        campos.add(new Escala("Fb", "Dbm", campoE));
        campos.add(new Escala("Gb", "Ebm", campoGb));
        campos.add(new Escala("Ab", "Ab", campoAb));
        campos.add(new Escala("Bb", "Bb", campoBb));
        
        campos.add(new Escala("Gbm", "Gbm", campoA));
        campos.add(new Escala("Cbm", "Cbm", campoD));
    
    }

    public String getAcorde() {
        return this.acorde;
    }

    public String getAcordeEquivalente() {
        return this.acordeEquivalente;
    }

    public String[] getCampoHarmonico() {
        return this.campoHarmonico;
    }

    public Escala getCampoHarmonico(String acorde) {
        for (Escala campo : campos) {
            if (campo.getAcorde().equals(acorde) || campo.getAcordeEquivalente().equals(acorde)) {
                return campo;
            }
        }
        return null;
    }
    
    public void imprimeCampo(Escala campo) {
    	for(int i = 0; i < campo.getCampoHarmonico().length; i++) {
			System.out.println(campo.getCampoHarmonico()[i]);
		}
    }
    
}
