package com.example.java_fx_tp.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

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
    private TextField[] hexaTabCharInput;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        redRange = new Slider(0,255,0);

        redRange.valueProperty().addListener((ov, old_val, new_val) -> System.out.println(new_val.doubleValue()));

        this.greenRange = new Slider(0,255,0);
        this.blueRange = new Slider(0,255,0);
    }
}
