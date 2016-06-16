/**
 * 
 */
package com.company.tp.fenetre;

import javax.swing.JFrame;

/**
 * Classe Fenetre( ) instancie un JFrame pour une application graphique. 
 * 
 * Cette application cr�e une fenetre pour des clients lourd. 
 * On utilise la biblioth�que SWING.
 * 
 * @author Lamine BA
 *
 */
public class Fenetre extends JFrame{

	/**
	 * 
	 */
	public static void main (String [] args){
		
		//Instanciation de la fenetre
		JFrame maFenetre = new JFrame();
		
		//On insere un titre sur la fenetre
		maFenetre.setTitle("Ma Premi�re Fenetre");
		
		//On fixe la largeur et la hauteur de la fenetre
		maFenetre.setSize(800, 600);
		
		//On rend la fenetre visible
		maFenetre.setVisible(true);
	}

}
