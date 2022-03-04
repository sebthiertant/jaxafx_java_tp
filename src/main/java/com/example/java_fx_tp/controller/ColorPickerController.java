package com.example.java_fx_tp.controller;

import com.example.java_fx_tp.model.Color;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class ColorPickerController implements Initializable {

    @FXML
    private Label redLabel;

    @FXML
    private Slider redRange;

    @FXML
    private TextField redInput;

    @FXML
    private Label greenLabel;

    @FXML
    private Slider greenRange;

    @FXML
    private TextField greenInput;

    @FXML
    private Label blueLabel;

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

    @FXML
    private Button resetButton;

    @FXML
    private Button randomButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Color color = new Color(0,0,0);
        Clipboard clipboard = Clipboard.getSystemClipboard();
        ClipboardContent content = new ClipboardContent();

        colorDisplay.setOnMouseClicked((e) -> {
            content.putString(getHexFromPane(colorDisplay));
            clipboard.setContent(content);
            System.out.println("Valeur hexadecimale collée dans le presse papier");
        });

        randomColorPane1.setOnMouseClicked((e) -> {
            content.putString(getHexFromPane(randomColorPane1));
            clipboard.setContent(content);
        });

        randomColorPane2.setOnMouseClicked((e) -> {
            content.putString(getHexFromPane(randomColorPane2));
            clipboard.setContent(content);
        });

        randomColorPane3.setOnMouseClicked((e) -> {
            content.putString(getHexFromPane(randomColorPane3));
            clipboard.setContent(content);
        });

        randomColorPane4.setOnMouseClicked((e) -> {
            content.putString(getHexFromPane(randomColorPane4));
            clipboard.setContent(content);
        });

        randomColorPane5.setOnMouseClicked((e) -> {
            content.putString(getHexFromPane(randomColorPane5));
            clipboard.setContent(content);
        });

        redRange.valueProperty().addListener((observableValue, number, t1) -> {
            color.setRed((int) redRange.getValue());
            redInput.setText(String.valueOf(color.getRed()));
            hexaCharInput.setText(String.valueOf(color.getHexValue()));
            colorDisplay.setStyle("-fx-background-color: " + color.getHexValue() + ";");

            // random color background
            randomColorPane1.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
            randomColorPane2.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
            randomColorPane3.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
            randomColorPane4.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
            randomColorPane5.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
        });

        greenRange.valueProperty().addListener((observableValue, number, t1) -> {
            color.setGreen((int) greenRange.getValue());
            greenInput.setText(String.valueOf(color.getGreen()));
            hexaCharInput.setText(String.valueOf(color.getHexValue()));
            colorDisplay.setStyle("-fx-background-color: " + color.getHexValue() + ";");

            // random color background
            randomColorPane1.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
            randomColorPane2.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
            randomColorPane3.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
            randomColorPane4.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
            randomColorPane5.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");

        });

        blueRange.valueProperty().addListener((observableValue, number, t1) -> {
            color.setBlue((int) blueRange.getValue());
            blueInput.setText(String.valueOf(color.getBlue()));
            hexaCharInput.setText(String.valueOf(color.getHexValue()));
            colorDisplay.setStyle("-fx-background-color: " + color.getHexValue() + ";");

            // random color background
            randomColorPane1.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
            randomColorPane2.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
            randomColorPane3.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
            randomColorPane4.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
            randomColorPane5.setStyle("-fx-background-color: " + generateHexadecimalString() + ";");
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

        resetButton.setOnMouseClicked((e) -> {
            color.setRed(0);
            color.setGreen(0);
            color.setBlue(0);

            redRange.setValue(color.getRed());
            redInput.setText(String.valueOf(color.getRed()));

            greenRange.setValue(color.getGreen());
            greenInput.setText(String.valueOf(color.getGreen()));

            blueRange.setValue(color.getBlue());
            blueInput.setText(String.valueOf(color.getBlue()));

            randomColorPane1.setStyle("-fx-background-color: #FFFFFF;");
            randomColorPane2.setStyle("-fx-background-color: #FFFFFF;");
            randomColorPane3.setStyle("-fx-background-color: #FFFFFF;");
            randomColorPane4.setStyle("-fx-background-color: #FFFFFF;");
            randomColorPane5.setStyle("-fx-background-color: #FFFFFF;");
        });

        randomButton.setOnMouseClicked((e) -> {
            String hexaRandomColor = generateHexadecimalString();
            Color randomColor = new Color(hexaRandomColor);

            redRange.setValue(randomColor.getRed());
            redInput.setText(String.valueOf(randomColor.getRed()));

            greenRange.setValue(randomColor.getGreen());
            greenInput.setText(String.valueOf(randomColor.getGreen()));

            blueRange.setValue(randomColor.getBlue());
            blueInput.setText(String.valueOf(randomColor.getBlue()));


            // random color background
            randomColorPane1.setStyle("-fx-background-color: " + generateColor().getHexValue() + ";");
            randomColorPane2.setStyle("-fx-background-color: " + generateColor().getHexValue() + ";");
            randomColorPane3.setStyle("-fx-background-color: " + generateColor().getHexValue() + ";");
            randomColorPane4.setStyle("-fx-background-color: " + generateColor().getHexValue() + ";");
            randomColorPane5.setStyle("-fx-background-color: " + generateColor().getHexValue() + ";");
        });
    }

    public static String generateHexadecimalString() {
        Random r = new Random();
        int n1 = r.nextInt(255);
        int n2 = r.nextInt(255);
        int n3 = r.nextInt(255);

        Color randomColor = new Color(n1, n2, n3);

        return randomColor.getHexValue();
    }


    public static Color generateColor() {
        Random r = new Random();
        int n1 = r.nextInt(255);
        int n2 = r.nextInt(255);
        int n3 = r.nextInt(255);

        Color randomColor = new Color(n1, n2, n3);

        return randomColor;
    }

    public static String getHexFromPane(Pane pane){
        String backgroundPane = pane.getStyle();
        return backgroundPane.substring(22, 29);
    }
}
