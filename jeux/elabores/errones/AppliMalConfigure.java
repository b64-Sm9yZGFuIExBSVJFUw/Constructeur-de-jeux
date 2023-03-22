package jeux.elabores.errones;

import java.io.FileNotFoundException;

import assembleur.Un_jeu;
import commun.Resultat;

public class AppliMalConfigure extends Un_jeu{
	private static Resultat nePasModifierCetteMéthode() throws Exception {
		System.out.println("Faute contextuelle");
		throw new FileNotFoundException();
	}
	
	public boolean jouer() {
		Resultat r;
		try {
			r = nePasModifierCetteMéthode();
			System.out.println(r);
		} catch (Exception FileNotFoundException) {
			return true;
		}
		return false;
	}
}
