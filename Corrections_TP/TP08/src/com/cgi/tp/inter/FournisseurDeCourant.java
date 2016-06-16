package com.cgi.tp.inter;

public interface FournisseurDeCourant {
	
	//Methode permettant � un objet consommant du courant
	//de s'abonner au (de se faire connaitre du) fournisseur
	public void connecter(ConsommateurDeCourant consommateur);
	
	//Methode permettant � un objet consommant du courant
	//de se d�sabonner du fournisseur
	public void deconnecter(ConsommateurDeCourant consommateur);
	
	//Methode permettant au fournisseur de disjoncter et donc de couper 
	//le courant � l'ensemble de ses abonn�s
	public void disjoncter();
	
	//Methode retournant l'energie totale fournie par le fournisseur
	public int getEnergieFournie();
	

}
