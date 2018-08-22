package question5;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.KeyEvent;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			
			Button btnClick = new Button("Bouton");
			
			FlowPane fp = new FlowPane(4, 4, btnClick);
			
			// --- ajoutez ici |||
			
			root.setOnKeyPressed(new EventHandler<KeyEvent>() {
				@Override
				public void handle(KeyEvent event) {
					System.out.println(event.getCode());
				}
			});
			
			btnClick.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					System.out.println("Click !");
				}
			});
						
						
			// --- ajoutez ici |||
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			root.setCenter(fp);
			
			primaryStage.setScene(scene);
			
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
