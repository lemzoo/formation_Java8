/**
 * 
 */
package com.company.tp.interfaces;

import com.company.tp.exception.CompteurADisjoncterException;

/**
 * Interface FournisseurDeCourant contient le contrat de service
 * @author Lamine BA
 *
 */
public interface FournisseurDeCourant {
	public void connecter(ConsommateurDeCourant pConsommateur);
	public void deconnecter(ConsommateurDeCourant pConsommateur);
	public void demanderEnergie(int pQuantiteWatts); 
	public int getEnergieFournie() throws CompteurADisjoncterException;
	public void disjoncter();
}
