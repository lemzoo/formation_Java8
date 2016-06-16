package com.cgi.tp.maison;

import com.cgi.tp.inter.*;
import java.util.*;


public class compteur implements FournisseurDeCourant{
	
	/*puissance maximum de ce compteur */
	private int maxWatts;
	
	/*Liste des consommateurs connectés
	 * 
	 */
	private Vector lesEltsBranches = new Vector();
	
	//Constructeur
	public compteur(int pMaxWatts){
		maxWatts=pMaxWatts;
	}
	
	//ACCESSEURS
	public int getMaxWatts(){
		return maxWatts;
	}

	public void setMaxWatts(int maxWatts) {
		this.maxWatts = maxWatts;
	}
	
	//Methodes decrites par l'interface
	public void connecter(ConsommateurDeCourant pConsommateur){
		lesEltsBranches.add(pConsommateur);
	}
	
	public void deconnecter(ConsommateurDeCourant pConsommateur){
		lesEltsBranches.remove(pConsommateur);
	}
	
	public void disjoncter(){
		System.out.println("Disjonctage du compteur --> arret des appareils");
		for(Enumeration e=lesEltsBranches.elements();e.hasMoreElements();){
			((ConsommateurDeCourant)e.nextElement()).arreter();
		}
	}
	public int getEnergieFournie(){
		int iConsommationTotale=0;
		
		for (Enumeration e=lesEltsBranches.elements();e.hasMoreElements();){
		iConsommationTotale +=((ConsommateurDeCourant)e.nextElement()).getConsommation();
		if (iConsommationTotale > maxWatts){
			iConsommationTotale = -1;
			disjoncter();
			break;
		}
	}
		return iConsommationTotale;
	}
}
	
	


