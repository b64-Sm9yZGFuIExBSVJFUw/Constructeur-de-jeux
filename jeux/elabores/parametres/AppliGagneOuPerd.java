package jeux.elabores.parametres;


import commun.Resultat;

public class AppliGagneOuPerd {
	private static Resultat nePasModifierCetteM�thode(String[] args) {
		if (args == null || !args[0].contains("gagne"))
			return Resultat.PERDU;
		return Resultat.GAGNE;
	}

	public static void main(String[] args) {
		Resultat r = nePasModifierCetteM�thode(args);
		System.out.println(r);
	}
}
