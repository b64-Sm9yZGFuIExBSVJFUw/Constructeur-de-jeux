/*
 * @file: Jeu_assembl�_doit_gagner.java
 * @author: Jordan LAIRES
 * @version: 1 - 13/05/2019
 * @brief: La super-classe des jeu assembl�s. Chaque type d'assemblage est une
 * 		   sous-classe.
 */

package jeu_assembl�;

import java.util.ArrayList;
import java.util.List;

import assembleur.Un_jeu;

public abstract class Jeu_assembl� extends Un_jeu{
	private List<Un_jeu> jeux; //Liste des jeux
	private boolean enAGagn�Une = false; 
	private boolean fautToutGagner; //Faut-t-il gagner toutes les parties ?
	private boolean n_parties; //Nombre d'essais/de parties
	private int jeuxGagn�s; //Nombre de jeux remport�s
	
	/*
	 * @brief: Le constructeur de l'assembleur
	 * @param jeu: Le jeu a ajouter
	 * @param nom: Le nom de votre nouveau jeu
	 * @param fautToutGagner: Faut-t-il gagner toutes les parties?
	 * @param n_parties: Est-ce un jeu qui se joue en plusieurs essais?
	 * 					 (Seulement pour le type Jeu_assembl�_n_parties)
	 * 
	 * @pre: Le jeu ainsi que le nom ne doivent pas �tre nuls
	 */
	public Jeu_assembl�(Un_jeu jeu, String nom, boolean fautToutGagner, boolean n_parties){
		assert(jeu != null && nom != null);
		jeuAssembl�(); //C'est un jeu assembl�
		setNom(nom);
		jeux = new ArrayList<Un_jeu>();
		jeux.add(jeu);
		this.n_parties = n_parties;
		this.fautToutGagner = fautToutGagner;
	}
	
	/*
	 * @brief: Le m�me constructeur sauf qu'il prend une liste de jeux.
	 * 		   Seulement le jeu assembl� normal l'utilise
	 * 
	 * @pre: Le jeu ainsi que le nom ne doivent pas �tre nuls
	 */
	public Jeu_assembl�(List<Un_jeu> jeu, String nom, boolean fautToutGagner, boolean n_parties){
		assert(jeu != null && nom != null);
		jeuAssembl�(); //C'est un jeu assembl�
		setNom(nom);
		jeux = new ArrayList<Un_jeu>();
		jeux = jeu;
		this.n_parties = n_parties;
		this.fautToutGagner = fautToutGagner;
	}
	
	
	/*
	 * @see: La m�thode "gameplay" dans l'interface "ASSEMBLEUR"
	 * @info: De base je voulais la mettre seulement dans cette classe mais si
	 *        ce fut le cas je ne pourrais pas faire du polymorphisme
	 *        
	 * @pre: Le jeu ne doit pas �tre nul
	 */
	public void ajouter(Un_jeu j) {
		assert(j != null);
		jeux.add(j);
	}
	
	/*
	 * @brief: Pour jouer aux jeux assembl�s
	 * @return [Type: bool�en]: Retourne si le joueur a gagn� le nouveau jeu 
	 * 							assembl�
	 * 
	 * @pre: Le jeu assembl� doit contenir au moins un jeu
	 */
	@Override
	public boolean jouer() {
		assert(jeux.size() > 0);
		//Utiles pour d�terminer si le joueur remport� toutes les parties
		int nbJeux = 0; 
		jeuxGagn�s = 0;
		
		for (Un_jeu J : jeux) {
			boolean aGagn� = J.gameplay(); //Retourne s'il a gagn� ou non
			nbJeux++; //Nombre de jeux jou�s
			
			//Si c'est un assembleur qui contient qu'un jeu
			if(estN_parties()) return aGagn�; //On retourne juste le r�sultat
			
			
			if(aGagn�) { //Si la partie est gagn�e
				enAGagn�Une = true; 
				jeuxGagn�s++;
				J.setGagn�(true);
			}
			else J.setGagn�(false); 
			
			//Si on a perdue une partie mais qu'il fallait tout gagner
			if(!aGagn� && fautToutGagner) { 
				J.setGagn�(false); //Le jeu est perdu
				setGagn�(false); //Le jeu assembl� est perdu
				
				if (!enAGagn�Une)return false;
			}
		}
		
		//Si on en a pas gagn� une mais qu'il fallait tout gagner
		if(fautToutGagner && !enAGagn�Une) { 
			setGagn�(false);
			//System.out.println("Vous avez gagn� aucune partie... Vous avez "
			//+ "perdu au jeu  " + getNom() + "..");
			return false;
		}
		else if(!enAGagn�Une) { //Si on en a gagn� aucune
			setGagn�(false);
			//System.out.println("Vous n'avez gagn� aucune partie, vous avez "
			//		+ "perdu au jeu " + getNom() + "..");
			return false;
		}
		else if(jeuxGagn�s == nbJeux) { //Si on a gagn� toutes les parties
			setGagn�(true);
			//System.out.println("Vous avez gagn� � tout les jeux! Vous avez "
			//		+ "gagn� au jeu " + getNom() + "!");
			return true;
		}
		//Si on en a gagn� une et qu'on ne devait pas tout gagner
		else if(!fautToutGagner && enAGagn�Une) { 
			setGagn�(true);
			//System.out.println("Vous n'avez pas gagn� toutes les parties.. "
			//		+ "Mais vous avez gagn� au jeu " + getNom() + "!");
			return true;
		}
		else { //Tout le reste: Il a perdu
			setGagn�(false);
			//System.out.println("Vous avez perdu au jeu " + getNom() + "..");
			return false;
		}	
	}
	
	
	/*
	 * @brief: Renvoie si oui ou non le jeu assembl� est de type "N parties"
	 */
	public boolean estN_parties() {
		return n_parties;
	}
}
