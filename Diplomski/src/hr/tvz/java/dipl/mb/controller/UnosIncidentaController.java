package hr.tvz.java.dipl.mb.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class UnosIncidentaController {

	
	@FXML
    private TextField satPocetka;

    @FXML
    private TextField minPocetka;

    @FXML
    private ChoiceBox<?> prioritet;

    @FXML
    private DatePicker datumPocetka;

    @FXML
    private ChoiceBox<?> vrstaAlarmaChoiceBox;

    @FXML
    private TextField napomena;

    @FXML
    private TextField zahvacenaOprema;

    @FXML
    private TextField incidentRjesava;

    @FXML
    private TextField brNaloga;

    @FXML
    private ChoiceBox<?> katIncidentaChoiceBox;

    @FXML
    private void unesiIncident(ActionEvent event) {

    }

    @FXML
    private void obrisiPodatke(ActionEvent event) {

    }
	
	
}
