package hr.tvz.java.dipl.mb.sucelja;

import java.io.IOException;

import hr.tvz.java.dipl.mb.glavna.Main;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public interface MojPopUp {

	default void popUP(String poruka) {
		
		 try {
			Label porkaGreska = new Label();
			porkaGreska.setText(poruka);
			porkaGreska.setAlignment(Pos.CENTER);
			porkaGreska.setWrapText(true);
			BorderPane novi = FXMLLoader.load(Main.class.getResource("/fxml/fxml_PopUp.fxml"));
			novi.getChildren().add(porkaGreska);
			novi.setLeft(porkaGreska);
			Scene scena = new Scene(novi);
			Stage stg = new Stage();
			stg.setScene(scena); 
			stg.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
	};
	
	
	
}
