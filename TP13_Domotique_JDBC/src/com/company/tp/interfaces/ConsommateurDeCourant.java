/**
 * 
 */
package com.company.tp.interfaces;

/**
 * Interface ConsommateurDeCourant impl�mente les m�thodes 
 * pour le consommateur de courant
 * @author Lamine BA
 *
 */
public interface ConsommateurDeCourant {
	public void arreter();
	public void demarrer();
	public int getConsommation();
}