
package com.cgi.tp.appareils;
public class AppareilThermostate extends AppareilElectrique {

	private int iThermostat=0;
	private int iValeurMaxThermostat = 12;


	//CONSTRUCTEUR
	public AppareilThermostate(String pMarque, String pModele, int pPuissance) {
		super(pMarque, pModele, pPuissance);
		iThermostat=0;
	}
	
	
	//ACCESSEURS
	public void setThermostat(int valeur) {
		iThermostat=valeur;
	} // set

	public int  getThermostat() {
		return iThermostat;
	} // get


	public int getValeurMaxThermostat() {
		return iValeurMaxThermostat;
	}

	public void setValeurMaxThermostat(int iValeurMaxThermostat) {
		this.iValeurMaxThermostat = iValeurMaxThermostat;
	}



	//METHODES
	public void incrementeThermostat()  {	
		if (iThermostat < iValeurMaxThermostat)
			iThermostat = iThermostat + 1;
		else 
			System.out.println("Thermostat deja a son maximum!");
	}
	
	public void decrementeThermostat() {
		if (iThermostat > 0)
			iThermostat = iThermostat - 1;
		else
			System.out.println("Thermostat deja a son minimum!");
	}
	
	public int getConsommation(){
		if (isEnMarche) 
			return (iThermostat * iPuissance);
		else return 0;
	}	
	
	public void arreter() {
		super.arreter();
		iThermostat=0;
	}

	
	public String toString() {
		return (super.toString()
				 + ",\nThermostat : " + iThermostat);			
	}
	
}
