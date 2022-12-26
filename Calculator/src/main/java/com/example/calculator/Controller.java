package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;



public class Controller {

    @FXML
    private void initialize() {
       clrButton.setOnAction(event-> output.setText(""));
    }
    @FXML
    private Button clrButton;
    @FXML
    private Text output;
    @FXML
    private long num1 = 0;
    @FXML
    private boolean start = true;
    private String operator = "";
    private final Calculator calculator = new Calculator();
    @FXML
    private void num(ActionEvent event){
        if(start){
            output.setText("");
            start = false;
        }
        String value = ((Button)event.getSource()).getText();
        output.setText(output.getText() + value);
    }
    @FXML
    private void processOperator(ActionEvent event){
        String value = ((Button)event.getSource()).getText();
        if(!"=".equals(value)) {
            if (!operator.isEmpty()) return;
            operator = value;
            num1 = Long.parseLong(output.getText());
            output.setText("");
        }
        else{
            if(operator.isEmpty()) return;
            output.setText(String.valueOf(calculator.calculation(num1,Long.parseLong(output.getText()),operator)));
            operator = "";
            start = true;
        }
    }
}
