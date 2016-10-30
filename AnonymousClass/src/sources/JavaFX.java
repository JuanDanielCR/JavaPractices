package sources;
/*El siguiente ejemplo puede encontrarse en https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**Another example of Anonymous classes is on the Java Swing code*/
public class JavaFX extends Application{
	
	private static final int width = 300;
	private static final int height = 150;
	final static Label label = new Label();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Java FX stuff
		Group root = new Group();
		Scene scene = new Scene(root, width, height);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Text Field Exmaple");
		
		GridPane grid = new GridPane();
		Insets insets = new Insets(10, 10, 10, 10);
        grid.setPadding(insets);
        grid.setVgap(5);
        grid.setHgap(5);
        
        scene.setRoot(grid);
        final Label dollar = new Label("$");
        GridPane.setConstraints(dollar, 0, 0);
        grid.getChildren().add(dollar);
        
        //Use of the anonymous class
        final TextField sum = new TextField(){
        	@Override
        	public void replaceText(int start, int end, String text) {
        		 if (!text.matches("[a-z, A-Z]")) {
                     super.replaceText(start, end, text);                     
                 }
                 label.setText("Enter a numeric value");
        	}
        	@Override
            public void replaceSelection(String text) {
                if (!text.matches("[a-z, A-Z]")) {
                    super.replaceSelection(text);
                }
            }
        };
        
     //More Java FX stuff
	 sum.setPromptText("Enter the total");
     sum.setPrefColumnCount(10);
     GridPane.setConstraints(sum, 1, 0);
     grid.getChildren().add(sum);
     
     Button submit = new Button("Submit");
     GridPane.setConstraints(submit, 2, 0);
     grid.getChildren().add(submit);
     
     //Use of another anonymous class, but with a lambda expression
     submit.setOnAction(e -> label.setText("Enviado"));
     
     GridPane.setConstraints(label, 0, 1);
     GridPane.setColumnSpan(label, 3);
     grid.getChildren().add(label);
     
     scene.setRoot(grid);
     primaryStage.show();
	}
	public static void main(String[] args) {
	    launch(args);
	}
}
