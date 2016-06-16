/**
 * 
 */
package com.company.tp.applet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author ib
 *
 */
public class EvtFrame extends javax.swing.JFrame{
	private JButton unBouton = new JButton("Cliquez moi");
	private JCheckBox unecheckBox = new JCheckBox("Cochez moi");
	private JLabel unLabel = new JLabel("Ici on placera les traces");
	
	/**
	 * 
	 */
	public EvtFrame() {
		
		//On insere un titre sur la fenetre
		this.setTitle("Fenetre Evenementielle");
		
		//On fixe la largeur et la hauteur de la fenetre
		this.setSize(300, 300);
		
		this.add(unLabel);
		this.add(unecheckBox);
		this.add(unBouton);
		
		Ecouteur unEcouteur = new Ecouteur(this);
		unBouton.addActionListener(unEcouteur);
		unecheckBox.addActionListener(unEcouteur);
		
		
	}

	/**
	 * @return the unBouton
	 */
	public JButton getUnBouton() {
		return unBouton;
	}

	/**
	 * @return the unecheckBox
	 */
	public JCheckBox getUnecheckBox() {
		return unecheckBox;
	}

	/**
	 * @return the unLabel
	 */
	public JLabel getUnLabel() {
		return unLabel;
	}

	public static void main (String [] args){
		//Instanciation de la fenetre
		EvtFrame maFenetre = new EvtFrame();
		//On rend la fenetre visible
		maFenetre.setVisible(true);
	}
}

class Ecouteur implements ActionListener{
	private EvtFrame fenetre = null; 
	
	public Ecouteur (EvtFrame pEvtFrame){
		fenetre = pEvtFrame;
	}
	
	public void actionPerformed(ActionEvent aEvt){
		Object source = aEvt.getSource();
		
		if(source == fenetre.getUnBouton()){
			fenetre.getUnLabel().setText("clic bouton");
			System.out.println("Evenement clic bouton intercepté");
		}
		else if(source == fenetre.getUnecheckBox()){
			fenetre.getUnLabel().setText("Changement checkBox");
			System.out.println("Evenement intercepté");
		}
		else{
			
		}
	}
}
