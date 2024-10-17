/*
Ron Cox
Java 605.201.83
Assignment 11
*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple Calculator");

        // Create UI components
        Label firstValueLabel = new Label("First Value:");
        TextField firstValueTextField = new TextField();

        Label secondValueLabel = new Label("Second Value:");
        TextField secondValueTextField = new TextField();

        Label sumLabel = new Label("Sum is:");
        TextField sumTextField = new TextField();
        sumTextField.setEditable(false);

        Button calculateButton = new Button("Calculate");
        // Event handling for button would go here

        // Layout using a GridPane
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        
        // Add components to the GridPane
        gridPane.add(firstValueLabel, 0, 0);
        gridPane.add(firstValueTextField, 1, 0);
        gridPane.add(secondValueLabel, 0, 1);
        gridPane.add(secondValueTextField, 1, 1);
        gridPane.add(sumLabel, 0, 2);
        gridPane.add(sumTextField, 1, 2);
        gridPane.add(calculateButton, 1, 3);

        // Align the 'Calculate' button to the right (or center, or left as you prefer)
        GridPane.setMargin(calculateButton, new Insets(0, 0, 0, 0));
        GridPane.setHalignment(calculateButton, HPos.CENTER); // Can be HPos.LEFT, HPos.RIGHT

        // Set the Size of the GridPane
        gridPane.setMinSize(400, 200);
        
        // Set alignment to center
        gridPane.setAlignment(Pos.CENTER);

        // Create a scene with the GridPane as the root node
        Scene scene = new Scene(gridPane);

        // Set the scene and show the stage
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
