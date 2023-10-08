package com.example.colorchooser_app;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class ColorChooserController {

    @FXML
    private Slider AlphaSlider;

    @FXML
    private TextField AlphaTextField;

    @FXML
    private Slider BlueSlider;

    @FXML
    private TextField BlueTextField;

    @FXML
    private Pane ColorPickerPane;

    @FXML
    private Slider GreenSlider;

    @FXML
    private TextField GreenTextField;

    @FXML
    private Slider RedSlider;

    @FXML
    private TextField RedTextField;
    @FXML
    private void RedsliderMoved(MouseEvent event){
        RedTextField.setText(String.valueOf(  (Math.round((RedSlider.getValue())*100.00))/100.00 ));
        changeColor(event);
    }
    @FXML
    private void GreensliderMoved(MouseEvent event){
        GreenTextField.setText(String.valueOf(  (Math.round((GreenSlider.getValue())*100.00))/100.00 ));
        changeColor(event);
    }
    @FXML
    private void BluesliderMoved(MouseEvent event){
        BlueTextField.setText(String.valueOf(  (Math.round((BlueSlider.getValue())*100.00))/100.00 ));
        changeColor(event);
    }
    @FXML
    private void AlphasliderMoved(MouseEvent event){
        AlphaTextField.setText(String.valueOf(  (Math.round((AlphaSlider.getValue())*100.00))/100.00 ));
        changeColor(event);
    }

    @FXML
    private void changeColor(MouseEvent event){//new Color(10,20,20,20)
        try {
            ColorPickerPane.setBackground(Background.fill(new Color(Double.valueOf(RedTextField.getText()),
                    Double.valueOf(GreenTextField.getText()),
                    Double.valueOf(BlueTextField.getText()),
                    Double.valueOf(AlphaTextField.getText()))));
        }catch (NumberFormatException ex){

        }

    }

}
