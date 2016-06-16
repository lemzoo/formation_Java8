import java.util.ArrayList;

import com.company.tp.appareils.AppareilElectrique;
import com.company.tp.appareils.AppareilThermostate;
import com.company.tp.compteur.Compteur;
import com.company.tp.ihm.CadreGeneral;


public class Lanceur09 {

		
	public static void main(String[] args) {
	
		ArrayList alAppElec = new ArrayList();
		ArrayList alAppThermos = new ArrayList();
		

		AppareilElectrique unOrdinateur = new AppareilElectrique("DELL","GX100",500);
		AppareilThermostate unMicroOnde = new AppareilThermostate("Philips","mod123",250);
		Compteur unCompteurEDF = new Compteur(1250);

		
		unCompteurEDF.connecter(unOrdinateur);
		unCompteurEDF.connecter(unMicroOnde);
			
		CadreGeneral monInterface = new CadreGeneral(unOrdinateur, unMicroOnde, unCompteurEDF);		
	}
}
