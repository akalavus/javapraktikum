package praktikum11;

import com.sun.javafx.geom.Rectangle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane aken = new Pane();
		
		Rectangle kast = new Rectangle(120,60);//Siit jai pooleli!!!
		
		
		Scene stseen = new Scene(aken, 600, 400);
		primaryStage.setScene(stseen);
		
		primaryStage.show();
		
	}

}
