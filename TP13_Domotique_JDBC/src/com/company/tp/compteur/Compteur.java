package com.company.tp.compteur;

import java.util.Enumeration;
import java.util.Vector;

import com.company.tp.appareils.Appareil;
import com.company.tp.exception.CompteurADisjoncterException;
import com.company.tp.interfaces.ConsommateurDeCourant;
import com.company.tp.interfaces.FournisseurDeCourant;

public class Compteur extends Appareil implements FournisseurDeCourant{
	private int iMaxWatts; 
	private Vector<ConsommateurDeCourant> lesEltsBranches;
	
	/**
	 * constructeur de la classe compteur
	 * @param pMaxWatts
	 */
	public Compteur (String pMarque, String pModele, int pMaxWatts){
		super(pMarque, pModele);
		this.iMaxWatts = pMaxWatts;
		this.lesEltsBranches = new Vector();
	}
	
	/**
	 * Method getMaxWatts( ) renvoie la puissance 
	 * que le compteur a compt�
	 * 
	 * @return iMaxWatts
	 */
	public int getMaxWatts(){
		return this.iMaxWatts;
	}
	
	
	/**
	 * @param iMaxWatts the iMaxWatts to set
	 */
	public void setMaxWatts(int iMaxWatts) {
		this.iMaxWatts = iMaxWatts;
	}

	@Override
	public void deconnecter(ConsommateurDeCourant pConsommateur) {
		lesEltsBranches.remove(pConsommateur);
	}

	
	/**
	 * Method disjoncter( ) permet de disjoncter le compteur
	 * 
	 */
	@Override
	public void disjoncter (){
		System.out.println("Disjonctage du compteur");
		for (Enumeration e = lesEltsBranches.elements(); e.hasMoreElements();){
			((ConsommateurDeCourant)e.nextElement()).arreter();
		}
	}
	
	/**
	 * Method Connecter 
	 */
	@Override
	public void connecter(ConsommateurDeCourant pConsommateur){
		this.lesEltsBranches.add(pConsommateur);
	}
	
	/**
	 * Methode getEnergieFournie ( ) permet d'obtenir l'energie consomm�
	 */
	@Override
	public int getEnergieFournie() throws CompteurADisjoncterException{
		int iConsommationTotale = 0; 
		for (Enumeration e = lesEltsBranches.elements(); e.hasMoreElements();){
			iConsommationTotale += ((ConsommateurDeCourant)e.nextElement()).getConsommation();
			
			if(iConsommationTotale > iMaxWatts){
				//iConsommationTotale = -1;
				disjoncter();
				throw new CompteurADisjoncterException("Disjonctage ", this, iConsommationTotale);
				//break;
			}
		}
		return iConsommationTotale;
	}

	@Override
	public void demanderEnergie(int pQuantiteWatts) {
		// TODO Auto-generated method stub
		
	}
}
