package com.cgi.tp.appareils;

public class AppareilElectrique extends Appareil {

	private int puissanceMaxWatts = 0;
	private boolean isEnMarche = false;
	private boolean isSousTension = false;
	// est associé a un FournisseurDeCourant en marche (armé)
	private boolean isBranche = false; // est branché a un FournisseurDeCourant


	/**
	 * Constructor for AppareilElectrique.
	 */
	public AppareilElectrique(String p_marque, String p_modele, int p_MaxWatt) {
		super(p_marque, p_modele);
		puissanceMaxWatts = p_MaxWatt;
	}

	/**
	 * Gets the puissanceMaxWatts.
	 * @return Returns a int
	 */
	public int getPuissanceMaxWatts() {
		return puissanceMaxWatts;
	}

	/**
	 * Sets the puissanceMaxWatts.
	 * @param puissanceMaxWatts The puissanceMaxWatts to set
	 */
	public void setPuissanceMaxWatts(int puissanceMaxWatts) {
		this.puissanceMaxWatts = puissanceMaxWatts;
	}

}
