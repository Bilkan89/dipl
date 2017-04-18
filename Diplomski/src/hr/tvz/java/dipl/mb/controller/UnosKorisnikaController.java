package hr.tvz.java.dipl.mb.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class UnosKorisnikaController {

	
	@FXML
	private TextField imeKorisnika;
	
	@FXML
	private TextField prezimeKorisnika;
	
	@FXML
	private TextField drzavaKorisnika;
	
	@FXML
	private TextField gradKorisnika;
		
	@FXML
	private TextField ulicaKorisnika;
	
	@FXML
	private TextField kucniBrojKorisnika;
	
	@FXML
	private TextField kontaktBrojKorisnika;
	
	@FXML
	private TextField korisnickoImeKorisnika;
	
	@FXML
	private PasswordField lozinkaKorisnika;
	
	@FXML
	private PasswordField potvrdaLozinkeKorisnika;
	
	@FXML
	private TextArea napomenaKorisnika;
	
	
	@FXML
	private void unesiPodatke(ActionEvent event){
		System.out.println(imeKorisnika.getText());
		System.out.println(prezimeKorisnika.getText());
		System.out.println(drzavaKorisnika.getText());
		System.out.println(gradKorisnika.getText());
		System.out.println(ulicaKorisnika.getText());
		System.out.println(kucniBrojKorisnika.getText());
		System.out.println(kontaktBrojKorisnika.getText());
		System.out.println(korisnickoImeKorisnika.getText());
		
		System.out.println(lozinkaKorisnika.getText());
		System.out.println(potvrdaLozinkeKorisnika.getText());
		System.out.println(napomenaKorisnika.getText());
	};
	
	@FXML
	private void obrisiPodatke(ActionEvent event){
		imeKorisnika.clear();
		prezimeKorisnika.clear();
		drzavaKorisnika.clear();
		gradKorisnika.clear();
		ulicaKorisnika.clear();
		kucniBrojKorisnika.clear();
		kontaktBrojKorisnika.clear();
		korisnickoImeKorisnika.clear();
		lozinkaKorisnika.clear();
		potvrdaLozinkeKorisnika.clear();
		napomenaKorisnika.clear();		
	};
	
	
	
}
