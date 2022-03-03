package com.example.java_fx_tp.controller;

import com.example.java_fx_tp.model.User;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class UserController implements Initializable {

    private User user;

    @FXML
    private TextField textFieldFirstName;

    @FXML
    private TextField textFieldLastName;

    @FXML
    private Button buttonSubmit;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttonSubmit.setOnMouseClicked((mouseEvent) -> {
            String firstName = textFieldFirstName.getText();
            String lastName = textFieldLastName.getText();
            user = new User(firstName, lastName);

            System.out.println(user.getFirstName() + " " + user.getLastName());
        });
    }
}
