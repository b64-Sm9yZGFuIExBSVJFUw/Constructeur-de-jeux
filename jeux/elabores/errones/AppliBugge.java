package jeux.elabores.errones;

import assembleur.Un_jeu;
import commun.Resultat;

public class AppliBugge extends Un_jeu{
	private static Resultat nePasModifierCetteM�thode() {
		System.out.println("Faute de programmation");
		throw new NumberFormatException();
	}
	
	public boolean jouer() {
		try {
			Resultat r = nePasModifierCetteM�thode();
			System.out.println(r);
		}
		catch (Exception NumberFormatException){
			return true;
		}
		return false;
	}
}
