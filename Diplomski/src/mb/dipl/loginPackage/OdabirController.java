package mb.dipl.loginPackage;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class OdabirController {

	
	@FXML
	private Button closeButton1;
			
	@FXML
	private BorderPane borderPaneGlavni;
	
	@FXML
	private void initialize(){}

	@FXML
	private void PregledTabliceIncidenata(ActionEvent event){
		
		 try {		 
			setCenterPane(FXMLLoader.load(Main.class.getResource("/fxml/fxml_PregledIncidenata.fxml")));
			 
		} catch (IOException e) {			
			e.printStackTrace();
		}	
	}
		
	
	@FXML
	private void closeProgram(ActionEvent event){			
			//Platform.exit();   //odluciti koji je bolji naæin...
			Stage stage =(Stage) closeButton1.getScene().getWindow();
			stage.close();			
		}
	
	
	public void setCenterPane(BorderPane centarPane) {
		borderPaneGlavni.setCenter(centarPane);
	}
	
	
	
}
