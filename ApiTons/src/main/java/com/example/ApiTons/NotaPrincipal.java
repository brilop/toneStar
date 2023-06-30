package com.example.ApiTons;

import java.util.ArrayList;

public class NotaPrincipal {
    private String acorde;
    private int qtAcordesNaEscala;

    public NotaPrincipal(String acorde) {
        this.acorde = acorde;
    }

    public void setQtAcordesNaEscala(int qtAcordesNaEscala) {
        this.qtAcordesNaEscala = qtAcordesNaEscala;
    }
    
    public int getAcordesNaEscala() {
        return qtAcordesNaEscala;
    }
    
    public static void add(ArrayList<NotaPrincipal> tonica, Escala campo, int qtAcordesNaEscala) {
        NotaPrincipal novaTonica = new NotaPrincipal(campo.getAcorde());
        novaTonica.setQtAcordesNaEscala(qtAcordesNaEscala);
        
        if (tonica.isEmpty() || tonica.get(0).getAcordesNaEscala() < qtAcordesNaEscala) {
            tonica.add(0, novaTonica);
        } else {
            tonica.add(1, novaTonica);
        }
    }
    
    public static String getTom(ArrayList<NotaPrincipal> tonicas) {
        if(tonicas.get(0).getAcordesNaEscala() == 1 && tonicas.size() > 1) 
            return "Atonalidade";
        else 
            return tonicas.get(0).acorde;
    }
    
    void imprimeTonica(ArrayList<NotaPrincipal> tonicas) {
        for(int i = 0; i < tonicas.size(); i++) {
            System.out.println(tonicas.get(i).acorde +": "+ tonicas.get(i).getAcordesNaEscala());
        }
    }
}

