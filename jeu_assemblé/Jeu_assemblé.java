/*
 * @file: Jeu_assemblé_doit_gagner.java
 * @author: Jordan LAIRES
 * @version: 1 - 13/05/2019
 * @brief: La super-classe des jeu assemblés. Chaque type d'assemblage est une
 * 		   sous-classe.
 */

package jeu_assemblé;

import java.util.ArrayList;
import java.util.List;

import assembleur.Un_jeu;

public abstract class Jeu_assemblé extends Un_jeu{
	private List<Un_jeu> jeux; //Liste des jeux
	private boolean enAGagnéUne = false; 
	private boolean fautToutGagner; //Faut-t-il gagner toutes les parties ?
	private boolean n_parties; //Nombre d'essais/de parties
	private int jeuxGagnés; //Nombre de jeux remportés
	
	/*
	 * @brief: Le constructeur de l'assembleur
	 * @param jeu: Le jeu a ajouter
	 * @param nom: Le nom de votre nouveau jeu
	 * @param fautToutGagner: Faut-t-il gagner toutes les parties?
	 * @param n_parties: Est-ce un jeu qui se joue en plusieurs essais?
	 * 					 (Seulement pour le type Jeu_assemblé_n_parties)
	 * 
	 * @pre: Le jeu ainsi que le nom ne doivent pas être nuls
	 */
	public Jeu_assemblé(Un_jeu jeu, String nom, boolean fautToutGagner, boolean n_parties){
		assert(jeu != null && nom != null);
		jeuAssemblé(); //C'est un jeu assemblé
		setNom(nom);
		jeux = new ArrayList<Un_jeu>();
		jeux.add(jeu);
		this.n_parties = n_parties;
		this.fautToutGagner = fautToutGagner;
	}
	
	/*
	 * @brief: Le même constructeur sauf qu'il prend une liste de jeux.
	 * 		   Seulement le jeu assemblé normal l'utilise
	 * 
	 * @pre: Le jeu ainsi que le nom ne doivent pas être nuls
	 */
	public Jeu_assemblé(List<Un_jeu> jeu, String nom, boolean fautToutGagner, boolean n_parties){
		assert(jeu != null && nom != null);
		jeuAssemblé(); //C'est un jeu assemblé
		setNom(nom);
		jeux = new ArrayList<Un_jeu>();
		jeux = jeu;
		this.n_parties = n_parties;
		this.fautToutGagner = fautToutGagner;
	}
	
	
	/*
	 * @see: La méthode "gameplay" dans l'interface "ASSEMBLEUR"
	 * @info: De base je voulais la mettre seulement dans cette classe mais si
	 *        ce fut le cas je ne pourrais pas faire du polymorphisme
	 *        
	 * @pre: Le jeu ne doit pas être nul
	 */
	public void ajouter(Un_jeu j) {
		assert(j != null);
		jeux.add(j);
	}
	
	/*
	 * @brief: Pour jouer aux jeux assemblés
	 * @return [Type: booléen]: Retourne si le joueur a gagné le nouveau jeu 
	 * 							assemblé
	 * 
	 * @pre: Le jeu assemblé doit contenir au moins un jeu
	 */
	@Override
	public boolean jouer() {
		assert(jeux.size() > 0);
		//Utiles pour déterminer si le joueur remporté toutes les parties
		int nbJeux = 0; 
		jeuxGagnés = 0;
		
		for (Un_jeu J : jeux) {
			boolean aGagné = J.gameplay(); //Retourne s'il a gagné ou non
			nbJeux++; //Nombre de jeux joués
			
			//Si c'est un assembleur qui contient qu'un jeu
			if(estN_parties()) return aGagné; //On retourne juste le résultat
			
			
			if(aGagné) { //Si la partie est gagnée
				enAGagnéUne = true; 
				jeuxGagnés++;
				J.setGagné(true);
			}
			else J.setGagné(false); 
			
			//Si on a perdue une partie mais qu'il fallait tout gagner
			if(!aGagné && fautToutGagner) { 
				J.setGagné(false); //Le jeu est perdu
				setGagné(false); //Le jeu assemblé est perdu
				
				if (!enAGagnéUne)return false;
			}
		}
		
		//Si on en a pas gagné une mais qu'il fallait tout gagner
		if(fautToutGagner && !enAGagnéUne) { 
			setGagné(false);
			//System.out.println("Vous avez gagné aucune partie... Vous avez "
			//+ "perdu au jeu  " + getNom() + "..");
			return false;
		}
		else if(!enAGagnéUne) { //Si on en a gagné aucune
			setGagné(false);
			//System.out.println("Vous n'avez gagné aucune partie, vous avez "
			//		+ "perdu au jeu " + getNom() + "..");
			return false;
		}
		else if(jeuxGagnés == nbJeux) { //Si on a gagné toutes les parties
			setGagné(true);
			//System.out.println("Vous avez gagné à tout les jeux! Vous avez "
			//		+ "gagné au jeu " + getNom() + "!");
			return true;
		}
		//Si on en a gagné une et qu'on ne devait pas tout gagner
		else if(!fautToutGagner && enAGagnéUne) { 
			setGagné(true);
			//System.out.println("Vous n'avez pas gagné toutes les parties.. "
			//		+ "Mais vous avez gagné au jeu " + getNom() + "!");
			return true;
		}
		else { //Tout le reste: Il a perdu
			setGagné(false);
			//System.out.println("Vous avez perdu au jeu " + getNom() + "..");
			return false;
		}	
	}
	
	
	/*
	 * @brief: Renvoie si oui ou non le jeu assemblé est de type "N parties"
	 */
	public boolean estN_parties() {
		return n_parties;
	}
}
