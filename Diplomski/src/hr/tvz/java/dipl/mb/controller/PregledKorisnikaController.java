package hr.tvz.java.dipl.mb.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import hr.tvz.java.dipl.mb.entitet.Korisnik;;

public class PregledKorisnikaController {

	@FXML
	private TableView<Korisnik> viewKorisnika;

	@FXML
	private TableColumn<Korisnik, String> imeKorisnika;

	@FXML
	private TableColumn<Korisnik, String> prezimeKorisnika;

	@FXML
	private TableColumn<Korisnik, String> drzavaKorisnika;

	@FXML
	private TableColumn<Korisnik, String> gradKorisnika;

	@FXML
	private TableColumn<Korisnik, String> ulicaKorisnika;

	@FXML
	private TableColumn<Korisnik, String> kucniBrojKorisnika;

	@FXML
	private TableColumn<Korisnik, String> kontaktBrojKorisnika;

	@FXML
	private TableColumn<Korisnik, String> korisnickoImeKorisnika;

	@FXML
	private TableColumn<Korisnik, String> napomenaImeKorisnika;

	@FXML
	private TableColumn<Korisnik, String> datumKreiranja;

	@FXML
	private Label statusSkriveni;

	@FXML
	private void initialize() {


	}


	@FXML
	private void prikaziKorisnike(){
		System.out.println("Proba");
	}


}
