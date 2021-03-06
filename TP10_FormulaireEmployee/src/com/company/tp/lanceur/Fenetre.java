/**
 * 
 */
package com.company.tp.lanceur;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.company.tp.person.Employee;


/**
 * Classe Fenetre 
 * @author Lamine BA
 *
 */
public class Fenetre extends JFrame implements MouseListener{
	
	private JLabel labelNom, labelPrenom, labelAge, labelSalaire; 
	
	private JTextField jtxtNom, jtxtPrenom, jtxtAge, jtxtSalaire; 
	
	private JButton btnEnvoyer; 
	
	public Fenetre (){
		this.setTitle("Formulaire de saisie des employ�es");
		this.setSize(400, 200);
		
		labelNom = new JLabel("Votre nom : "); 
		labelPrenom = new JLabel("Votre prenom : "); 
		labelAge = new JLabel("Votre age : "); 
		labelSalaire = new JLabel("Votre salaire : "); 
		
		jtxtNom = new JTextField();
		jtxtPrenom = new JTextField();
		jtxtAge = new JTextField();
		jtxtSalaire = new JTextField();
		
		btnEnvoyer = new JButton("Envoyer");
		
		//Gestionnaire de contenu
		Container container = this.getContentPane();
		
		LayoutManager layoutManager = new GridLayout(5, 2, 2, 2);
		
		//Gestionnaire de disposition
		container.setLayout(layoutManager);
		
		btnEnvoyer.addMouseListener(this);
		
		container.add(labelNom); container.add(jtxtNom);
		container.add(labelPrenom); container.add(jtxtPrenom);
		container.add(labelAge); container.add(jtxtAge);
		container.add(labelSalaire); container.add(jtxtSalaire);
		container.add(btnEnvoyer);
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Traitment du formulaire");
		String sNomEmployee = jtxtNom.getText(); 
		String sPrenomEmployee = jtxtPrenom.getText(); 
		int iAgeEmployee = Integer.parseInt(jtxtAge.getText()); 
		int iSalaireEmployee = Integer.parseInt(jtxtSalaire.getText()); ;
		Employee employee = new Employee(sNomEmployee, sPrenomEmployee, iAgeEmployee, iSalaireEmployee);
		System.out.println(employee);
	}

	public static void main(String[] args) {
		Fenetre monFormulaire = new Fenetre();
		monFormulaire.setVisible(true);;
	}
}
