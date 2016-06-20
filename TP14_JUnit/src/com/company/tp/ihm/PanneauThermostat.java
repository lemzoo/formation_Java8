package com.company.tp.ihm;
import com.company.tp.appareils.*;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;


public class PanneauThermostat extends PanneauAppareil implements ActionListener{

	private JLabel lblThermostat;
	private JButton btnAugmenterThermostat;
	private JButton btnDiminuerThermostat;

	private int thermostatCourant;
	
	private AppareilThermostate cetAppareil = null;
	private PanneauCompteur cePanneauCompteur = null;

	public PanneauThermostat(AppareilThermostate pAppThermo, PanneauCompteur pPanoC){
		super(pAppThermo, pPanoC);
		cetAppareil = pAppThermo; 
		cePanneauCompteur = pPanoC;
		
		//TODO creer  bouton diminuer
		btnDiminuerThermostat = new JButton("-");
		btnDiminuerThermostat.setMargin(new Insets(2, 2, 2, 2));
		btnDiminuerThermostat.setEnabled(false);
		add(btnDiminuerThermostat);

		//TODO creer label Thermostat
		lblThermostat = new JLabel();
		lblThermostat.setPreferredSize(new Dimension(20, 20));
		this.afficherThermostat();
		add(lblThermostat);

		
		//TODO creer  bouton augmenter
		btnAugmenterThermostat = new JButton("+");
		btnAugmenterThermostat.setMargin(new Insets(2, 2, 2, 2));
		btnAugmenterThermostat.setEnabled(false);
		add(btnAugmenterThermostat);
		
		//Ecouteur sur les bouttons augmenter et dimunier
		btnAugmenterThermostat.addActionListener(this);
		btnDiminuerThermostat.addActionListener(this);
	}


	public void actionPerformed(ActionEvent evt){
		// On laisse traiter les actions demarrer et arreter au parent
	    super.actionPerformed(evt);

		//AppareilThermostate cetAppareil = (AppareilThermostate)appareil;

		Object src = evt.getSource();
		if (src == btnDemarrer) {
			//TODO
			this.cetAppareil.demarrer();
			System.out.println("thermostatCourant = " + thermostatCourant);
			//cetAppareil.setValeurThermostat(thermostatCourant);
			afficherCompteur();
			this.btnDemarrer.setEnabled(false);
			this.btnArreter.setEnabled(true);
			
			//Rendre les deux boutons actifs
			btnAugmenterThermostat.setEnabled(true);
			btnDiminuerThermostat.setEnabled(true);
		}
		else if (src == btnArreter) {
			// TODO
			this.cetAppareil.arreter();
			
			this.btnDemarrer.setEnabled(true);
			this.btnArreter.setEnabled(false);
			
			//Rendre les deux boutons inactifs
			btnAugmenterThermostat.setEnabled(false);
			btnDiminuerThermostat.setEnabled(false);
		}
		else if(src == btnAugmenterThermostat){
			// TODO
			this.cetAppareil.incrementeThermostat();
			this.afficherThermostat();
			afficherCompteur();
		}
		else if (src == btnDiminuerThermostat){
			//TODO
			this.cetAppareil.decrementeThermostat();	
			this.afficherThermostat();
			afficherCompteur();
		}//btnDiminuerThermostat
	}//actionPerformed(ActionEvent evt)

	private void afficherCompteur(){
		cePanneauCompteur.majConso();
	}
	
	
	private void afficherThermostat(){
		thermostatCourant = this.cetAppareil.getThermostat();
		String thermostat = String.format("%02d", thermostatCourant);
		lblThermostat.setText(thermostat);
	}
	
	//En cas de disjonctage, permet d initialiser les elements du pano
	public void initPano() {
		super.initPano();
		btnAugmenterThermostat.setEnabled(false);
		btnDiminuerThermostat.setEnabled(false);
		lblThermostat.setText("0");	
	}
}//PanneauAppareil