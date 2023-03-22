package jeux.elabores.heritage;

import commun.Resultat;

public class AppliHeritage extends ClasseTemoin {
	// Ne pas changer le prototype de ce constructeur
	// Compl�ter les instructions reste possible
	public AppliHeritage() {
		super();
	}
	
	private static Resultat nePasModifierCetteM�thode() {
		AppliHeritage j = new AppliHeritage();
		j.heritage();
		return Resultat.GAGNE;
	}

	public static void main(String[] args) {
		Resultat r = nePasModifierCetteM�thode();
		System.out.println(r);
	}
}
