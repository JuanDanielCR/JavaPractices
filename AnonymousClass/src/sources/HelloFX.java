package sources;
/*This example is from the Oracle official documentation, I made some changes to it*/
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX extends Application{
	public static void main(String args[]){
		//static method from Application class
		launch(args);//Internally calls its thread
	}
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Hello FX");
		
		Button btn = new Button();
		btn.setText("Hello");
		//For Swing is an ActionPerfomer, here is an EventHandler
		btn.setOnAction(new EventHandler<ActionEvent>() {//Using anonymous class
			@Override
			public void handle(ActionEvent event) {
				btn.setText(btn.getText().concat(" Java FX"));				
			}
		});
		
		StackPane root = new StackPane();
	    root.getChildren().add(btn);
	    stage.setScene(new Scene(root, 300, 250));
	    stage.show();
	}

}
