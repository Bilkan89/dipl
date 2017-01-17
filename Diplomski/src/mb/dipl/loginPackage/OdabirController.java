package mb.dipl.loginPackage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class OdabirController {

	
	@FXML
	private Button closeButton1;
	
	
	
	
	
	@FXML
	private void closeProgram(ActionEvent event){
			
			//Platform.exit();   //odluciti koji je bolji naæin...
			Stage stage =(Stage) closeButton1.getScene().getWindow();
			stage.close();
			
		}
}
