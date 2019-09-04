/* Class: CS1302-03
 * Name: Ethan Nguyen || Michael Noel
 * Lab: Lab7
 * Instructor: Monisha Verma
 */
package Lab8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class TestChangeCircle extends Application
{

	private Circle circle = new Circle(250,250,25);
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Application.launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		
		
		pane.getChildren().add(circle);
		
		circle.setOnMouseClicked(e -> {
			circle.setCenterX(Math.random()*400);
			circle.setCenterY(Math.random()*400);
			circle.setFill(Color.rgb((int)(Math.random()*255), (int)(Math.random()*255),
					(int)(Math.random()*255)));
		});
		
		Scene scene = new Scene(pane,500,500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Click to change circle");
		primaryStage.show();
	}

}
