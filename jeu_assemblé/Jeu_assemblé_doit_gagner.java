/*
 * @file: Jeu_assembl�_doit_gagner.java
 * @author: Jordan LAIRES
 * @version: 1 - 13/05/2019
 * @brief: La classe du jeu assembl� de type "Le joueur doit forc�ment gagner" 
 */


package jeu_assembl�;

import assembleur.Un_jeu;

public class Jeu_assembl�_doit_gagner extends Jeu_assembl�{
	private Un_jeu le_jeu; //Ce type d'assembleur contient qu'un jeu
	
	/*
	 * @brief: Initialiser le jeu assembl�
	 * @param nom: Le nom donn�
	 */
	public Jeu_assembl�_doit_gagner(Un_jeu jeu, String nom) {
		/*1er false: Il ne faut pas tout gagner car il n'y a qu'un jeu
		  L'autre: Ce n'est pas un jeu qui se joue en n essais*/
		super(jeu, nom, false, false); 
		le_jeu = jeu;
	}
	
	@Override
	public boolean jouer() {
		assert(le_jeu != null);
		while(true) {
			
			//On joue, puis s'il gagne [renvoy� true], on rentre dans le if
			if(le_jeu.gameplay()) { 
				setGagn�(true);
				return true; 
			}
		}
	}

}
