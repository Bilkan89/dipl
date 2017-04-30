package hr.tvz.java.dipl.mb.controller;

import java.io.IOException;

import hr.tvz.java.dipl.mb.glavna.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PocetniZaslonController {
	// kontroler klasa za poèetni dashbord prikaz

	@FXML
	private Button closeButton1;
	@FXML
	private Pane panePocetni;

	@FXML
	private BorderPane borderPaneGlavni;

	@FXML
	private void initialize() {
	}

	@FXML
	private void pocetniZaslon(ActionEvent event) {
		borderPaneGlavni.setCenter(null);//da ne stavalj centar na centar, centar u centar
		borderPaneGlavni.setCenter(panePocetni);	
	}

	@FXML
	private void pregledKorisnika(ActionEvent event) {
		setCenterPane2("/fxml/fxml_PregledKorisnika.fxml");
	}

	@FXML
	private void dodavanjeKorisnika(ActionEvent event) {
		otvoriNoviProzor("/fxml/fxml_UnosKorisnika.fxml");
	}

	@FXML
	private void pregledIncidenata(ActionEvent event) {
		setCenterPane2("/fxml/fxml_PregledIncidenata.fxml");
	}

	@FXML
	private void unosIncidenta(ActionEvent event) {
		otvoriNoviProzor("/fxml/fxml_UnosIncidenta.fxml");
	}

	@FXML
	private void izvjescePoKateg(ActionEvent event) {
		setCenterPane2("/fxml/fxml_IzvjescePoKategoriji.fxml");
	}
	
	@FXML
	private void izvjesceUkupno(ActionEvent event) {
		setCenterPane2("/fxml/fxml_IzvjesceUkupno.fxml");
	}
	
	@FXML
	private void izvjescePoRjesavanju(ActionEvent event) {
		setCenterPane2("/fxml/fxml_IzvjescePoRjesavanju.fxml");
	}
	
	
	@FXML
	private void oAplikaciji(ActionEvent event) {
		otvoriNoviProzor("/fxml/fxml_Oaplikaciji.fxml");
	}
	
	@FXML
	private void pomocProzor(){
		otvoriNoviProzor("/fxml/fxml_Pomoc.fxml");
	}
	

	@FXML
	private void closeProgram(ActionEvent event) {
		// Platform.exit(); //odluciti koji je bolji naæin...
		Stage stage = (Stage) closeButton1.getScene().getWindow();
		stage.close();
	}

	private void otvoriNoviProzor(String lokacijaFXML) {
		try {
			BorderPane novi = FXMLLoader.load(Main.class.getResource(lokacijaFXML));
			Scene noviScene = new Scene(novi);
			Stage noviStage = new Stage();
			noviStage.setScene(noviScene);
			//noviStage.initStyle(StageStyle.UTILITY);
			if(lokacijaFXML.equals("/fxml/fxml_Pomoc.fxml") || lokacijaFXML.equals("/fxml/fxml_Oaplikaciji.fxml")){
				noviStage.initStyle(StageStyle.UTILITY);
				noviStage.setResizable(false);
				noviStage.setMaximized(false);
			}
			noviStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
	}

	private void setCenterPane2(String lokacijaFXML) {
		try {
			borderPaneGlavni.setCenter(FXMLLoader.load(Main.class.getResource(lokacijaFXML)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
