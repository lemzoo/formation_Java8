package com.company.tp.lanceur;


import com.company.tp.appareils.AppareilElectrique;
import com.company.tp.appareils.AppareilSecurisee;
import com.company.tp.appareils.AppareilThermostate;
import com.company.tp.compteur.Compteur;
import com.company.tp.interfaces.FournisseurDeCourant;

public class Lanceur {
	
		public static void main(String [] args){
		
		System.out.println("Bonjour");
		System.out.println("------ DEBUT TP8 ---------");
		
		AppareilElectrique ordinateur= new AppareilElectrique("DELL","GX100",500);
		AppareilThermostate microOnde= new AppareilThermostate("Philips","mod123",400);
		AppareilElectrique unCaftiere = new AppareilElectrique("EXPRESSO","EXP_25",300);
		
		Compteur EDF = new Compteur (1000);
		
		System.out.println("------------------------");
		System.out.println("Connexion Appareil");
		EDF.connecter(microOnde);
		
		System.out.println("------------------------");
		System.out.println("Puissance Maximale support�e : " + EDF.getMaxWatts());

		System.out.println("------------------------");
		System.out.println("Energie fournie par le compteur : " + EDF.getEnergieFournie());
		
		System.out.println("------------------------");
		System.out.println("Demarrage de l'appareil (thermostat 2)");
		microOnde.demarrer();
		microOnde.setValeurThermostat(2);
		System.out.println("Consommation : " + microOnde.getConsommation());
		System.out.println("Eenrgie fournie par le compteur : " + EDF.getEnergieFournie());
		
		System.out.println("------------------------");
		System.out.println("Demarrage et ajout des 2 autres appareils");
		EDF.connecter(ordinateur);
		ordinateur.demarrer();
		
		EDF.connecter(unCaftiere);
		unCaftiere.demarrer();

		
		System.out.println("------------------------");
		System.out.println("Eenrgie fournie par le compteur : " + EDF.getEnergieFournie());
		
		System.out.println("------------------------");
		System.out.println("Augmentation du thermostat du microOnde ->disjonctage");
		for (int i=0; i<9; i++){
			microOnde.incrementeThermostat();
		}
		
		System.out.println("Energie fournie par le compteur : " + EDF.getEnergieFournie());
		
		System.out.println("Etat des appareils : ");
		System.out.println("MicoOnde en marche : " + microOnde.getIsEnMarche());
		System.out.println("Ordinateur en marche : " + ordinateur.getIsEnMarche());
		System.out.println("Cafti�re en marche : " + unCaftiere.getIsEnMarche());
		
		
		System.out.println("------FIN TP8 ---------");
	}

}
