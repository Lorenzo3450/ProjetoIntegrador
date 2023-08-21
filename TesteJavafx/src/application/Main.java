package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	

	private static Stage primaryStage;
	//tela de login
	private static Scene Teste;

	@Override
	public void start(Stage primaryStage) throws Exception{
	
		
		
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("LOLOAPP");
		
		initMainStage();
		
		
		
	}
	
	private void initMainStage() throws Exception{
		
			
			Parent fxmlLoguin = FXMLLoader.load(getClass().getResource(""));
			Teste = new Scene(fxmlLoguin);

			this.primaryStage.setScene(Teste);
			this.primaryStage.show();
			
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
