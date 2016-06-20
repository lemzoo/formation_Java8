

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

import com.cgi.tp.appareils.AppareilElectrique;
import com.cgi.tp.appareils.AppareilTermostate;
import com.cgi.tp.exceptions.AppliException;
import com.cgi.tp.ihm.PanneauAppareil;
import com.cgi.tp.ihm.PanneauCompteur;
import com.cgi.tp.ihm.PanneauThermostat;
import com.cgi.tp.maison.Compteur;
import com.cgi.tp.usine.FactAppareilElectrique;

public class LanceurFrame extends Frame {


	public static void main(String [] args){

		System.out.println("Bonjour");

	// PARTIE METIER :
		AppareilElectrique unOrdinateur=null;
		AppareilElectrique unOrdinateurRecherche=null;

		try{
		// utiliser l'usine à fabriquer et rendre persistant un AppareilElectrique

			unOrdinateur = FactAppareilElectrique.createAppareilElectrique("DELL","GX100",500);
			unOrdinateurRecherche=
				FactAppareilElectrique.getAppareilElectrique("DELL","GX100",500);
		}
		catch(AppliException e){
			e.toString();
		}
		AppareilTermostate unMicroOnde= new AppareilTermostate("Philips","mod123",250,5);
		Compteur unCompteurEDF = new Compteur(1250); // de 1250 Watts


		// connecter les appareils sur le compteur
		unCompteurEDF.connecter(unOrdinateur);
		unCompteurEDF.connecter(unMicroOnde);


	//partie ihm
		LanceurFrame unLanceurFrame = new LanceurFrame();
		Panel pane = new Panel();
		pane.setSize(510,500);
		unLanceurFrame.add(pane,"Center");


		pane.setLayout(new FlowLayout(FlowLayout.LEADING));
		pane.setBackground(new Color(125,204,204));
		pane.setSize(new Dimension(510,500));
		PanneauAppareil unPanoE=new PanneauAppareil(unOrdinateur);
		pane.add(unPanoE);
		PanneauThermostat unPanoT=new PanneauThermostat(unMicroOnde);
		pane.add(unPanoT);
		PanneauCompteur unPanoC=new PanneauCompteur(unCompteurEDF);
		pane.add(unPanoC);

		// PARTIE Presentation:connecter les PanneauAppareils sur le compteur
	    // la classe PanneauElectrique implemente l'interface ConsommateurDeCourant
		// pour mettre à jour la Presentation.
		unCompteurEDF.connecter(unPanoE);
		unCompteurEDF.connecter(unPanoT);

		// set the window size and pop it up
		unLanceurFrame.pack();
		unLanceurFrame.show();

	}
	public LanceurFrame() {
		super("Domotique");
	}

} //classLanceur
