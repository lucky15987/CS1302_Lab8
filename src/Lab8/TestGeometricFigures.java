/* Class: CS1302-03
 * Name: Ethan Nguyen || Michael Noel
 * Lab: Lab7
 * Instructor: Monisha Verma
 */
package Lab8;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TestGeometricFigures extends Application
{

	protected Circle circle = new Circle(50);
	protected Rectangle rectangle = new Rectangle();
	protected Ellipse ellipse = new Ellipse();
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		// TODO Auto-generated method stub
		// Set shape properties
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		rectangle.setStroke(Color.BLACK);
		rectangle.setWidth(150);
		rectangle.setFill(Color.WHITE);
		rectangle.setHeight(100);
		ellipse.setFill(Color.WHITE);
		ellipse.setStroke(Color.BLACK);
		ellipse.setRadiusX(100);
		ellipse.setRadiusY(50);
		
		// Create a hbox to hold buttons
		HBox paneForButtons = new HBox(5);
		paneForButtons.setAlignment(Pos.CENTER);
		RadioButton rbCircle = new RadioButton("Circle"); 
		RadioButton rbRectangle = new RadioButton("Rectangle"); 
		RadioButton rbEllipse = new RadioButton("Ellipse"); 

		
		// Create a toggle group for shapes
		ToggleGroup group = new ToggleGroup();
		rbCircle.setToggleGroup(group);
		rbRectangle.setToggleGroup(group);
		rbEllipse.setToggleGroup(group);
		
		//create a check box
		CheckBox chkFill = new CheckBox("Fill");
		
		//place buttons in the hbox
		paneForButtons.getChildren().addAll(rbCircle, rbRectangle, rbEllipse, chkFill);
		
		// Create a stack pane to hold the shapes
		StackPane paneForShapes = new StackPane();
		paneForShapes.setStyle("-fx-border-color: black");
		
		// Create a border pane to hold nodes
		BorderPane pane = new BorderPane();
		pane.setBottom(paneForButtons);
		pane.setCenter(paneForShapes);
		
		// Create and register handlers
		rbCircle.setOnAction(e -> 
		{
			if (rbCircle.isSelected())
			{
				paneForShapes.getChildren().clear();
				paneForShapes.getChildren().add(circle);
			}
		});
		
		rbRectangle.setOnAction(e -> 
		{
			if (rbRectangle.isSelected()) 
			{
				paneForShapes.getChildren().clear();
				paneForShapes.getChildren().add(rectangle);
			}
		});
		
		rbEllipse.setOnAction(e -> 
		{
			if (rbEllipse.isSelected())
			{
				paneForShapes.getChildren().clear();
				paneForShapes.getChildren().add(ellipse);
			}
		});
		
		chkFill.setOnAction(e -> 
		{
			if (chkFill.isSelected()) 
			{
				circle.setFill(Color.BLACK);
				rectangle.setFill(Color.BLACK);
				ellipse.setFill(Color.BLACK);
			} 
			else 
			{
				circle.setFill(Color.WHITE);
				rectangle.setFill(Color.WHITE);
				ellipse.setFill(Color.WHITE);			
			}
		});
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 400, 150);
		primaryStage.setTitle("Exercise 16.02: Geometric Figure"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}
}
