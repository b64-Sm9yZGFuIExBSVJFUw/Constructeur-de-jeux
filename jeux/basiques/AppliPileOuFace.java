package jeux.basiques;

import assembleur.Un_jeu;
import commun.Resultat;

public class AppliPileOuFace extends Un_jeu {
	private static Resultat nePasModifierCetteMéthode() {
		if (Math.random() > 0.5)
			return Resultat.GAGNE;
		else
			return Resultat.PERDU;
	}

	public boolean jouer() {
		// Ne pas modifier ni l'appel, ni l'affichage
		Resultat r = nePasModifierCetteMéthode();
		System.out.println(r);
		if (r == Resultat.GAGNE) {
			return true;
		}
		return false;
				
	}
}
