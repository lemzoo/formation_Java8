/**
 * Classe CompteurTest pour tester le compteur fournissant 
 * l'enegie. 
 */
package com.company.tp.compteur;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.core.StringStartsWith;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.company.tp.appareils.AppareilElectrique;
import com.company.tp.appareils.AppareilThermostate;
import com.company.tp.exception.CompteurADisjoncterException;

import junit.framework.Assert;

/**
 * @author Lamine BA
 *
 */
public class CompteurTest {

	/**
	 * Test method for {@link com.company.tp.compteur.Compteur#getEnergieFournie()}.
	 */
	@Test
	public void testGetEnergieFournie() {
		System.out.println("<---- Debut testGetEnergieFournie ---->");
		
		//Creer un compteur
		Compteur unCompteurEDF = new Compteur("SAGEM", "Compteur S30C2", 1250);
		
		//Creer un microonde
		AppareilThermostate unMicroOnde = new AppareilThermostate("Philips","mod123",250);
		
		//Creer un ordinateur
		AppareilElectrique unOrdinateur = new AppareilElectrique("DELL","GX100",500);

		//On connecte les deux appareils
		unCompteurEDF.connecter(unOrdinateur);
		unCompteurEDF.connecter(unMicroOnde);
		
		//J'augmente le thermostat
		unMicroOnde.setValeurThermostat(10);
		
		//Demarre les appareils
		unOrdinateur.setIsEnMarche(true);
		unMicroOnde.demarrer();
		
		int energieFournie = 0; 
		try{
			energieFournie = unCompteurEDF.getEnergieFournie();
		}catch(CompteurADisjoncterException compteurException){
			energieFournie = 0;
		}
		System.out.println("Energie fournie = " + energieFournie);		
		
		int energieAttendu = 500 + 20*10; //500 => Ordinateur et 20x10 => MicroOnde 
		System.out.println("Enegie attendu = " + energieAttendu);
		
		Assert.assertEquals(energieAttendu, energieFournie);
		System.out.println("<---- Fin testGetEnergieFournie ---->");
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	/**
	 * Test method for {@link com.company.tp.compteur.Compteur#getEnergieFournie()}.
	 */
	@Test
	public void testDisjoncterCompteur() {
		System.out.println("<---- Debut testDisjoncterCompteur ---->");
		
		//Creer un compteur
		Compteur unCompteurEDF = new Compteur("SAGEM", "Compteur S30C2", 1250);
		
		//Creer un microonde
		AppareilThermostate unMicroOnde = new AppareilThermostate("Philips","mod123",250);
		
		//Creer un ordinateur
		AppareilElectrique unOrdinateur = new AppareilElectrique("DELL","GX100",500);

		//On connecte les deux appareils
		unCompteurEDF.connecter(unOrdinateur);
		unCompteurEDF.connecter(unMicroOnde);
		
		unMicroOnde.setValeurThermostat(10);
		
		//Disjonctage de mon compteur
		for(int i=0; i<40; i++){
			unMicroOnde.incrementeThermostat();
		}
		
		//Demarre les appareils
		unOrdinateur.setIsEnMarche(true);
		unMicroOnde.demarrer();
		try{
			int energieFournie = unCompteurEDF.getEnergieFournie();
		
			List<CompteurADisjoncterException> list = new ArrayList<CompteurADisjoncterException>();
	
		    thrown.expect(CompteurADisjoncterException.class);
		    //thrown.expectMessage("Index: 0, Size: 0");
		    list.get(0); // execution will never get past this line
		}catch(Exception e){
			
		}
			
		/*try{			
			new ArrayList<CompteurADisjoncterException>().get(0);
			fail("Expected an IndexOutOfBoundsException to be thrown");
		}finally{
			
		}*/
        
		
		//Assert.assertEquals(0, 0);
		//fail("Not yet implemented");
		System.out.println("<---- fin testDisjoncterCompteur ---->");
	}

}
