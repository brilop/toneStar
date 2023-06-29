package com.example.ApiTons;

import java.util.ArrayList;

public class NotaPrincipal extends ConjuntoNotas {
    private int qt;

    public NotaPrincipal(String acorde, int qt) {
        super(acorde);
        this.qt = qt;
    }

    public int getQt() {
        return this.qt;
    }

    public static void add(ArrayList<NotaPrincipal> notaPrincipal, Escala campo, int qt) {
        if (notaPrincipal.isEmpty() || notaPrincipal.get(0).getQt() < qt) {
            notaPrincipal.add(0, new NotaPrincipal(campo.getAcorde(), qt));
        } else {
            notaPrincipal.add(1, new NotaPrincipal(campo.getAcorde(), qt));
        }
    }
    
    public static String getTom(ArrayList<NotaPrincipal> notaPrincipals) {
    	if(notaPrincipals.get(0).getQt() == 1 && notaPrincipals.size() > 1) 
    		return "Tonalidade cromada, ou seja, não há um tom definido";
    	else 
    		return notaPrincipals.get(0).getAcorde();
    }
    
    void imprimeTonica(ArrayList<NotaPrincipal> notaPrincipals) {
    	for(int i = 0; i < notaPrincipals.size(); i++) {
			System.out.println(notaPrincipals.get(i).getAcorde() +": "+ notaPrincipals.get(i).getQt());
		}
    }
    
}
