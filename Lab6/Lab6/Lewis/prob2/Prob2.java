package lab6.prob2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Prob2 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {
		window.setTitle("String Utility");

		GridPane pane = new GridPane();
		pane.setAlignment(Pos.TOP_CENTER);
		pane.setVgap(15);
		pane.setHgap(20);
		pane.setPadding(new Insets(30));

		// Creating buttons
		Button countLetters = new Button("Count Letters");
		Button reverseLetters = new Button("Reverse Letters");
		Button removeDuplicates = new Button("Remove Duplicates Letters");

		countLetters.setMaxWidth(Double.POSITIVE_INFINITY);
		reverseLetters.setMaxWidth(Double.POSITIVE_INFINITY);
		removeDuplicates.setMaxWidth(Double.POSITIVE_INFINITY);

		// adding buttons to column 1
		pane.add(countLetters, 0, 0);
		pane.add(reverseLetters, 0, 1);
		pane.add(removeDuplicates, 0, 2);

		// Create all the labels and fields;
		Label inputLabel = new Label("Input");
		TextField inputField = new TextField();

		Label outputLabel = new Label("Output");
		TextField outputField = new TextField();
		outputField.setEditable(false);

		Text fieldValidationMessage = new Text();
		fieldValidationMessage.setTextAlignment(TextAlignment.CENTER);

		// Building column 2
		VBox vb1 = new VBox();
		vb1.getChildren().add(inputLabel);
		vb1.getChildren().add(inputField);

		// VBox vb2 = new VBox();
		vb1.getChildren().add(outputLabel);
		vb1.getChildren().add(outputField);

//		pane.add(vb1, 1, 0);
		pane.add(vb1, 1, 0, 1, 3);

		// row3
		HBox row3 = new HBox(10); // row two
		row3.setAlignment(Pos.CENTER);
		row3.getChildren().add(fieldValidationMessage);
		pane.add(row3, 0, 3, 2, 1);

//		pane.setGridLinesVisible(true);
		Scene scene = new Scene(pane);
		window.setScene(scene);
		window.show();

		// Button Action
		countLetters.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				fieldValidationMessage.setText("");
				// Getting values and making sure they are non-empty
				String input = !inputField.getText().isEmpty() ? inputField.getText() : null;

				outputField.clear(); // This is meant to clear field incase it was set before
				if (input == null) {
					fieldValidationMessage.setFill(Color.ORANGE);
					fieldValidationMessage.setText("Warning! Your input field is empty");
				} else {
					String output = MyUtility.countLetters(input);
					outputField.setText(output);
				}
			}

		});

		// Button Action
		reverseLetters.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				fieldValidationMessage.setText("");
				// Getting values and making sure they are non-empty
				String input = !inputField.getText().isEmpty() ? inputField.getText() : null;

				outputField.clear(); // This is meant to clear field incase it was set before
				if (input == null) {
					fieldValidationMessage.setFill(Color.ORANGE);
					fieldValidationMessage.setText("Warning! Your input field is empty");
				} else {
					String output = MyUtility.reverseLetters(input);
					outputField.setText(output);
				}
			}

		});

		// Button Action
		removeDuplicates.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				fieldValidationMessage.setText("");
				// Getting values and making sure they are non-empty
				String input = !inputField.getText().isEmpty() ? inputField.getText() : null;

				outputField.clear(); // This is meant to clear field incase it was set before
				if (input == null) {
					fieldValidationMessage.setFill(Color.ORANGE);
					fieldValidationMessage.setText("Warning! Your input field is empty");
				} else {
					String output = MyUtility.removeDuplicates(input);
					outputField.setText(output);
				}
			}

		});

		outputField.setOnKeyReleased(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				fieldValidationMessage.setFill(Color.RED);
				fieldValidationMessage.setText("Nope! You cannot edit the output");
			}

		});
	}

}
