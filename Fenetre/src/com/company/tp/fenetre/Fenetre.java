/**
 * 
 */
package com.company.tp.fenetre;

import javax.swing.JFrame;

/**
 * Classe Fenetre( ) instancie un JFrame pour une application graphique. 
 * 
 * Cette application crée une fenetre pour des clients lourd. 
 * On utilise la bibliothèque SWING.
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
		maFenetre.setTitle("Ma Première Fenetre");
		
		//On fixe la largeur et la hauteur de la fenetre
		maFenetre.setSize(800, 600);
		
		//On rend la fenetre visible
		maFenetre.setVisible(true);
	}

}
