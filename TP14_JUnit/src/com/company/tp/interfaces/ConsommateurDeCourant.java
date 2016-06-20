/**
 * 
 */
package com.company.tp.interfaces;

/**
 * Interface ConsommateurDeCourant implémente les méthodes 
 * pour le consommateur de courant
 * @author Lamine BA
 *
 */
public interface ConsommateurDeCourant {
	public void arreter();
	public void demarrer();
	public int getConsommation();
}
