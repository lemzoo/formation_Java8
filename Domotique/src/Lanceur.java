

import com.company.tp.appareils.AppareilElectrique;
import com.company.tp.appareils.AppareilSecurisee;
import com.company.tp.appareils.AppareilThermostate;

public class Lanceur {
	
		public static void main(String [] args){
		
		System.out.println("Bonjour");
		AppareilElectrique ordinateur= new AppareilElectrique("DELL","GX100",500);
		System.out.println(ordinateur);
		AppareilThermostate chauffage= new AppareilThermostate("Philips","mod123",400);
		System.out.println(chauffage);

		// affichage de l'objet chauffage (methode toString appelee par defaut)
		//Verification de l'instanciation
		System.out.println(ordinateur);
		System.out.println(chauffage);

		
		System.out.println("Marque :" + ordinateur.getMarque()
					 	+ ", Modele : " + ordinateur.getModele());
		System.out.println("Marque :" + chauffage.getMarque() 
						+ ", Modele : " + chauffage.getModele()
					    + ", Thermostat : " + chauffage.getThermostat());

		System.out.println("Consommation du thermostat avant la marche : " + chauffage.getConsommation());
		
		//Mise en marche chauffage, reglage thermostat
		chauffage.demarrer();
		chauffage.setValeurThermostat(7);
		System.out.println("Consommation du thermostat juste après la mise en marche : " + chauffage.getConsommation());
		
		System.out.println("Chauffage en marche? :" + chauffage.getIsEnMarche()+"\n"
						+ ", Thermostat : " + chauffage.getThermostat());
		
		//Tentative d'incrementation du thermostat superieure à son thermostat maxi (12)
		for (int i=0; i<20; i++) {
			chauffage.incrementeThermostat();	
		}
		System.out.println("Consommation du thermostat après incrémentation : " + chauffage.getConsommation());

		// mise en marche de l'ordinateur
		ordinateur.demarrer();

		System.out.println("\n\n\n\n\n");
		System.out.println("Bonjour");
		
		AppareilSecurisee appSecurisee = new AppareilSecurisee("Philips", "mod123", 250, 0);
		System.out.println(appSecurisee);
		
		appSecurisee = new AppareilSecurisee("Moulinex", "V32", 350, 0);
		System.out.println(appSecurisee);

		
		System.out.println("Mise en marche du microOnde sans la sécurité");
		appSecurisee.demarrer();
		System.out.println("---------------------");
		
		System.out.println("Mise en marche du microOnde avec enclenchement de la sécurité");
		appSecurisee.desenclencheSecurite();
		appSecurisee.demarrer();
		System.out.println("---------------------");
		
		System.out.println("Obtention de la consommation avec thermostat a 0 : ");
		System.out.println(appSecurisee.getThermostat());
		
		System.out.println("Reglage du Thermostat");
		System.out.println("----------------------");
		
		System.out.println("Obtention de la consommation");
		appSecurisee.setValeurThermostat(15);
		System.out.println(appSecurisee.getConsommation());
		
		System.out.println("----------------------");
		System.out.println("Desecnclenchement de la sécurité alors que l'appareil fonctionne : ");
		appSecurisee.arreter();
		
		System.out.println("Conso : " + appSecurisee.getConsommation());
		System.out.println("Au revoir!");
		
		System.out.println("HasCode AppareilSecurisee = " + appSecurisee.hashCode());
				
	}

}
