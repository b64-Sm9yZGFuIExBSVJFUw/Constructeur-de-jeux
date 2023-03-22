/*
 * @file: Jeu_assemblé_n_parties.java
 * @author: Jordan LAIRES
 * @version: 1 - 13/05/2019
 * @brief: La classe du jeu assemblé de type "Le joueur doit gagner en n parties" 
 */

package jeu_assemblé;

import assembleur.Un_jeu;

public class Jeu_assemblé_n_parties extends Jeu_assemblé{
	private int nbParties = 1;
	private Un_jeu le_jeu;
	
	/*
	 * @brief: Initialise le jeu assemblé
	 * @param nom: Le nom donné
	 * @param nbParties: Le nombre d'esssais
	 */
	public Jeu_assemblé_n_parties(Un_jeu jeu, String nom, int nbParties) {
		/*False, il n'y a qu'une partie donc non, il ne doit pas tout gagner
		  Puis true, car oui, c'est un jeu assemblé de type n parties.*/
		super(jeu, nom, false, true);
		le_jeu = jeu;
		this.nbParties = nbParties;
	}
	
	@Override
	public boolean jouer() {
		assert(le_jeu != null);
		for(int i = 1; i <= nbParties; ++i) {
			int restantes = nbParties - i+1;
			
			if (restantes == 1) System.out.println("Dernière partie!");
			else System.out.println(restantes + " parties restantes");
			
			boolean jeu_gagné = le_jeu.gameplay();
			
			if(jeu_gagné) {
				setGagné(true);
				return true;
			}
		}
			
		return false; //On est sorti de la boucle, il a donc perdu
	}
	
	
}
