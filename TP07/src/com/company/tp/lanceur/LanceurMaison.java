package com.company.tp.lanceur;

import com.company.tp.maison.Maison;

public class LanceurMaison {

	public static void main(String[] args) {
		//Instanciation de l'objet Maison
		Maison maMaison = new Maison();
		
		System.out.println("Sans le trie");
		//Statuer les appareils
		maMaison.status();
		
		//Allumer tous les appareils
		maMaison.toutAllumer();
		
		//Arreter tous les appareils
		maMaison.toutEteindre();
		
		//Faire le tri croissante
		maMaison.trierCroissant();
		System.out.println("Avec le tri croissant");
		//Statuer les appareils
		maMaison.status();
		
		//Faire le tri decroissante
		maMaison.trierDecroissant();
		System.out.println("Avec le tri decroissant");
		//Statuer les appareils
		maMaison.status();
		
		
	}

}
