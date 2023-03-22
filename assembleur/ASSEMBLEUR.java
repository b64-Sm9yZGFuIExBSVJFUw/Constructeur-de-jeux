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
	 * @brief: La partie o� l'on joue au jeu
	 * @return [Type: bool�en]: Le joueur a gagn� le jeu ?
	 */
	boolean jouer();
	
	/*
	 * @brief: On joue au jeu (Il l'initialise et y joue)
	 * @return [Type: bool�en]: Le joueur a gagn� le jeu ?
	 */
	boolean gameplay();
	
	/*
	 * @brief: Affiche le r�sultat du jeu assembl�
	 * @return [Type: string]: La cha�ne � afficher 
	 */
	//String r�sultat();
	
	/*
	 * @brief: R�cup�re le nom du jeu
	 * @return [Type: string]: Le nom du jeu
	 */
	String getNom();
	
	/*
	 * @brief: Retourne si oui ou non, le jeu a �t� remport�
	 * @return [Type: boole�n]: Le jeu a-t-il �t� remport� ?
	 */
	boolean estGagn�();
	
	/*
	 * @brief: Met � true entrainDeJouer 
	 * 		   Il indique que le jeu est actuellement entrain d'�tre jou�
	 */
	void entrainDeJouer();
	
	/*
	 * @brief: Retourne si le jeu a d�j� �t� jou� 
	 * @return [Type: bool�en]: Le jeu a-t-il �t� d�j� jou� ?
	 */
	boolean aJou�();
	
	/*
	 * @brief: Indique le nom du jeu pour lequel on a invoqu� cette m�thode
	 * @param [Type: string]: Le nom du jeu
	 */
	void setNom(String nom);
	
	/*
	 * @brief: Met la valeur "jeuAssembl�" � true 
	 * 		   Il permet d'indiquer que c'est un jeu assembl�
	 */
	void jeuAssembl�();
	
	/*
	 * @brief: Renvoie si oui ou non, le jeu pour laquelle la m�thode a �t� 
	 * 		   invoqu�e s'iil s'agit d'un jeu assembl�
	 * @return [Type: bool�en]: Le jeu est-t-il un jeu assembl� ?
	 */
	boolean estAssembl�();
	
	/*
	 * @brief: Change la valeur de l'attribut "Gagn�"
	 * @param [Type: bool�en]: Le jeu a-t-il �t� remport� ?
	 */
	void setGagn�(boolean gag);
	
	/*
	 * @brief: Ajoute un jeu � la liste des jeux
	 * @param [Type: Un_jeu]: Le jeu � ajouter
	 */
	void ajouter(Un_jeu j);
}
