/* Class: CS1302-03
 * Name: Ethan Nguyen || Michael Noel
 * Lab: Lab7
 * Instructor: Monisha Verma
 */
package Lab8;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class TestMoveCircle extends Application
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Application.launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		HBox buttons = new HBox(10);
		BorderPane pane = new BorderPane();
		Pane circlepane = new Pane();
		
		Circle circle = new Circle(250, 250, 50);
		circlepane.getChildren().add(circle);
		pane.getChildren().add(circlepane);
		
		
		

		Button left = new Button("LEFT");
		Button right = new Button("RIGHT");
		buttons.getChildren().add(left);
		buttons.getChildren().add(right);
		pane.setLeft(buttons);
		
		
		left.setOnAction(e -> {
			circle.setCenterX(circle.getCenterX()-circle.getRadius());
		});
		right.setOnAction(e -> {
			circle.setCenterX(circle.getCenterX()+circle.getRadius());
		});
		pane.setOnKeyPressed(e-> {
			if(e.getCode()==KeyCode.DOWN)
				circle.setCenterY(circle.getCenterY()+circle.getRadius());
			else if(e.getCode()==KeyCode.UP)
				circle.setCenterY(circle.getCenterY()-circle.getRadius());
		});
		
		
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Move Circle");
		primaryStage.show();
	}

}
