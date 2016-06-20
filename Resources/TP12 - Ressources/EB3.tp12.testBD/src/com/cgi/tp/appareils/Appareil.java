
package com.cgi.tp.appareils;

public abstract class Appareil {
	
		private String marque;
		private String modele;


	/**
	 * Constructor for Appareil.
	 */
	public Appareil() {
		super();
	}

		public Appareil(String pMarque,String pModele){
			marque= pMarque;
			modele= pModele;
		}// constructeur

		/**
		 * Gets the marque.
		 * @return Returns a String
		 */
		public String getMarque() {
			return marque;
		}

		/**
		 * Sets the marque.
		 * @param marque The marque to set
		 */
		public void setMarque(String marque) {
			this.marque = marque;
		}

		/**
		 * Gets the modele.
		 * @return Returns a String
		 */
		public String getModele() {
			return modele;
		}

		/**
		 * Sets the modele.
		 * @param modele The modele to set
		 */
		public void setModele(String modele) {
			this.modele = modele;
		}

}
