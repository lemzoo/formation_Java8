/**
 * 
 */
package com.company.tp.maison;
import com.company.tp.appareils.Appareil;
import com.company.tp.appareils.AppareilElectrique;
import com.company.tp.appareils.AppareilThermostate;
import com.company.tp.bordereau.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;

/**
 * Classe Maison contient l'ensemble des appareils qui seront 
 * contenu dans un arrayList de Bordereau
 * @author Lamine
 *
 */
public class Maison {
	Collection mesAppareils; 
	Bordereau unBordereau;
	/**
	 * Constructeur de l'objet Maison
	 * On cr�e les appareils m�nagers et p, mes place dans la liste
	 */
	public Maison(){
		mesAppareils = new ArrayList();
		
		unBordereau = new Bordereau();
		
		AppareilElectrique unCaftiere = new AppareilElectrique("EXPRESSO","EXP",300);
		AppareilElectrique uneCuisiniere = new AppareilElectrique("BOSCH","B4GV",500);
		
		/*mesAppareils.add(unCaftiere);
		mesAppareils.add(uneCuisiniere);
		
		mesAppareils.add(new AppareilElectrique("Lampe", "Ikea", 100));
		mesAppareils.add(new AppareilElectrique("SFR", "Box Fibre", 400));*/
		
		unBordereau.add(unCaftiere);
		unBordereau.add(uneCuisiniere);
		
		unBordereau.add(new AppareilElectrique("Lampe", "Ikea", 100));
		unBordereau.add(new AppareilElectrique("SFR", "Box Fibre", 400));
		
	}
	
	/**
	 * Liste l'�tat de tous les appareils connus
	 *  
	 */
	public void status(){
		Iterator itApp; 
		AppareilElectrique unAppareilElectrique = null; 
		System.out.println("<----- status ----->");
		/*for(itApp = mesAppareils.iterator(); itApp.hasNext();){
			unAppareilElectrique = (AppareilElectrique)itApp.next();
			System.out.println(unAppareilElectrique);
			System.out.println("-----------");
		}*/
		unBordereau.afficher();
	}
	
	/**
	 * Arreter tous les appareils connus
	 */
	public void toutEteindre(){
		/*Iterator itApp; 
		AppareilElectrique unAppareilElectrique = null; 
		System.out.println("<----- toutAllumer ----->");
		for(itApp = mesAppareils.iterator(); itApp.hasNext();){
			unAppareilElectrique = (AppareilElectrique)itApp.next();
			unAppareilElectrique.arreter();
		}*/
		
		AppareilElectrique unAppareilElectrique = null;
		System.out.println("<----- toutEteindre ----->");
		for(Enumeration e = unBordereau.elements(); e.hasMoreElements();){
			unAppareilElectrique = (AppareilElectrique)e.nextElement();
			unAppareilElectrique.arreter();
		}
	}
	
	/**
	 * Allumer tous les appareils connus
	 */
	public void toutAllumer(){
		/*Iterator itApp; 
		AppareilElectrique unAppareilElectrique = null; 
		System.out.println("<----- toutAllumer ----->");
		for(itApp = mesAppareils.iterator(); itApp.hasNext();){
			unAppareilElectrique = (AppareilElectrique)itApp.next();
			unAppareilElectrique.demarrer();
		}*/
		
		AppareilElectrique unAppareilElectrique = null;
		System.out.println("<----- toutEteindre ----->");
		for(Enumeration e = unBordereau.elements(); e.hasMoreElements();){
			unAppareilElectrique = (AppareilElectrique)e.nextElement();
			unAppareilElectrique.demarrer();
		}
		
	}
	
	/**
	 * trier les appareils de la maison
	 * de mani�re croissante
	 */
	public void trierCroissant(){
		unBordereau.trierCroissant();
	}
	
	/**
	 * Trier les appareils de la maison de 
	 * mani�re d�croissantes
	 */
	public void trierDecroissant(){
		unBordereau.trierDecroissant();
	}
}
