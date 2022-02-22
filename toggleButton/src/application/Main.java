package application;
	
import javafx.application.Application
;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FlowPane root = new FlowPane();
			root.setPadding(new Insets(10));
			root.setVgap(5);
			root.setHgap(5);
			Scene scene = new Scene(root,700,200);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			/* ceation de TestField*/
			TextField textfield= new TextField ("this is the Test");
			textfield.setMinWidth(180);
			textfield.getStyleClass().add("tf");
			/* ceation de ToggleGroup */
			final ToggleGroup group= new ToggleGroup();

			/*  définition de ToggleButton Clear */
            ToggleButton buttonClear = new  ToggleButton ("Clear");
            buttonClear.setToggleGroup(group);
            buttonClear.setOnAction(new EventHandler <ActionEvent> () {

				@Override
				public void handle(ActionEvent arg0) {
					textfield.clear();
					
				}
            	
            });

            buttonClear.getStyleClass().add("btn");
            /*  définition de ToggleButton Copy */
            ToggleButton  buttonCopy = new  ToggleButton ("Copy");
            buttonCopy.setToggleGroup(group);
            buttonCopy.setFocusTraversable(false);
            buttonCopy.setOnAction(new EventHandler <ActionEvent> () {

				@Override
				public void handle(ActionEvent arg0) {
					textfield.copy();
					
				}
            	
            });
            buttonCopy.getStyleClass().add("btn");
            /*  définition de ToggleButton Cut */
            ToggleButton  buttonCut = new  ToggleButton ("Cut");
            buttonCut.setToggleGroup(group);
            buttonCut.setFocusTraversable(false);
            buttonCut.setOnAction(new EventHandler <ActionEvent> () {

				@Override
				public void handle(ActionEvent arg0) {
					textfield.cut();
					
				}
            	
            });

            buttonCut.getStyleClass().add("btn");
            /*  définition de ToggleButton Paste */
            ToggleButton  buttonPaste= new  ToggleButton ("Paste");
            buttonPaste.setToggleGroup(group);
            buttonPaste.setFocusTraversable(false);
            buttonPaste.setOnAction(new EventHandler <ActionEvent> () {

				@Override
				public void handle(ActionEvent arg0) {
					textfield.paste();
					
				}
            	
            });

            buttonPaste.getStyleClass().add("btn");

			
			root.getChildren().addAll(textfield,buttonClear, buttonCopy, buttonCut,buttonPaste );
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
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
