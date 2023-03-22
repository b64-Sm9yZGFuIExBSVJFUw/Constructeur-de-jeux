package exercices; // A ne pas changer

//------------------------------------------------------
// Saurez vous lancer une partie d'un jeu obtenu par composition ? 
//------------------------------------------------------
// Avant de pouvoir faire ces exercices, vous devez avoir r�ussi l'exercice Exo1JeuxBasiques.exoJoueur
// et, plus particuli�rement, avoir rendu compatible avec votre biblioth�que AppliGagne et AppliPerdu.
//
// Assurez vous aussi que composer des jeux avec votre biblioth�que n'implique aucun autre affichage 
// que ceux des jeux compos�s.
//
// Par la suite, les 4 compositions du projet sont not�es (dans le m�me ordre que dans le sujet) :
// - j1 "puis sinon" j2 (avec j1 et j2 deux jeux)
// - j1 "et aussi" j2
// - j "en au plus" n (avec j un jeu et n > 0 le nombre d'essais)
// - j "jusqu'� la victoire"
//------------------------------------------------------

// Ne pas changer le nom de la classe ni le prototype des m�thodes.
public class Exo3CompositionsSimples { 

	public static void main(String[] args) {
		// A adapter � vos besoins en (d�)commentant les lignes

//		System.out.println("--> exoPuisSinon(true, true)");  exoPuisSinon(true, true);

//		System.out.println("--> exoEtAussi(true, true)");  exoEtAussi(true, true);

//		System.out.println("--> exoEnAuPlus(true, 3)");  exoEnAuPlus(true, 3);

//		System.out.println("--> exoJusquaLaVictoire()");  exoJusquaLaVictoire();
	}

	public static Boolean exoPuisSinon(boolean b1, boolean b2) {
		// Ecrivez les instructions qui :
		// a - construisent le jeu j1 tel que si b1 est vrai alors j1 = AppliGagne sinon j1 = AppliPerdu
		// b - construisent le jeu j2 tel que si b2 est vrai alors j2 = AppliGagne sinon j2 = AppliPerdu
		// c - construisent le jeu correspondant � l'assemblage j1 "puis sinon" j2
		// d - lancent une partie du jeu r�sultant de l'assemblage
		// e - retournent le r�sultat de cette partie (true si elle est gagn�e et false sinon)

		return null;
	}

	//------------------------------------------------------
	public static Boolean exoEtAussi(boolean b1, boolean b2) {
		// Ecrivez les instructions qui :
		// a - construisent le jeu j1 tel que si b1 est vrai alors j1 = AppliGagne sinon j1 = AppliPerdu
		// b - construisent le jeu j2 tel que si b2 est vrai alors j2 = AppliGagne sinon j2 = AppliPerdu
		// c - construisent le jeu correspondant � l'assemblage j1 "et aussi" j2
		// d - lancent une partie du jeu r�sultant de l'assemblage
		// e - retournent le r�sultat de cette partie (true si elle est gagn�e et false sinon)

		return null;
	}

	//------------------------------------------------------
	public static Boolean exoEnAuPlus(boolean b, int n) {
		assert(n > 0);
		// Ecrivez les instructions qui :
		// a - construisent le jeu j tel que si b est vrai alors j = AppliGagne sinon j = AppliPerdu
		// b - construisent le jeu correspondant � l'assemblage j "en au plus" n (o� n > 0 est le nombre d'essais)
		// c - lancent une partie du jeu r�sultant de l'assemblage
		// d - retournent le r�sultat de cette partie (true si elle est gagn�e et false sinon)

		return null;
	}
	
	//------------------------------------------------------
	public static Boolean exoJusquaLaVictoire() {
		// Ecrivez les instructions qui :
		// a - construisent le jeu correspondant � l'assemblage AppliGagne "jusqu'� la victoire"
		// b - lancent une partie du jeu r�sultant de l'assemblage
		// c - retournent le r�sultat de cette partie (true si elle est gagn�e et false sinon)

		return null;
	}
}
