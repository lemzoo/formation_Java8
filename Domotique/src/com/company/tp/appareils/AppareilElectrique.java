package com.company.tp.appareils;

public class AppareilElectrique extends Appareil {

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
		return "AppareilElectrique [ " + super.toString() + " [iPuissance=" + iPuissance + ", isEnMarche=" + isEnMarche + "]";
	}


	public void setPuissance(int pPuissance) {
		iPuissance = pPuissance;
	} // set
	
	
	public int getPuissance() {
		return iPuissance;
	} // get


	public void setIsEnMarche(boolean pOnOff) {
			isEnMarche = pOnOff ;
	} // set
	public boolean getIsEnMarche() {
			return isEnMarche;
	} // get


	/**
		 met l'appareil en marche
	*/
    public void demarrer() {
	   isEnMarche=true;
    }//demarrer

   /**
    arrete l'appareil
   */
   public void arreter() {
   	      isEnMarche=false;
   }//arreter

	/**
	  retourne la consommation de l'appareil
	*/
	public int  getConsommation(){
		  if (isEnMarche)
		  		return iPuissance;
		  else
		  		return 0;
	}//getConsommation

}
