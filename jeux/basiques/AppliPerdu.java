package jeux.basiques;

import assembleur.Un_jeu;
import commun.Resultat;

public class AppliPerdu extends Un_jeu{
	private static Resultat nePasModifierCetteMéthode() {
		return Resultat.PERDU;
	}
		
	public boolean jouer() {
		Resultat r = nePasModifierCetteMéthode();
		System.out.println(r);
		
		if (r == Resultat.GAGNE) {
			return true;
		}
		return false;
	}
}
