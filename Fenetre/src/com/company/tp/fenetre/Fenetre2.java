/**
 * 
 */
package com.company.tp.fenetre;

import javax.swing.JFrame;

/**
 * @author Lamine BA
 *
 */
public class Fenetre2 extends JFrame{

	/**
	 * 
	 */
	public Fenetre2() {
		this.setTitle("Ma deuxi�me fen�tre");
		
		this.setBounds(100, 200, 400, 600);
		
		//La fenetre ne se redimensionne pas
		this.setResizable(false);
		
		//Quitter la fenetre lorsqu'on quitte le programme
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main (String [] args){
		Fenetre2 maFenetre = new Fenetre2();
		
		maFenetre.setVisible(true);
	}
}
