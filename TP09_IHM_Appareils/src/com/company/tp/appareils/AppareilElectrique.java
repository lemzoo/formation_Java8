package com.company.tp.appareils;

import com.company.tp.interfaces.ConsommateurDeCourant;

public class AppareilElectrique extends Appareil implements ConsommateurDeCourant{

	protected int iPuissance=0;
	protected boolean isEnMarche=false;

	//Constructeur
	public AppareilElectrique(String pMarque,String pModele, int pPuissance){
		super(pMarque, pModele);
		iPuissance=pPuissance;
		isEnMarche=false;
	}// constructeur

	
	/**
	 * Method toString() pour afficher le contenu de l'objet AppareilElectrique
	 */
	@Override
	public String toString() {
		return super.toString() + "\n" + 
			    "Puissance = " + iPuissance + "\n" + 
				"isEnMarche = " + isEnMarche;
	}


	public void setPuissance(int pPuissance) {
		iPuissance = pPuissance;
	} // set
	
	
	public int getPuissance() {
		return iPuissance;
	} // get


	public void setIsEnMarche(boolean pOnOff) {
			this.isEnMarche = pOnOff ;
	} // set
	public boolean getIsEnMarche() {
			return this.isEnMarche;
	} // get

	
   /**
   * Method arreter permet d'arreter l'appareil
   */
	@Override
   public void arreter() {
		this.isEnMarche=false;
   }//arreter

   
   /**
	* Method demarrer( ) permet de mettre en marche l'appareil
	*/
   @Override
	public void demarrer() {
	   this.isEnMarche=true;
	}//demarrer
	
	/**
	* Method getConsommation retourne la consommation de l'appareil
	* 
	* @return iPuissance
	*/
   @Override
	public int  getConsommation(){
	  if (isEnMarche)
  		return this.iPuissance;
	  else
  		return 0;
	}//getConsommation
}
