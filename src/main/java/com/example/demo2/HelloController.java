package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label enter;

    @FXML
    private PasswordField login;

    @FXML
    private PasswordField pass;

    @FXML
    private Label wrong;

    @FXML
    private Button button2;

    @FXML
    private Button button3;



    @FXML
    protected void onPress(ActionEvent event) throws IOException {
        String log = "hans";
        String pa = "tree";

        if (login.getText().equals(log) && pass.getText().equals(pa)) {
            doSwitch(event);
        }
        else {
            wrong.setText("login or password wrong, try again");
        }
    }



    @FXML
    protected void doSwitch(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        if (event.getSource() == button2) {
            stage = (Stage)button2.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("test.fxml"));
        } else {
            stage = (Stage)button3.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        }

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}