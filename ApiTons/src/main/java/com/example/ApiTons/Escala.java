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
        String[] campoD = {"D", "Em", "F#m", "G", "A", "Bm", "Cm"};
        String[] campoE = {"E", "F#m", "G#m", "A", "B", "C#m", "Dm"};
        String[] campoF = {"F", "Gm", "Am", "Bb", "C", "Dm", "Em"};
        String[] campoG = {"G", "Am", "Bm", "C", "D", "Em", "F#m"};
        String[] campoA = {"A", "Bm", "C#m", "D", "E", "F#m", "G#m"};
        String[] campoB = {"B", "C#m", "D#m", "E", "F#", "G#m", "A#m"};
        String[] campoDb = {"Db", "Ebm", "Fm", "Gb", "Ab", "Bbm", "Cm"};
        String[] campoEb = {"Eb", "Fm", "Gm", "Ab", "Bb", "Cm", "Dm"};
        String[] campoGb = {"Gb", "Abm", "Bbm", "Cb", "Db", "Ebm", "Fm"};
        String[] campoAb = {"Ab", "Bb", "Cm", "Db", "Eb", "Fm", "Gm"};
        String[] campoBb = {"Bb", "Cm", "Dm", "Eb", "F", "Gm", "Am"};

        campos.add(new Escala("C", "Am", campoC));
        campos.add(new Escala("D", "Bm", campoD));
        campos.add(new Escala("E", "C#m", campoE));
        campos.add(new Escala("F", "Dm", campoF));
        campos.add(new Escala("G", "Em", campoG));
        campos.add(new Escala("A", "F#m", campoA));
        campos.add(new Escala("B", "G#m", campoB));
        campos.add(new Escala("Db", "A#m", campoDb));
        campos.add(new Escala("Eb", "Cm", campoEb));
        campos.add(new Escala("Gb", "D#m", campoGb));
        campos.add(new Escala("Ab", "Fm", campoAb));
        campos.add(new Escala("Bb", "Gm", campoBb));
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
