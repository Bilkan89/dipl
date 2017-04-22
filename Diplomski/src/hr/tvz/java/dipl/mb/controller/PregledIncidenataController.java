package hr.tvz.java.dipl.mb.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import hr.tvz.java.dipl.mb.entitet.Incident;

public class PregledIncidenataController {

	@FXML
	private TableView<Incident> tabIncidenti;
	
	
	@FXML
    private TableColumn<?, ?> brojNaloga;

    @FXML
    private TableColumn<?, ?> vrstaIncidenta;
	
    @FXML
    private TableColumn<?, ?> napomena;

    @FXML
    private TableColumn<?, ?> trajanjeIncidenta;

    @FXML
    private TableColumn<?, ?> rijesenIncident;

    @FXML
    private TableColumn<?, ?> zahvacenaOprema;

    @FXML
    private TableColumn<?, ?> vrstaAlarma;

    @FXML
    private TableColumn<?, ?> pocetakIncidenta;    
    
    @FXML
    private TableColumn<?, ?> prioritet;

    @FXML
    private TableColumn<?, ?> krajIncidenta;
    
    @FXML
    private TableColumn<?, ?> incidentRjesava;

    @FXML
    private CheckBox rijeseniCheckBox;
    
    @FXML
    private CheckBox nerijeseniCheckBox;

    @FXML
    private CheckBox tkCheckBox;
    
    @FXML
    private CheckBox mrezniCheckBox;

    @FXML
    private CheckBox serverCheckBox;
	
	@FXML
	private void initialize(){
		
	}
	
	@FXML
	private void filtrirajBtn(ActionEvent event) {

	}	
	
	
}
