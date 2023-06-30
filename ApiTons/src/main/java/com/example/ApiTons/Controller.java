package com.example.ApiTons;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "acordes")
public class Controller {
		
	@GetMapping()
	public String receberAcordes(@RequestParam("notas") ArrayList<String> lista) {	
		ArrayList<ConjuntoNotas> acordes = new ArrayList<ConjuntoNotas>();
		ArrayList<NotaPrincipal> notaPrincipals = new ArrayList<NotaPrincipal>();
		Escala escala = new Escala();
		
		acordes = (ArrayList<ConjuntoNotas>)lista.stream().map(ConjuntoNotas::new).collect(Collectors.toList());
		
		for (ConjuntoNotas acorde : acordes) {
			Escala campo = escala.getCampoHarmonico(acorde.getAcorde());
			
			int qt = contarAcorde(acordes, campo);

			NotaPrincipal.add(notaPrincipals, campo, qt);
		}
		System.out.println(NotaPrincipal.getTom(notaPrincipals));
		
		String tom = NotaPrincipal.getTom(notaPrincipals);
		
		return "{\"tonality\":\"" + tom + "\"}";
	}
	
	private int contarAcorde(ArrayList<ConjuntoNotas> acordes, Escala campo) {
		int qt = 0;
		
		for(int j = 0; j < acordes.size(); j++) {
			for (int i = 0; i < campo.getCampoHarmonico().length; i++) {
				if (acordes.get(j).getAcorde().equals(campo.getCampoHarmonico()[i])) {
					qt++;
					break;
				}
			}
		}
		
		return qt;
	}
	

}

