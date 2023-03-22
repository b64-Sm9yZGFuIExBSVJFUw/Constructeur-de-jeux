package exercices; // A ne pas changer

import assembleur.Un_jeu;
import jeu_assembl�.Jeu_assembl�_normal;
import jeux.basiques.AppliGagne;
import jeux.basiques.AppliPerdu;
import jeux.basiques.AppliPileOuFace;
import jeux.elabores.egalite.AppliMatchNul;

//------------------------------------------------------
// Saurez vous adapter les nouveaux jeux �l�mentaires fournis pour la soutenance pour les rendre 
// compatibles avec votre biblioth�que et pourrez vous lancer une partie de chacun de ces jeux 
// apr�s qu'ils aient �t� modifi�s ?
//------------------------------------------------------
// Les nouveaux jeux sont dans le paquetage jeux.basiques. Ils sont tous sous la forme d'une classe nomm�e 
// AppliXXX contenant un main. Vous pouvez commencer par l'ex�cuter pour comprendre son fonctionnement.
//
// Vous noterez que les jeux reposent sur le type �num�r� jeu.util.Resultat qui ne doit pas �tre modifi�.  
// Les instructions composant la m�thode main ne doivent pas �tre modifi�es mais elles peuvent �tre 
// compl�t�es. Les autres m�thodes, les attributs et tous les autres �l�ments d�finis au sein de la classe 
// ne doivent pas �tre modifi�s ainsi que toutes les autres classes ou interfaces dont le jeu d�pend. 
// Vous ne devez changer ni le nom de la classe ni la changer de paquetage.
//
// En cas de doute, demandez � votre charg� de tp. 
//
// A chaque m�thode exoX correspond un test du paquetage soutenance.tests. Le test consiste � v�rifier 
// que les affichages sont conformes. 
// Apr�s avoir fini un exercice, vous pouvez ex�cuter les tests pour v�rifier que votre travail est correct.
// 
// Vous pouvez aussi ex�cuter la m�thode main ci-dessous. Elle invoque en s�quence chaque m�thode exoX.
// Vous verrez ainsi les affichages et saisies qui sont r�alis�s.
//------------------------------------------------------

// Ne pas changer le nom de la classe ni le prototype des m�thodes.
public class Exo1JeuxBasiques { 

	public static void main(String[] args) {
		// A adapter � vos besoins en (d�)commentant les lignes
		
		System.out.println("--> exoPileOuFace");  exoPileOuFace();
		
		System.out.println("--> exoJoueur(true)");  exoJoueur(true);
		System.out.println("--> exoJoueur(false)");  exoJoueur(false);

		System.out.println("--> exoMatchNul");  exoMatchNul();
	}

	public static Boolean exoPileOuFace() {
		// Pour pouvoir faire cet exercice, vous devez avoir modifi� la classe AppliPileOuFace 
		// pour la rendre compatible avec votre biblioth�que.
		//
		// Ecrivez les instructions qui :
		// a - construisent le jeu j correspondant � AppliPileOuFace
		// b - lancent une partie de ce jeu
		// c - retournent le r�sultat de cette partie (true si elle est gagn�e et false sinon)
		// 
		// Le test associ� � chaque exercice v�rifie que les affichages sont exactement ceux attendus 
		// et/ou que la valeur retourn�e est correcte.
		//
		// Votre m�thode doit retourner le r�sultat de la partie. 3 valeurs sont possibles :
		// - true : la partie est gagn�e
		// - false : la partie est perdue
		// - null : les tests n'iront pas plus loin (retourn�e par d�faut)
		//
		// Les affichages r�alis�s par vos instructions doivent �tre exactement les m�mes que ceux 
		// r�alis�s par l'appel AppliPileOuFace.main(null) de la m�thode main originale
		
		Un_jeu j = new Jeu_assembl�_normal(new AppliPileOuFace(), "Pile ou Face", true);

		return j.jouer();
	}
	
	public static Boolean exoJoueur(boolean b) {
		// Pour pouvoir faire cet exercice, vous devez avoir modifi� les classes AppliGagne et 
		// AppliPerdu pour les rendre compatibles avec votre biblioth�que.
		//
		// Ecrivez les instructions qui :
		// a - construisent le jeu j tel que si b est vrai alors j = AppliGagne sinon j = AppliPerdu
		// b - lancent une partie de ce jeu
		// c - retournent le r�sultat de cette partie (true si elle est gagn�e et false sinon)
		if (b) {
			Un_jeu j = new Jeu_assembl�_normal(new AppliGagne(), "Pile ou Face", true);
			return j.jouer();
		}
		else {
			Un_jeu j = new Jeu_assembl�_normal(new AppliPerdu(), "Pile ou Face", true);
			return j.jouer();
		}

	}
	
	public static Boolean exoMatchNul() {
		Un_jeu j = new Jeu_assembl�_normal(new AppliMatchNul(), "Pile ou Face", true);
		return j.jouer();
	}
}
