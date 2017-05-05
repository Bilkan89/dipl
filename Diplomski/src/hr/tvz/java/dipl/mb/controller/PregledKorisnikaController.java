package hr.tvz.java.dipl.mb.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import hr.tvz.java.dipl.mb.entitet.Adresa;
import hr.tvz.java.dipl.mb.entitet.Korisnik;
import hr.tvz.java.dipl.mb.sucelja.MojPopUp;
import hr.tvz.java.dipl.mb.sucelja.PodatciKorisnika;;

public class PregledKorisnikaController implements MojPopUp{

	@FXML
	private TextField pretraziTextF;
	
	@FXML
	private TableView<Korisnik> viewKorisnika;

	@FXML
	private TableColumn<Korisnik, String> imeK;

	@FXML
	private TableColumn<Korisnik, String> prezimeK;

	@FXML
	private TableColumn<Korisnik, Adresa> drzavaK;

	@FXML
	private TableColumn<Korisnik, Adresa> gradK;

	@FXML
	private TableColumn<Korisnik, Adresa> ulicaK;

	@FXML
	private TableColumn<Korisnik, Adresa> kucniBrojK;

	@FXML
	private TableColumn<Korisnik, Integer> kontaktBrojK;

	@FXML
	private TableColumn<Korisnik, String> korisnickoImeK;

	@FXML
	private TableColumn<Korisnik, String> napomenaK;

	@FXML
	private TableColumn<Korisnik, Date> datumKreiranja;

	@FXML
	private Label statusSkriveni;

	@FXML
	private void initialize() {
		imeK.setCellValueFactory(
				new PropertyValueFactory<Korisnik, String>("ime"));		
		prezimeK.setCellValueFactory(
				new PropertyValueFactory<Korisnik, String>("prezime"));
		
		
		drzavaK.setCellValueFactory(
				new PropertyValueFactory<Korisnik, Adresa>("adresaKorisnika"));
		drzavaK.setCellFactory(new Callback<TableColumn<Korisnik,Adresa>, TableCell<Korisnik,Adresa>>() {
			
			@Override
			public TableCell<Korisnik, Adresa> call(TableColumn<Korisnik, Adresa> param) {
				
				final TableCell<Korisnik, Adresa> cell = new TableCell<Korisnik, Adresa>(){
					
					@Override
					public void updateItem(final Adresa item, boolean empty){
						super.updateItem(item, empty);
						if(empty){
							this.setText("");
						}else{
							this.setText(item.getDrzava());
						}						
					};					
				};				
				return cell;
			}
		});
		
		
		gradK.setCellValueFactory(
				new PropertyValueFactory<Korisnik, Adresa>("adresaKorisnika"));
		gradK.setCellFactory(new Callback<TableColumn<Korisnik,Adresa>, TableCell<Korisnik,Adresa>>() {
				
				@Override
				public TableCell<Korisnik, Adresa> call(TableColumn<Korisnik, Adresa> param) {
					
					final TableCell<Korisnik, Adresa> cell = new TableCell<Korisnik, Adresa>(){
						
						@Override
						public void updateItem(final Adresa item, boolean empty){
							super.updateItem(item, empty);
							if(empty){
								this.setText("");
							}else{
								this.setText(item.getGrad());
							}						
						};					
					};				
					return cell;
				}
			});
		
		ulicaK.setCellValueFactory(
				new PropertyValueFactory<Korisnik, Adresa>("adresaKorisnika"));
		ulicaK.setCellFactory(new Callback<TableColumn<Korisnik,Adresa>, TableCell<Korisnik,Adresa>>() {
			
			@Override
			public TableCell<Korisnik, Adresa> call(TableColumn<Korisnik, Adresa> param) {
				
				final TableCell<Korisnik, Adresa> cell = new TableCell<Korisnik, Adresa>(){
					
					@Override
					public void updateItem(final Adresa item, boolean empty){
						super.updateItem(item, empty);
						if(empty){
							this.setText("");
						}else{
							this.setText(item.getUlica());
						}						
					};					
				};				
				return cell;
			}
		});
		
		
		kucniBrojK.setCellValueFactory(
				new PropertyValueFactory<Korisnik, Adresa>("adresaKorisnika"));
		kucniBrojK.setCellFactory(new Callback<TableColumn<Korisnik,Adresa>, TableCell<Korisnik,Adresa>>() {
					
					@Override
					public TableCell<Korisnik, Adresa> call(TableColumn<Korisnik, Adresa> param) {
						
						final TableCell<Korisnik, Adresa> cell = new TableCell<Korisnik, Adresa>(){
							
							@Override
							public void updateItem(final Adresa item, boolean empty){
								super.updateItem(item, empty);
								if(empty){
									this.setText("");
								}else{
									this.setText(String.valueOf(item.getKucniBroj()));
								}						
							};					
						};				
						return cell;
					}
				});
		
		
		
		kontaktBrojK.setCellValueFactory(
				new PropertyValueFactory<Korisnik, Integer>("kontaktBroj"));
		
		korisnickoImeK.setCellValueFactory(
				new PropertyValueFactory<Korisnik, String>("korisnickoIme"));
		
		napomenaK.setCellValueFactory(
				new PropertyValueFactory<Korisnik, String>("napomena"));
		datumKreiranja.setCellValueFactory(new PropertyValueFactory<Korisnik, Date>("datumKreiranja"));	
		
	}

	
	private void prikaziKorisnike(){
		
		
		
		
		
	};
	
	

	@FXML
	private void pretraziBtn(){
		try {
			List<Korisnik> ListaKorisnika = PodatciKorisnika.dohvatiKorisnike();
			
			
			ObservableList<Korisnik> listaZaPrikaz = FXCollections.observableArrayList(ListaKorisnika);
			viewKorisnika.setItems(listaZaPrikaz);
			
			
		} catch (Exception e) {			
//			popUP(e.getMessage());	
			System.out.println("GREŠKA!! ERROR!! /n"+
								"DOGODILA SE GREŠKA: "+e.getMessage()+" n/ "+
								 "UZROK: "+e.getCause()+" /n "+
								  "PORUKA: "+e.toString());
			e.printStackTrace();
		} 
	}


}
