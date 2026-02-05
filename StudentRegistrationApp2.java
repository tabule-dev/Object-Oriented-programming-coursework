
package company.studentregistrationapp2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class StudentRegistrationApp2 {

    public static void main(String[] args) 
laughs (args);
    }
    
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Student Registration");

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);

        firstNameField = new TextField();
        lastNameField = new TextField();
        emailField = new TextField();
        summaryArea = new TextArea();
        summaryArea.setEditable(false);

        grid.add(new Label("First Name:"), 0, 0);
        grid.add(firstNameField, 1, 0);
        grid.add(new Label("Last Name:"), 0, 1);
        grid.add(lastNameField, 1, 1);
        grid.add(new Label("Email:"), 0, 2);
        grid.add(emailField, 1, 2);

        Button submitButton = new Button("Submit");
        grid.add(submitButton, 1, 3);

        grid.add(new Label("Summary:"), 0, 4);
        grid.add(summaryArea, 1, 4);

        submitButton.setOnAction(e -> {
            String first = firstNameField.getText().trim();
            String last = lastNameField.getText().trim();
            String email = emailField.getText().trim();
            summaryArea.appendText(first + " " + last + " | " + email + "\n");
        });

        primaryStage.setScene(new Scene(grid, 400, 300));
        primaryStage.show();
    }
}

}
