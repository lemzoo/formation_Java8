package com.cgi.tp.inter;

public interface ConsommateurDeCourant {
	
	//Methode renvoyant l'energie consommee par un consommateur
	public int getConsommation();
	public void demarrer();
	public void arreter();

}
