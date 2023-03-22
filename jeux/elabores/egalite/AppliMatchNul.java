package jeux.elabores.egalite;

import assembleur.Un_jeu;
import commun.Resultat;

public class AppliMatchNul extends Un_jeu{
	private static Resultat nePasModifierCetteMéthode() {
		return Resultat.MATCH_NULL;
	}
	
	public boolean jouer() {
		Resultat r = nePasModifierCetteMéthode();
		System.out.println(r);
		
		if (r == Resultat.MATCH_NULL) {
			return true;
		}
		return true;
	}
}
