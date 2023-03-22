/*
 * @file: Jeu_assembl�_n_parties.java
 * @author: Jordan LAIRES
 * @version: 1 - 13/05/2019
 * @brief: La classe du jeu assembl� de type "Le joueur doit gagner en n parties" 
 */

package jeu_assembl�;

import assembleur.Un_jeu;

public class Jeu_assembl�_n_parties extends Jeu_assembl�{
	private int nbParties = 1;
	private Un_jeu le_jeu;
	
	/*
	 * @brief: Initialise le jeu assembl�
	 * @param nom: Le nom donn�
	 * @param nbParties: Le nombre d'esssais
	 */
	public Jeu_assembl�_n_parties(Un_jeu jeu, String nom, int nbParties) {
		/*False, il n'y a qu'une partie donc non, il ne doit pas tout gagner
		  Puis true, car oui, c'est un jeu assembl� de type n parties.*/
		super(jeu, nom, false, true);
		le_jeu = jeu;
		this.nbParties = nbParties;
	}
	
	@Override
	public boolean jouer() {
		assert(le_jeu != null);
		for(int i = 1; i <= nbParties; ++i) {
			int restantes = nbParties - i+1;
			
			if (restantes == 1) System.out.println("Derni�re partie!");
			else System.out.println(restantes + " parties restantes");
			
			boolean jeu_gagn� = le_jeu.gameplay();
			
			if(jeu_gagn�) {
				setGagn�(true);
				return true;
			}
		}
			
		return false; //On est sorti de la boucle, il a donc perdu
	}
	
	
}
