import java.sql.*;

import com.cgi.tp.appareils.*;

import java.util.*;


public class Lanceur {

	public static void main(String[] args) {
			
		String strMarque, strModele, strPuissanceMaxWatt;
		ArrayList alMesAppareils = new ArrayList();
		int cpt=0, iPuissanceMaxWatt;
		int retourReq=0;
		Connection maConnexion = null;
		Statement laRequete = null;
		ResultSet leResultat = null;
		
		System.out.println("Bonjour");
	
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			maConnexion = DriverManager.getConnection("jdbc:odbc:DSNDomotique");

			laRequete = maConnexion.createStatement();
			leResultat = laRequete.executeQuery("select marque, modele, puissanceMaxWatt from APPAREIL_ELECTRIQUE_TBL");

			while (leResultat.next()) {

				strMarque = leResultat.getString(1);
				strModele = leResultat.getString(2);
				iPuissanceMaxWatt = leResultat.getInt(3);

				alMesAppareils.add(new AppareilElectrique(strMarque,strModele,iPuissanceMaxWatt));
				cpt++;
			}
			leResultat.close();
			
			for (int i=0; i < alMesAppareils.size(); i++) {
				System.out.println(((AppareilElectrique)alMesAppareils.get(i)).getMarque());
			}

				
			/* ************************ */
			/* Modification de données  */
			/* ************************ */
	
			((AppareilElectrique)alMesAppareils.get(0)).setMarque("HP");		
			((AppareilElectrique)alMesAppareils.get(1)).setModele("HP555");
			((AppareilElectrique)alMesAppareils.get(2)).setPuissanceMaxWatts(111);
			
	
			/* ************************ */
			/*      MAJ des données     */
			/* ************************ */
	
				
			for (int i=0; i < alMesAppareils.size(); i++) {
				retourReq = laRequete.executeUpdate("UPDATE APPAREIL_ELECTRIQUE_TBL " +
				"SET Marque='" + ((AppareilElectrique)alMesAppareils.get(i)).getMarque()
				 + "', Modele='" + ((AppareilElectrique)alMesAppareils.get(i)).getModele() +
				 "', puissanceMaxWatt=" + ((AppareilElectrique)alMesAppareils.get(i)).getPuissanceMaxWatts() +
				 " where code=" + (i+1));
					 
				 System.out.println("retour Req = " + retourReq);	
			}														
		} catch (Exception e) {
			System.out.println("Erreur: " + e);
		} finally {
			try {
				laRequete.close();
				maConnexion.close();
			} catch (Exception e) {
				System.out.println("Erreur de fermeture: " + e);
			}			
		}
		
		System.out.println("Au revoir");

		}
		
}

