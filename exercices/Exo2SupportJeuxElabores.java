package exercices; // A ne pas changer

import assembleur.Un_jeu;
import jeu_assembl�.Jeu_assembl�_normal;
import jeux.elabores.errones.AppliBugge;

//------------------------------------------------------
// Saurez vous adapter un nouveau jeu plus �volu� et lancer une partie de chacun de ce jeu ?
//------------------------------------------------------
// Le paquetage jeux.elabores contient une collection de jeux (sous la forme d'une m�thode statique main au sein 
// d'une classe AppliXXX). Aucun de ces jeux n'est vraiment �labor� mais chacun correspond � un des pi�ges possibles du sujet :
//
// - Prise en compte des matchs nuls (ss-paquetage egalite)
// - Prise en compte des exceptions lev�es par les jeux (ss-paquetage errones)
// - Support des applications qui h�ritent d'une classe et/ou implantent une interface (ss-paquetage heritage)
// - Support des applications qui emploient des variables globales... (paquetage memoire)
// - Support des applications exploitant le param�tre (String[] args) de la m�thode main (ss-paquetage  parametre)
//
// A chaque AppliXXX correspond un exercice exoXXX ci dessous. Il est inutile de tous les faire car beaucoup
// sont similaires.
//
// Pour chaque exercice, apr�s avoir rendu compatible la classe AppliXXX, �crivez les instructions qui :
// a - construisent le jeu j correspondant � AppliXXX
// b - lancent une partie de ce jeu
// c - retournent le r�sultat de cette partie (true si elle est gagn�e et false sinon)
//------------------------------------------------------

// Ne pas changer le nom de la classe ni le prototype des m�thodes.
public class Exo2SupportJeuxElabores { 

	public static void main(String[] args) {
		// A adapter � vos besoins en (d�)commentant les lignes
		
		System.out.println("--> exoBugge");  exoBugge();
		System.out.println("--> exoMalConfigure");  exoMalConfigure();
		
//		System.out.println("--> exoHeritage");  exoHeritage();
//		System.out.println("--> exoInterface");  exoInterface();
//		System.out.println("--> AppliInterfaceEtHeritage");  AppliInterfaceEtHeritage();
		
//		System.out.println("--> exoAvecDonneeStatique");  exoAvecDonneeStatique();
		
//		System.out.println("--> exoGagneOuPerd(gagne)");  exoGagneOuPerd(new String[]{"gagne"});
//		System.out.println("--> exoGagneOuPerd(perd)");  exoGagneOuPerd(new String[]{"perd"});
	}

	
	public static Boolean exoMatchNul() {
		// AppliMatchNull

		return null;
	}

	//------------------------------------------------------
	public static boolean exoBugge() {
		Un_jeu j = new Jeu_assembl�_normal(new AppliBugge(), "Bug", true);
		
		return j.jouer();
	}
	
	public static Boolean exoMalConfigure() {
			Un_jeu j = new Jeu_assembl�_normal(new AppliBugge(), "Bug", true);
		
		return j.jouer();	
	}
	
	//------------------------------------------------------
	public static Boolean exoHeritage() {
		// AppliHeritage

		return null;
	}
	
	public static Boolean exoInterface() {
		// AppliInterface

		return null;
	}
	
	public static Boolean exoInterfaceEtHeritage() {
		// AppliInterfaceEtHeritage

		return null;
	}
	
	//------------------------------------------------------
	public static Boolean exoAvecDonneeStatique() {
		// AppliAvecDonneeStatique
		// Attention, cette application emploie un attribut statique. Si on lance deux fois de suite ce programme,
		// il affiche deux fois la m�me chose. Faites en sorte que ceci soit pr�serv� lors de l'adaptation du jeu �
		// votre bibiloth�que
		//
		// Ecrivez les instructions qui :
		// a - construisent le jeu j correspondant � AppliAvecDonneeStatique
		// b - lancent deux parties successives de ce jeu
		// c - retournent le r�sultat de la seconde partie (true si elle est gagn�e et false sinon)

		return null;
	}

	//------------------------------------------------------
	public static Boolean exoGagneOuPerd(String[] args) {
		// AppliGagneOuPerd
		// Attention, cette application utilise le param�tre (String[] args). Vous devez lui transmettre.

		return null;
	}
}
