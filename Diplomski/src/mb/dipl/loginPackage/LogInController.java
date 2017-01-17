package mb.dipl.loginPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LogInController {

	
	@FXML
	private Label hiddenLabel;
	@FXML
	private PasswordField passField;
	@FXML
	private TextField tfUsername;
	@FXML
	private Button loginButton;
	String user = "Matej";
	String pass = "Abcd";
	
	//TODO: potrebno je provjeri u bazi podataka korisni�ko ime i lozinku.
	public void loginMetoda(ActionEvent event) throws InterruptedException{
		if(tfUsername.getText().equals(user) && passField.getText().equals(pass)){
				
			hiddenLabel.setText("Login sucess!");
			TimeUnit.SECONDS.sleep(1);
			
			try {
				BorderPane layoutMoj = FXMLLoader.load(Main.class.getResource("/fxml/fxml_odabir2.fxml"));
				
				Stage secStage = new Stage(); 
				secStage.setFullScreen(true);
				secStage.setResizable(false);
				secStage.initStyle(StageStyle.UNDECORATED);
				
				Scene secScene = new Scene(layoutMoj);
				
				secStage.setScene(secScene);				
				secStage.show(); 
				
//				Stage glavni = (Stage) loginButton.getScene().getWindow();
//				glavni.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}						
		}else{
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("POGRE�AN UNOS");
			alert.setContentText("Unijeli ste krive podatke!!  Provjerite korisni�ko ime i lozinku!");
			alert.showAndWait();
		}
	}
	
	public void closeProgram(ActionEvent event){
		
		//Platform.exit();   //odluciti koji je bolji na�in...
		Stage stage =(Stage) loginButton.getScene().getWindow();
		stage.close();
		
	}
}