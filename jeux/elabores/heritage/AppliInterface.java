package jeux.elabores.heritage;

import commun.Resultat;

public class AppliInterface implements InterfaceTemoin extends Un_jeu {
	// Ne pas changer le prototype de ce constructeur
	// Compléter les instructions reste possible
	public AppliInterface() {
		super();
	}
	
	private static Resultat nePasModifierCetteMéthode() {
		AppliInterface j = new AppliInterface();
		j.heritage();
		return Resultat.GAGNE;
	}

	public static void main(String[] args) {
		Resultat r = nePasModifierCetteMéthode();
		System.out.println(r);
	}
}
