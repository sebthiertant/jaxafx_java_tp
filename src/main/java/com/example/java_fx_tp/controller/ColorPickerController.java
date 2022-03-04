package com.example.java_fx_tp.controller;

import com.example.java_fx_tp.model.Color;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class ColorPickerController implements Initializable {

    @FXML
    private Slider redRange;

    @FXML
    private TextField redInput;

    @FXML
    private Slider greenRange;

    @FXML
    private TextField greenInput;

    @FXML
    private Slider blueRange;

    @FXML
    private TextField blueInput;

    @FXML
    private TextField hexaCharInput;

    @FXML
    private Pane colorDisplay;

    @FXML
    private Pane randomColorPane1;

    @FXML
    private Pane randomColorPane2;

    @FXML
    private Pane randomColorPane3;

    @FXML
    private Pane randomColorPane4;

    @FXML
    private Pane randomColorPane5;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Color color = new Color(0,0,0);

        redRange.valueProperty().addListener((observableValue, number, t1) -> {
            color.setRed((int) redRange.getValue());
            redInput.setText(String.valueOf(color.getRed()));
            hexaCharInput.setText(String.valueOf(color.getHexValue()));
            colorDisplay.setStyle("-fx-background-color: " + color.getHexValue() + ";");
        });

        greenRange.valueProperty().addListener((observableValue, number, t1) -> {
            color.setGreen((int) greenRange.getValue());
            greenInput.setText(String.valueOf(color.getGreen()));
            hexaCharInput.setText(String.valueOf(color.getHexValue()));
            colorDisplay.setStyle("-fx-background-color: " + color.getHexValue() + ";");

        });

        blueRange.valueProperty().addListener((observableValue, number, t1) -> {
            color.setBlue((int) blueRange.getValue());
            blueInput.setText(String.valueOf(color.getBlue()));
            hexaCharInput.setText(String.valueOf(color.getHexValue()));
            colorDisplay.setStyle("-fx-background-color: " + color.getHexValue() + ";");
        });

        redInput.setOnAction(actionEvent -> {
            try {
                color.setRed(Integer.parseInt(redInput.getText()));
                redRange.setValue(Integer.parseInt(redInput.getText()));
                hexaCharInput.setText(String.valueOf(color.getHexValue()));
                colorDisplay.setStyle("-fx-background-color: " + color.getHexValue() + ";");

                // random color background
                randomColorPane1.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
                randomColorPane2.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
                randomColorPane3.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
                randomColorPane4.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
                randomColorPane5.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
            }
            catch(IllegalArgumentException e) {
                redInput.setText(String.valueOf(color.getRed()));
            }
         });

        greenInput.setOnAction(actionEvent -> {
            try {
                color.setGreen(Integer.parseInt(greenInput.getText()));
                greenRange.setValue(Integer.parseInt(greenInput.getText()));
                hexaCharInput.setText(String.valueOf(color.getHexValue()));
                colorDisplay.setStyle("-fx-background-color: " + color.getHexValue() + ";");

                // random color background
                randomColorPane1.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
                randomColorPane2.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
                randomColorPane3.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
                randomColorPane4.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
                randomColorPane5.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
            }
            catch(IllegalArgumentException e) {
                greenInput.setText(String.valueOf(color.getGreen()));
            }
        });

        blueInput.setOnAction(actionEvent -> {
            try {
                color.setBlue(Integer.parseInt(blueInput.getText()));
                blueRange.setValue(Integer.parseInt(blueInput.getText()));
                hexaCharInput.setText(String.valueOf(color.getHexValue()));
                colorDisplay.setStyle("-fx-background-color: " + color.getHexValue() + ";");

                // random color background
                randomColorPane1.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
                randomColorPane2.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
                randomColorPane3.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
                randomColorPane4.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
                randomColorPane5.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
            }
            catch(IllegalArgumentException e) {
                blueInput.setText(String.valueOf(color.getBlue()));
            }
        });

        hexaCharInput.setOnAction(actionEvent -> {
            try {
                color.setHexValue(hexaCharInput.getText());
                hexaCharInput.setText(String.valueOf(color.getHexValue()));
                colorDisplay.setStyle("-fx-background-color: " + color.getHexValue() + ";");

                redRange.setValue(color.getRed());
                redInput.setText(String.valueOf(color.getRed()));

                greenRange.setValue(color.getGreen());
                greenInput.setText(String.valueOf(color.getGreen()));

                blueRange.setValue(color.getBlue());
                blueInput.setText(String.valueOf(color.getBlue()));

                // random color background
                randomColorPane1.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
                randomColorPane2.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
                randomColorPane3.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
                randomColorPane4.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
                randomColorPane5.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
            }
            catch(IllegalArgumentException e) {
                hexaCharInput.setText(color.getHexValue());
            }
        });
    }

    public static String generateHexadecimalString() {
        Random r = new Random();
        int n1 = r.nextInt(256);
        int n2 = r.nextInt(256);
        int n3 = r.nextInt(256);

        Color randomColor = new Color(n1, n2, n3);

        return randomColor.getHexValue();
    }
}
