/*
 * @file: Jeu_assembl�_normal.java
 * @author: Jordan LAIRES
 * @version: 1 - 13/05/2019
 * @brief: La classe du jeu assembl� de type "Le joueur gagner j1 et/ou j2"
 * 		   le et/ou d�pend du bool�en entr� dans le constructeur (fautToutGagner) 
 */

package jeu_assembl�;

import java.util.List;

import assembleur.Un_jeu;

public class Jeu_assembl�_normal extends Jeu_assembl� {
	
	/*
	 * @brief: Initialise le jeu assembl�
	 * @param jeu: Le jeu a ajouter
	 * @param nom: Le nom donn�
	 * @param fautToutGagner: Faut-t-il gagner toutes les parties ?
	 */
	public Jeu_assembl�_normal(Un_jeu jeu, String nom, boolean fautToutGagner) {
		//False, il ne s'agit pas d'un assembleur de type n_parties
		super(jeu, nom, fautToutGagner, false);
	}
	
	/*
	 * @brief: M�me constructeur sauf qu'il prend une liste de jeux
	 */
	public Jeu_assembl�_normal(List<Un_jeu> jeux, String nom, boolean fautToutGagner) {
		super(jeux, nom, fautToutGagner, false);	
	}
}
