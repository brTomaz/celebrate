package br.ufop.brTomaz.util;

import com.jfoenix.controls.JFXTextField;
import javafx.scene.control.TextField;

public class Constraints {
    public static void setTextFieldInteger(JFXTextField txt) {
        txt.textProperty().addListener((obs, oldValue, newValue) -> {
            if(newValue != null && !newValue.matches("\\d*")) {
                txt.setText(oldValue);
            }
        });
    }

    public static void setTextFieldMaxLength(JFXTextField txt, int max) {
        txt.textProperty().addListener((obs, oldValue, newValue) -> {
            if(newValue != null && newValue.length() > max) {
                txt.setText(oldValue);
            }
        });
    }

    public static void setTextFieldDouble(JFXTextField txt) {
        txt.textProperty().addListener((obs, oldValue, newValue) -> {
            if(newValue != null && !newValue.matches("\\d*([.]\\d*)?")) {
                txt.setText(oldValue);
            }
        });
    }
}
