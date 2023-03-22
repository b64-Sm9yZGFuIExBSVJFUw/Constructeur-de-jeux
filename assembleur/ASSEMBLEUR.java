/*
 * @file: ASSEMBLEUR.java
 * @author: Jordan LAIRES
 * @version: 1 - 13/05/2019
 * @brief: L'interface ASSEMBLEUR contenant les fonctions que tout notre 
 * 		   programme utilisera
 */

package assembleur;

public interface ASSEMBLEUR {
	
	/*
	 * @brief: L'initialisation du jeu
	 */
	void initialiser();
	
	/*
	 * @brief: La partie où l'on joue au jeu
	 * @return [Type: booléen]: Le joueur a gagné le jeu ?
	 */
	boolean jouer();
	
	/*
	 * @brief: On joue au jeu (Il l'initialise et y joue)
	 * @return [Type: booléen]: Le joueur a gagné le jeu ?
	 */
	boolean gameplay();
	
	/*
	 * @brief: Affiche le résultat du jeu assemblé
	 * @return [Type: string]: La chaîne à afficher 
	 */
	//String résultat();
	
	/*
	 * @brief: Récupère le nom du jeu
	 * @return [Type: string]: Le nom du jeu
	 */
	String getNom();
	
	/*
	 * @brief: Retourne si oui ou non, le jeu a été remporté
	 * @return [Type: booleén]: Le jeu a-t-il été remporté ?
	 */
	boolean estGagné();
	
	/*
	 * @brief: Met à true entrainDeJouer 
	 * 		   Il indique que le jeu est actuellement entrain d'être joué
	 */
	void entrainDeJouer();
	
	/*
	 * @brief: Retourne si le jeu a déjà été joué 
	 * @return [Type: booléen]: Le jeu a-t-il été déjà joué ?
	 */
	boolean aJoué();
	
	/*
	 * @brief: Indique le nom du jeu pour lequel on a invoqué cette méthode
	 * @param [Type: string]: Le nom du jeu
	 */
	void setNom(String nom);
	
	/*
	 * @brief: Met la valeur "jeuAssemblé" à true 
	 * 		   Il permet d'indiquer que c'est un jeu assemblé
	 */
	void jeuAssemblé();
	
	/*
	 * @brief: Renvoie si oui ou non, le jeu pour laquelle la méthode a été 
	 * 		   invoquée s'iil s'agit d'un jeu assemblé
	 * @return [Type: booléen]: Le jeu est-t-il un jeu assemblé ?
	 */
	boolean estAssemblé();
	
	/*
	 * @brief: Change la valeur de l'attribut "Gagné"
	 * @param [Type: booléen]: Le jeu a-t-il été remporté ?
	 */
	void setGagné(boolean gag);
	
	/*
	 * @brief: Ajoute un jeu à la liste des jeux
	 * @param [Type: Un_jeu]: Le jeu à ajouter
	 */
	void ajouter(Un_jeu j);
}
