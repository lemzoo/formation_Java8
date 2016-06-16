package com.cgi.tp.appareils;

public class AppareilSecurise extends AppareilThermostate {

	private boolean isSecuriteEnclenchee;

	//Constructeur
	public AppareilSecurise(String pMarque, String pModele, int pPuissance) {
		super(pMarque, pModele, pPuissance);
		isSecuriteEnclenchee = false;
	}

	public void enclencheSecurite() {
		isSecuriteEnclenchee = true;	
	}	

	public void desenclencheSecurite() {
		isSecuriteEnclenchee = false;
		if (isEnMarche) {
			this.arreter();
			System.out.println("Arret force de l'appareil");
		}
	}
	
	public void demarrer() {
		if (isSecuriteEnclenchee)
				isEnMarche = true;
		else
			System.out.println("La securite n est pas enclenchee!");
	}
	
	
	public String toString() {
		return (super.toString()
				 + ",\nSecurite enclenchee : " + isSecuriteEnclenchee);			
	}		
}
