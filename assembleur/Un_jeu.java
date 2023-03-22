/*
 * @file: Un_jeu.java
 * @author: Jordan LAIRES
 * @version: 1 - 13/05/2019
 * @brief: Chaque jeu (Assemblé ou non) est une sous-classe de cette classe
 * 		   abstraite
 */

package assembleur;

public abstract class Un_jeu implements ASSEMBLEUR {
	private boolean gagné = false; //Le joueur a gagné le jeu?
	private boolean aJoué = false; //Le joueur a-t-il déjà joué ?
	private boolean assemblé = false; //Le jeu est-t-il un jeu assemblé ?
	private String nom; //Le nom du jeu
	
	public abstract boolean jouer();
	
	/*
	 * @see: La méthode "gameplay" dans l'interface "ASSEMBLEUR"
	 */
	public boolean gameplay() {
		assert(this != null);
		if(!assemblé) {
			initialiser(); //On n'ajoute pas de jeu, on joue là
			gagné = jouer();
			return gagné;
		}
		else { 
		gagné = jouer(); //On joue le jeu assemblé pour atteindre son contenu
		return gagné; 
		}
	}

	/*
	 * @see: La méthode "gameplay" dans l'interface "ASSEMBLEUR"
	 */
	public String getNom() {
		return nom;
	}
	
	/*
	 * @see: La méthode "gameplay" dans l'interface "ASSEMBLEUR"
	 */
	public boolean estGagné() {
		return gagné;
	}
	
	/*
	 * @see: La méthode "gameplay" dans l'interface "ASSEMBLEUR"
	 */
	//public String résultat() {
		//return null; //Spécialisée seulement aux jeux assemblés
	//}
	

	public void initialiser() {
		return; //Spécialisée seulement dans les jeux crées
	}
	
	/*
	 * @see: La méthode "gameplay" dans l'interface "ASSEMBLEUR"
	 */
	public void entrainDeJouer() {
		aJoué = true;
	}
	
	/*
	 * @see: La méthode "gameplay" dans l'interface "ASSEMBLEUR"
	 */
	public boolean aJoué() {
		return aJoué;
	}
	
	/*
	 * @see: La méthode "gameplay" dans l'interface "ASSEMBLEUR"
	 * @pre: Le nom ne doit pas être null
	 */
	public void setNom(String nom) {
		assert(nom != null);
		this.nom = nom;
	}
	
	/*
	 * @see: La méthode "gameplay" dans l'interface "ASSEMBLEUR"
	 */
	public void jeuAssemblé() {
		assemblé = true;
	}
	
	/*
	 * @see: La méthode "gameplay" dans l'interface "ASSEMBLEUR"
	 */
	public boolean estAssemblé() {
		return assemblé;
	}
	
	/*
	 * @see: La méthode "gameplay" dans l'interface "ASSEMBLEUR"
	 */
	public void setGagné(boolean gag) {
		gagné = gag;
	}

	public void ajouter(Un_jeu j) {
		return; //Spécialisée seulement aux jeux assemblés	
	}
	
}
