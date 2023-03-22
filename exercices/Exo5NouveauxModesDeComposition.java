package exercices; // A ne pas changer

//------------------------------------------------------
// Saurez vous programmer hors de votre biblioth�que un nouveau mode de composition et vous en servir  ?
//------------------------------------------------------
// Pour chaque exercice qui suit, vous devez metre en oeuvre un nouveau mode d'assemblage de jeux.
// Si elle est bien con�ue, votre biblioth�que doit permettre de d�velopper une nouvelle classe/m�thode/etc 
// permettant de construire un nouveau jeu employant ce nouveau mode d'assemblage.
//
// Si ce n'est pas le cas, il est toujours possible de faire les exercices qui suivent en modifiant le coeur 
// de votre biblioth�que pour y int�grer ces nouveaux modes d'assemblage. Notez bien que ce n'est pas du tout 
// le but de l'exercice.
//
// Chaque exercice consiste � construire un jeu assembl� selon un nouveau mode (d�fini dans un encadr� avant
// l'exercice) puis � lancer une partie de ce jeu et retourner le r�sultat de celle-ci. La construction du jeu peut
// �tre conditionn�e par des param�tres propres � chaque exercice. 
//
// Certains sont plus difficiles que d'autres. Certains peuvent �tre obtenus simplement en combinant des modes d�j� existants.
//------------------------------------------------------

// avec correction
// Ne pas changer le nom de la classe ni le prototype des m�thodes.
public class Exo5NouveauxModesDeComposition { 

	public static void main(String[] args) {
		// A adapter � vos besoins en (d�)commentant les lignes
		
//		System.out.println("--> exo1");  exo1();
	}

	//------------------------------------------------------
	// Soit j un jeu et n > 1 un entier. Le joueur dispose de n essais pour jouer au jeu j et remporter 2 victoires 
	// successives. Avec ce mode, la partie s'arr�te au plus t�t, c'est � dire :
	// - d�s que 2 victoires successives ont eu lieu
	// - d�s que le joueur ne peut plus gagner (la ni�me partie ne doit pas �tre jou�e si la n-1 i�me n'a pas �t� une victoire)
	//
	// Notation : j "2 en au plus" n 
	//------------------------------------------------------
	public static Boolean exoDeuxDeSuiteEnMoinsDe(boolean b, int nbEssais) {
		assert(nbEssais > 1);
		// Ecrivez les instructions qui :
		// a - construisent le jeu j tel que si b est vrai alors j = AppliGagne sinon j = AppliPerdu
		// b - construisent le jeu correspondant � l'assemblage j "2 en au plus" n (o� n > 1 est le nombre d'essais)
		// c - lancent une partie du jeu r�sultant de l'assemblage
		// d - retournent le r�sultat de cette partie (true si elle est gagn�e et false sinon)

		return null;
	}
	
	//------------------------------------------------------
	// Soient j1, j2, ..., jn, une liste non vide de jeux. Le joueur joue � une partie de chaque jeu pris dans l'ordre 
	// j1, ..., jn. La partie est gagn�e (et s'arr�te imm�diatement) d�s que le joueur remporte l'un des jeux. Elle
	// est perdue s'il ne remporte aucune vicoire.
	//
	// Notation : "un parmi" (j1, ..., jn)
	//------------------------------------------------------
	public static Boolean exoUnParmi() {
		// Ecrivez les instructions qui :
		// a - construisent le jeu correspondant � l'assemblage "un parmi" (AppliPerdu, AppliPerdu, AppliGagne, AppliPerdu).
		// b - lancent une partie du jeu r�sultant de l'assemblage
		// c - retournent le r�sultat de cette partie (true si elle est gagn�e et false sinon)

		return null;
	}
	
	//------------------------------------------------------
	// Soient j1, j2, ..., jn, une liste non vide de jeux. Le joueur joue � une partie de chaque jeu pris dans l'ordre 
	// j1, ..., jn. La partie est gagn�e si le joueur fait une alternance de succ�s et d'�chec � la s�rie de jeux.
	// La partie se termine en �chec d�s que le joueur obtient 2 victoires ou �checs cons�cutifs. Attention,
	// le joueur doit pouvoir choisir de commencer par perdre ou par gagner le premier jeu, ce n'est que 
	// pour les jeux suivants que l'alternance devient stricte.
	//
	// Notation : "alterne" (j1, ..., jn)
	//------------------------------------------------------
	public static Boolean exoEnAlternance() {
		// Ecrivez les instructions qui :
		// a - construisent le jeu correspondant � l'assemblage "alterne" (AppliPerdu, AppliGagne, AppliPerdu, AppliGagne).
		// b - lancent une partie du jeu r�sultant de l'assemblage
		// c - retournent le r�sultat de cette partie (true si elle est gagn�e et false sinon)

		return null;
	}

	//------------------------------------------------------
	// Soient j1, j2, j3, 3 jeux. Le joueur joue un jeu de j1. S'il gagne j1 alors il doit gagner au jeu j2 pour remporter 
	// la partie. S'il perd j1 alors il doit gagner un jeu de j3 pour obtenir une victoire. Dans tous les autres cas, il perd.
	//
	// Notation : "si alors sinon" (j1, j2, j3)
	//------------------------------------------------------
	public static Boolean exoSiAlorsSinon(boolean b1, boolean b2, boolean b3) {
		// Ecrivez les instructions qui :
		// a - construisent le jeu j1 tel que si b1 est vrai alors j1 = AppliGagne sinon j1 = AppliPerdu
		// b - construisent le jeu j2 tel que si b2 est vrai alors j2 = AppliGagne sinon j2 = AppliPerdu
		// c - construisent le jeu j3 tel que si b3 est vrai alors j3 = AppliGagne sinon j3 = AppliPerdu
		// d - construisent le jeu correspondant � l'assemblage "si alors sinon" (j1, j2, j3)
		// e - lancent une partie du jeu r�sultant de l'assemblage
		// f - retournent le r�sultat de cette partie (true si elle est gagn�e et false sinon)

		return null;
	}
	
	//------------------------------------------------------
	// Soit j, un jeu. Le joueur joue au jeu j. La partie est remport�e s'il perd au jeu j et elle est perdue s'il gagne j. 
	//
	// Notation : "qui perd gagne" (j) 
	//------------------------------------------------------
	public static Boolean exoQuiPerdGagne(boolean b) {
		// Ecrivez les instructions qui :
		// a - construisent le jeu j tel que si b est vrai alors j = AppliGagne sinon j = AppliPerdu
		// b - construisent le jeu correspondant � l'assemblage "qui perd gagne" (j)
		// c - lancent une partie du jeu r�sultant de l'assemblage
		// d - retournent le r�sultat de cette partie (true si elle est gagn�e et false sinon)

		return null;
	}
	
	// une s�rie de jeux � gagner un � un qui est recommenc�e au d�but d�s le 1er �chec
	
	//------------------------------------------------------
	// Soient j1, j2, ..., jn, une liste non vide de jeux. Le joueur doit gagner tous les jeux un � un sans jamais perdre. 
	// D�s qu'il perd l'un des jeux, il recommence � partir du premier. La partie se termine n�cessairement par un succ�s 
	// quand le joueur r�alise la s�quence parfaite.
	// 
	// Notation : "jusqu'� perfection" (j1, ..., jn)
	//------------------------------------------------------
	public static Boolean exoJusquAPerfection() {
		// Ecrivez les instructions qui :
		// a - construisent le jeu correspondant � l'assemblage "jusqu'� perfection" (AppliGagne, AppliGagne, AppliGagne)
		// b - lancent une partie du jeu r�sultant de l'assemblage
		// c - retournent le r�sultat de cette partie (true si elle est gagn�e et false sinon)

		return null;
	}
	
	//------------------------------------------------------
	// Soient j1, j2, ..., jn, une liste non vide de jeux. Le joueur joue � chaque jeu un � un. Pour gagner la partie, 
	// le joueur doit remporter au moins la moiti� des jeux. Il joue � tous les jeux et cela m�me s'il a d�j� suffisamment 
	// de victoires ou trop d'�checs. 
	//
	// Notation : "moiti�" (j1, ..., jn)
	//------------------------------------------------------

	public static Boolean exoMoitie() {
		// Ecrivez les instructions qui :
		// a - construisent le jeu correspondant � l'assemblage "moitie" (AppliGagne, AppliPerdu, AppliGagne)
		// b - lancent une partie du jeu r�sultant de l'assemblage
		// c - retournent le r�sultat de cette partie (true si elle est gagn�e et false sinon)

		return null;
	}
}
