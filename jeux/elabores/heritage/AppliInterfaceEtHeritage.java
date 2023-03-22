package jeux.elabores.heritage;

import commun.Resultat;

public class AppliInterfaceEtHeritage extends ClasseTemoin implements InterfaceTemoin {
	// Ne pas changer le prototype de ce constructeur
	// Compl�ter les instructions reste possible
	public AppliInterfaceEtHeritage() {
		super();
	}
	
	private static Resultat nePasModifierCetteM�thode() {
		AppliInterfaceEtHeritage j = new AppliInterfaceEtHeritage();
		j.heritage();
		return Resultat.GAGNE;
	}

	public static void main(String[] args) {
		Resultat r = nePasModifierCetteM�thode();
		System.out.println(r);
	}
}
