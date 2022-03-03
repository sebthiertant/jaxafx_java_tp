package com.example.java_fx_tp.controller;

import com.example.java_fx_tp.model.Color;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;

import java.net.URL;
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

    }
}
