/**
 * 
 */
package com.company.tp.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Lamine
 *
 */
public class TestException {

	public static void main(String[] args) {
		FileReader fr = null; 
		BufferedReader br = null; 
		String [] lesConfig = new String[3];
		
		try{
			fr = new FileReader("config.txt");
		}catch(FileNotFoundException fichierNonTrouvee){
			System.out.println("Fichier inconnu");
		}
		
		try{
			br = new BufferedReader(fr); 
			for(int i=0; i<3; i++){
				lesConfig[i] = br.readLine();
			}
		}catch(IOException ioe){
			System.out.println("Erreur : "+ioe.toString());
		}finally{
			try{
				if(br != null) br.close();
				if(fr != null) fr.close();
			}catch(Exception e){
				System.out.println("error");
				e.printStackTrace();
			}
		}
		
		
	}

}
