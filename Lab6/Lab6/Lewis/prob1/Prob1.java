package lab6.prob1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Prob1 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {
		window.setTitle("Address Form");

		GridPane pane = new GridPane();
		pane.setAlignment(Pos.TOP_CENTER);
		pane.setVgap(10);
		pane.setHgap(10);
		pane.setPadding(new Insets(20));

		// Create all the labels and fields;
		Label nameLabel = new Label("Name");
		TextField nameField = new TextField();

		Label streetLabel = new Label("Street");
		TextField streetField = new TextField();

		Label cityLabel = new Label("City");
		TextField cityField = new TextField();

		Label stateLabel = new Label("State");
		TextField stateField = new TextField();

		Label zipLabel = new Label("Zip");
		TextField zipField = new TextField();

		Button submitButton = new Button("Submit");
		submitButton.setAlignment(Pos.CENTER);

		Text fieldValidationMessage = new Text();
		fieldValidationMessage.setTextAlignment(TextAlignment.CENTER);

		// Building row 1
		VBox vb1 = new VBox();
		vb1.getChildren().add(nameLabel);
		vb1.getChildren().add(nameField);

		VBox vb2 = new VBox();
		vb2.getChildren().add(streetLabel);
		vb2.getChildren().add(streetField);

		VBox vb3 = new VBox();
		vb3.getChildren().add(cityLabel);
		vb3.getChildren().add(cityField);

		HBox row1 = new HBox(10); // row one
		row1.setAlignment(Pos.CENTER);
		row1.getChildren().add(vb1);
		row1.getChildren().add(vb2);
		row1.getChildren().add(vb3);
		pane.add(row1, 0, 0);

		// row 2
		VBox vb4 = new VBox();
		vb4.getChildren().add(stateLabel);
		vb4.getChildren().add(stateField);

		VBox vb5 = new VBox();
		vb5.getChildren().add(zipLabel);
		vb5.getChildren().add(zipField);

		HBox row2 = new HBox(10); // row two
		row2.setAlignment(Pos.CENTER);
		row2.getChildren().add(vb4);
		row2.getChildren().add(vb5);
		pane.add(row2, 0, 1);

		// row3
		HBox row3 = new HBox(10); // row two
		row3.setAlignment(Pos.CENTER);
		row3.getChildren().add(fieldValidationMessage);
		pane.add(row3, 0, 2);

		HBox row4 = new HBox(10); // row two
		row4.setAlignment(Pos.CENTER);
		row4.getChildren().add(submitButton);
		pane.add(row4, 0, 3);

//		pane.setGridLinesVisible(true);
		Scene scene = new Scene(pane);
		window.setScene(scene);
		window.show();

		// Button Action
		submitButton.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent arg0) {
				// Getting values and making sure they are non-empty
				String name = !nameField.getText().isEmpty() ? nameField.getText() : null;
				String street = !streetField.getText().isEmpty() ? streetField.getText() : null;
				String city = !cityField.getText().isEmpty() ? cityField.getText() : null;
				String state = !stateField.getText().isEmpty() ? stateField.getText() : null;
				String zip = !zipField.getText().isEmpty() ? zipField.getText() : null;

				fieldValidationMessage.setText(""); // This is meant to clear field incase it was set before
				if (name == null || street == null || city == null || state == null || zip == null) {
					fieldValidationMessage.setFill(Color.ORANGE);
					fieldValidationMessage.setText("Warning! Make sure all the address information is filled");
				} else {
					System.out.println(name);
					System.out.println(street);
					System.out.println(city + ", " + state + " " + zip);
				}
			}

		});

	}

}
