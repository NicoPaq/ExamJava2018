package question5;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;


public class Main extends Application implements EventHandler<ActionEvent> {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			Button btn = new Button("Bouton");
			root.setCenter(btn);
			
			
						
			// --- Première solution proposée |||
			
//			root.setOnKeyPressed(new EventHandler<KeyEvent>() {
//				@Override
//				public void handle(KeyEvent event) {
//					System.out.println(event.getCode());
//				}
//			});
//			
//			btnClick.setOnMouseClicked(new EventHandler<MouseEvent>() {
//				@Override
//				public void handle(MouseEvent event) {
//					System.out.println("Click !");
//				}
//			}); 
							
			// --- Solution plus efficace |||
			
			// 1. Définir la classe elle-meme comme gestionnaire de l'action sur le bouton (vu qu'elle implémente EventHandler<ActionEvent>)
			btn.setOnAction(this);
			// 2. Définir la methode à appeler en cas de KeyPress via une expression lambda.
			root.setOnKeyPressed(e -> System.out.println(e.getCode()));
			
			primaryStage.setScene(scene);
			
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void handle(ActionEvent event) {
		System.out.println("Click!");
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
