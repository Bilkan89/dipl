package mb.dipl.loginPackage;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;



public class Main extends Application {
	
	//private Stage logInStage;
	//private static AnchorPane root;
	
	
	@Override
	public void start(Stage primaryStage) {
		Stage firstStage = primaryStage;
		try {
			
			AnchorPane root = FXMLLoader.load(Main.class.getResource("/fxml/fxml_logIn.fxml"));
			Scene scene = new Scene(root,300,239);
			scene.getStylesheets().add(getClass().getResource("/css/application.css").toExternalForm());
			firstStage.setScene(scene);
			firstStage.setResizable(false);
			firstStage.initStyle(StageStyle.UNDECORATED);
			firstStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
		
}
