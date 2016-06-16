/**
 * 
 */
package com.company.tp.appareils;

/**
 * Classe AppareilSecurisee est un appareil s�curis� heritant de l'appareil
 * thermostat�
 * 
 * @author Lamine
 * @version 1.0
 *
 */
public class AppareilSecurisee extends AppareilThermostate {

	private boolean isSecuriteEnclenchee = false;
	/**
	 * @param pMarque
	 * @param pModele
	 * @param pPuissanceMaxWatts
	 * @param pThermostat
	 */
	public AppareilSecurisee(String pMarque, String pModele, int pPuissanceMaxWatts, int pThermostat) {
		super(pMarque, pModele, pPuissanceMaxWatts, pThermostat);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Redefinition de la methode toString( )
	 * @see java.lang.Object#toString()
	 * 
	 * @author Lamine BA.
	 */
	@Override
	public String toString() {		
		return "Marque : " + super.getMarque() + "\n" + 
			   "Modele : " + super.getModele() + "\n" + 
		       "Puissance : " + super.getPuissance() + "\n" + 
		       "Marque : " + super.getThermostat() + "\n" + 
		       "Securit� enclench�e : " + this.isSecuriteEnclenchee + "\n" + 
		       "----------------------------------";
	}
	
	/**
	 * La methode demarrer( ) permet de demarrer l'appareil securis�.
	 * 
	 * @author Lamine BA.
	 */
	public void demarrer(){
		if(this.isSecuriteEnclenchee){
			super.demarrer();
			System.out.println("L'appareil est d�marr�");
		}
		else{
			System.out.println("La s�curit� n'est pas enclench�e!");
		}
	}
	
	/**
	 * La methode desenclencheSecurite( ) sert � ouvrir la porte 
	 * de l'appareil electrique s�curis�e afin de ne pouvoir le demaarrer.
	 * 
	 * @author Lamine BA
	 */
	public void desenclencheSecurite(){
		this.isSecuriteEnclenchee = true;
		System.out.println("La s�curit� est enclench�e");		
	}
	
	/**
	 * La methode enclencheSecurite( ) sert � fermer la porte sert � ouvrir la porte 
	 * de l'appareil electrique s�curis�e afin de pouvoir le demaarrer.
	 * 
	 * @author Lamine BA
	 */
	public void enclencheSecurite(){
		this.isSecuriteEnclenchee = false;
		System.out.println("La securit� n'est pas enclench� !");
	}
}
