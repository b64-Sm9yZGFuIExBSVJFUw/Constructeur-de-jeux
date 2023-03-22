package jeux.basiques;

import assembleur.Un_jeu;
import commun.Resultat;

public class AppliGagne extends Un_jeu{
	private static Resultat nePasModifierCetteM�thode() {
		return Resultat.GAGNE;
	}

	public boolean jouer() {
		Resultat r = nePasModifierCetteM�thode();
		System.out.println(r);
		
		if (r == Resultat.GAGNE) {
			return true;
		}
		return false;
	}
}
