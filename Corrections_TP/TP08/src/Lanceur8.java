import com.cgi.tp.appareils.AppareilElectrique;
import com.cgi.tp.appareils.AppareilThermostate;
import com.cgi.tp.maison.compteur;

public class Lanceur8 {

	public static void main(String[] args) {
		
		AppareilThermostate micro_onde= new AppareilThermostate("Philips","mod123",100);
		AppareilElectrique ordinateur= new AppareilElectrique("DELL","GX100",500);
		AppareilElectrique ordinateur1= new AppareilElectrique("ABC","DEF25",200);
		compteur EDF = new compteur(1000);

		System.out.println("-----------------------");
		System.out.println("Connection appareil");
		EDF.connecter(micro_onde);
		
		System.out.println("-----------------------");
		System.out.println("Puissance Max supportee :");
		System.out.println(EDF.getMaxWatts());
		
		System.out.println("-----------------------");
		System.out.println("Energie fournie par le compteur");	
		System.out.println(EDF.getEnergieFournie());
		
		System.out.println("-----------------------");
		System.out.println("Demarrage de l appareil (thermostat 2)");
		micro_onde.demarrer();
		micro_onde.setThermostat(2);
		System.out.println("Conso :" + micro_onde.getConsommation());
		System.out.println("Energie fournie par le compteur");	
		System.out.println(EDF.getEnergieFournie());
		
		System.out.println("-----------------------");
		System.out.println("Demarrage et ajout des 2 autres appareils");
		ordinateur.demarrer();
		ordinateur1.demarrer();
		EDF.connecter(ordinateur);
		EDF.connecter(ordinateur1);
		System.out.println("-----------------------");
		System.out.println("Energie fournie par le compteur");	
		System.out.println(EDF.getEnergieFournie());
		
		System.out.println("-----------------------");
		System.out.println("Augmentation du thermostat du Micro onde --> disjonctage");	
		micro_onde.incrementeThermostat();
		micro_onde.incrementeThermostat();
		System.out.println("Energie fournie par le compteur :");	
		System.out.println(EDF.getEnergieFournie());
		System.out.println("Etat des appareils :");	
		System.out.println("Micro onde en marche ? " + micro_onde.getIsEnMarche());
		System.out.println("Ordinateur en marche ? " + ordinateur.getIsEnMarche());
		System.out.println("Ordinateur1 en marche ? " + ordinateur1.getIsEnMarche());	
	}
}
