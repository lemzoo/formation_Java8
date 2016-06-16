
package com.company.tp.ihm;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import com.company.tp.appareils.AppareilElectrique;
import com.company.tp.appareils.AppareilThermostate;
import com.company.tp.compteur.Compteur;


public class CadreGeneral extends JFrame {
	
	private AppareilElectrique monAppElec;
	private AppareilThermostate monAppThermos;
	private Compteur monCompteur;
	
	
	/*
	 * Construit graphiquement un nouveau panneau de commande
	 */

	public CadreGeneral(AppareilElectrique pAppElec, AppareilThermostate pAppThermos, Compteur pCompteur) {
		
		monAppElec = pAppElec;
		monAppThermos = pAppThermos;
		monCompteur = pCompteur;
		
		getContentPane().setLayout(new FlowLayout());
		getContentPane().setBackground(new Color(125,204,204));
		
		PanneauCompteur unPanoC=new PanneauCompteur(monCompteur);		
		PanneauAppareil unPanoE=new PanneauAppareil(monAppElec, unPanoC);		
		PanneauThermostat unPanoT=new PanneauThermostat(monAppThermos, unPanoC);
		unPanoC.abonnement(unPanoE, unPanoT);		

		getContentPane().add(unPanoE);
		getContentPane().add(unPanoT);
		getContentPane().add(unPanoC);		
	
		setSize(550,200);
		setVisible(true);
	}

}
