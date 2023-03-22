/*
 * @file: Jeu_assemblé_doit_gagner.java
 * @author: Jordan LAIRES
 * @version: 1 - 13/05/2019
 * @brief: La classe du jeu assemblé de type "Le joueur doit forcément gagner" 
 */


package jeu_assemblé;

import assembleur.Un_jeu;

public class Jeu_assemblé_doit_gagner extends Jeu_assemblé{
	private Un_jeu le_jeu; //Ce type d'assembleur contient qu'un jeu
	
	/*
	 * @brief: Initialiser le jeu assemblé
	 * @param nom: Le nom donné
	 */
	public Jeu_assemblé_doit_gagner(Un_jeu jeu, String nom) {
		/*1er false: Il ne faut pas tout gagner car il n'y a qu'un jeu
		  L'autre: Ce n'est pas un jeu qui se joue en n essais*/
		super(jeu, nom, false, false); 
		le_jeu = jeu;
	}
	
	@Override
	public boolean jouer() {
		assert(le_jeu != null);
		while(true) {
			
			//On joue, puis s'il gagne [renvoyé true], on rentre dans le if
			if(le_jeu.gameplay()) { 
				setGagné(true);
				return true; 
			}
		}
	}

}
