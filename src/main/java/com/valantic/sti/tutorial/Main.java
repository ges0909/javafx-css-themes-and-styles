package com.valantic.sti.tutorial;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;

    public static void main(final String... args) {
        launch(args);
    }

    @Override
    public void start(final Stage stage) {
        window = stage;
        window.setTitle("CSS Themes and Styles");

        final GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        final Label nameLabel = new Label("Username:");
        GridPane.setConstraints(nameLabel, 0, 0);

        final TextField nameTextField = new TextField("Vinz");
        GridPane.setConstraints(nameTextField, 1, 0);

        final Label passwordLabel = new Label("Password:");
        GridPane.setConstraints(passwordLabel, 0, 1);

        final TextField passwordTextField = new TextField();
        passwordTextField.setPromptText("Password");
        GridPane.setConstraints(passwordTextField, 1, 1);

        final Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton, 1, 2);
        // loginButton.setOnAction(e -> setUserAgentStylesheet(STYLESHEET_CASPIAN));

        grid.getChildren().addAll(nameLabel, nameTextField, passwordLabel, passwordTextField, loginButton);

        final Scene scene = new Scene(grid, 300, 200);
        scene.getStylesheets().add("viper.css");
        window.setScene(scene);
        window.show();
    }
}