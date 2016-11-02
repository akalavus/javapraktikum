package praktikum11;

import com.sun.javafx.geom.Rectangle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane aken = new Pane();
		
		Rectangle kast = new Rectangle(100,100,300,200);//Siit jai pooleli!!!
		aken.getChildren().add(kast);
		
		Scene stseen = new Scene(aken, 600, 400);
		primaryStage.setScene(stseen);
		
		primaryStage.show();
		
	}

}
