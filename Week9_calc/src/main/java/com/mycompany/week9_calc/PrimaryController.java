package com.mycompany.week9_calc;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {
    String opd1="0", arthOp="NULL";

    @FXML
    private TextField tfShowOutput;
    @FXML
   
    private Button primaryButton;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void addDigit(ActionEvent event) {
        if( tfShowOutput.getText().equals ("0") ) tfShowOutput.setText("");
        tfShowOutput.setText("");
        
       switch(((Button)event.getSource()) .getText()) {
           case "9": tfShowOutput.appendText("9"); break;
           case "8": tfShowOutput.appendText("8"); break;
           case "7": tfShowOutput.appendText("7"); break;
           case "6": tfShowOutput.appendText("6"); break;
           case "5": tfShowOutput.appendText("5"); break;
           case "4": tfShowOutput.appendText("4"); break;
           case "3": tfShowOutput.appendText("3"); break;
           case "2": tfShowOutput.appendText("2"); break;
           case "1": tfShowOutput.appendText("1"); break;
       }
    }

    @FXML
    private void proccesArith(ActionEvent event) {
         opd1 = tfShowOutput .getText() ; 
         arthOp = (Button)event.getSource()).getText();
        tfShowOutput .setText("0") ; 
        
    }

    @FXML
    private void clear(ActionEvent event) {
    }

    @FXML
    private void equal(ActionEvent event) {
        switch (arthOp){
            case
        }
    }
}
