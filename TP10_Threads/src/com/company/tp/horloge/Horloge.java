package com.company.tp.horloge;

import java.util.Date;
import java.util.TimeZone; // TimeZone, SimpleTimeZone, Calendar, GregorianCalendar

import javax.swing.JLabel;
import javax.swing.JPanel;


public class Horloge extends JPanel implements Runnable {
	private JLabel	labHorloge = new JLabel("Il est : 12:59:59");
	private Thread myThread;

	public Horloge() {
		add(labHorloge);
		myThread = new Thread(this);
		// TODO demarrer le thread 
		myThread.start();
	}


	public void run() {
		//TODO
		int iHeure, iMinute, iSeconde; 
		String sHeureFormattee="";
		while (true) {
			try{
				// suspendre le thread pendant 1 seconde
				// TODO
				System.out.println("Attente d'une seconde");
				Thread.sleep(1000);
				
				// Recuperer l'heure courante a partir du GregorianCalendar
				// setter le label avec lheure : HOUR.MINUT.SECND
				// TODO instancier le  calendrier
				Date uneDate = new Date();
				
				//On extrait l'horloge
				iHeure = uneDate.getHours();
				iMinute = uneDate.getMinutes();
				iSeconde = uneDate.getSeconds();
				
				// maj l'IHM
				sHeureFormattee = String.format("Il est: %02d:%02d:%02d", iHeure, iMinute, iSeconde);
				System.out.println(sHeureFormattee);
				labHorloge.setText(sHeureFormattee);
			}// try
			catch (InterruptedException e){
				System.err.println("Une erreur a �t� d�tect�");
				e.toString();
			}// catch
		} // while
	}

	public static void main(String[] args) {
		Horloge horloge = new Horloge();
		
	}

} // class Horloge