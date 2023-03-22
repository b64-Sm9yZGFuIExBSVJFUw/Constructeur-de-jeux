/*
 * @file: Un_jeu.java
 * @author: Jordan LAIRES
 * @version: 1 - 13/05/2019
 * @brief: Chaque jeu (Assembl� ou non) est une sous-classe de cette classe
 * 		   abstraite
 */

package assembleur;

public abstract class Un_jeu implements ASSEMBLEUR {
	private boolean gagn� = false; //Le joueur a gagn� le jeu?
	private boolean aJou� = false; //Le joueur a-t-il d�j� jou� ?
	private boolean assembl� = false; //Le jeu est-t-il un jeu assembl� ?
	private String nom; //Le nom du jeu
	
	public abstract boolean jouer();
	
	/*
	 * @see: La m�thode "gameplay" dans l'interface "ASSEMBLEUR"
	 */
	public boolean gameplay() {
		assert(this != null);
		if(!assembl�) {
			initialiser(); //On n'ajoute pas de jeu, on joue l�
			gagn� = jouer();
			return gagn�;
		}
		else { 
		gagn� = jouer(); //On joue le jeu assembl� pour atteindre son contenu
		return gagn�; 
		}
	}

	/*
	 * @see: La m�thode "gameplay" dans l'interface "ASSEMBLEUR"
	 */
	public String getNom() {
		return nom;
	}
	
	/*
	 * @see: La m�thode "gameplay" dans l'interface "ASSEMBLEUR"
	 */
	public boolean estGagn�() {
		return gagn�;
	}
	
	/*
	 * @see: La m�thode "gameplay" dans l'interface "ASSEMBLEUR"
	 */
	//public String r�sultat() {
		//return null; //Sp�cialis�e seulement aux jeux assembl�s
	//}
	

	public void initialiser() {
		return; //Sp�cialis�e seulement dans les jeux cr�es
	}
	
	/*
	 * @see: La m�thode "gameplay" dans l'interface "ASSEMBLEUR"
	 */
	public void entrainDeJouer() {
		aJou� = true;
	}
	
	/*
	 * @see: La m�thode "gameplay" dans l'interface "ASSEMBLEUR"
	 */
	public boolean aJou�() {
		return aJou�;
	}
	
	/*
	 * @see: La m�thode "gameplay" dans l'interface "ASSEMBLEUR"
	 * @pre: Le nom ne doit pas �tre null
	 */
	public void setNom(String nom) {
		assert(nom != null);
		this.nom = nom;
	}
	
	/*
	 * @see: La m�thode "gameplay" dans l'interface "ASSEMBLEUR"
	 */
	public void jeuAssembl�() {
		assembl� = true;
	}
	
	/*
	 * @see: La m�thode "gameplay" dans l'interface "ASSEMBLEUR"
	 */
	public boolean estAssembl�() {
		return assembl�;
	}
	
	/*
	 * @see: La m�thode "gameplay" dans l'interface "ASSEMBLEUR"
	 */
	public void setGagn�(boolean gag) {
		gagn� = gag;
	}

	public void ajouter(Un_jeu j) {
		return; //Sp�cialis�e seulement aux jeux assembl�s	
	}
	
}
