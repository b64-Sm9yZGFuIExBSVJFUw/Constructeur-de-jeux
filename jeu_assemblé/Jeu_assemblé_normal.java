/*
 * @file: Jeu_assemblé_normal.java
 * @author: Jordan LAIRES
 * @version: 1 - 13/05/2019
 * @brief: La classe du jeu assemblé de type "Le joueur gagner j1 et/ou j2"
 * 		   le et/ou dépend du booléen entré dans le constructeur (fautToutGagner) 
 */

package jeu_assemblé;

import java.util.List;

import assembleur.Un_jeu;

public class Jeu_assemblé_normal extends Jeu_assemblé {
	
	/*
	 * @brief: Initialise le jeu assemblé
	 * @param jeu: Le jeu a ajouter
	 * @param nom: Le nom donné
	 * @param fautToutGagner: Faut-t-il gagner toutes les parties ?
	 */
	public Jeu_assemblé_normal(Un_jeu jeu, String nom, boolean fautToutGagner) {
		//False, il ne s'agit pas d'un assembleur de type n_parties
		super(jeu, nom, fautToutGagner, false);
	}
	
	/*
	 * @brief: Même constructeur sauf qu'il prend une liste de jeux
	 */
	public Jeu_assemblé_normal(List<Un_jeu> jeux, String nom, boolean fautToutGagner) {
		super(jeux, nom, fautToutGagner, false);	
	}
}
