/* Class: CS1302-03
 * Name: Ethan Nguyen || Michael Noel
 * Lab: Lab7
 * Instructor: Monisha Verma
 */
package Lab8;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TestConverter extends Application
{

	final double KILOMETERS_PER_MILE = 1.602307322544464;
	protected TextField tfMile = new TextField();
	protected TextField tfKilometer = new TextField();
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		// TODO Auto-generated method stub
		// Set text fields alignment
		tfMile.setAlignment(Pos.BOTTOM_RIGHT);
		tfKilometer.setAlignment(Pos.BOTTOM_RIGHT);
		
		// Create a gridpane and place nodes into it
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.add(new Label("Mile"), 0, 0);
		pane.add(tfMile, 1, 0);
		pane.add(new Label("Kilometer"), 0, 1);
		pane.add(tfKilometer, 1, 1);
		
		// Create and register the handlers
		tfMile.setOnKeyPressed(e -> 
		{
			if (e.getCode() == KeyCode.ENTER &&
			tfMile.getText().length() > 0) 
			{
				double miles = Double.parseDouble(tfMile.getText());
				tfKilometer.setText(String.valueOf(miles * KILOMETERS_PER_MILE));
			}
		});
		
		tfKilometer.setOnKeyPressed(e ->
		{
			if (e.getCode() == KeyCode.ENTER &&
				tfKilometer.getText().length() > 0)
			{
				double kilometers = Double.parseDouble(tfKilometer.getText());
				tfMile.setText(String.valueOf(kilometers / KILOMETERS_PER_MILE));
			}
		});
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 60);
		primaryStage.setTitle("Exercise 16.4: Converter"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage



	}

}
