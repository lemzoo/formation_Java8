/**
 * 
 */
package com.company.tp.interfaces;

/**
 * Interface FournisseurDeCourant contient le contrat de service
 * @author Lamine BA
 *
 */
public interface FournisseurDeCourant {
	public void connecter(ConsommateurDeCourant pConsommateur);
	public void deconnecter(ConsommateurDeCourant pConsommateur);
	public void demanderEnergie(int pQuantiteWatts); 
	public int getEnergieFournie();
	public void disjoncter();
}
