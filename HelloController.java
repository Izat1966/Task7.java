package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    Calculator calc = new Calculator();
    @FXML
    private TextField text;
    private void onClickBut1(){
        String val = text.getText();
        val = val + "1";
        text.setText(val);

    }

    @FXML
    private void onClickBut2(){
        String val = text.getText();
        val = val + "2";
        text.setText(val);

    }
    @FXML
    private void onClickBut3(){
        String val = text.getText();
        val = val + "3";
        text.setText(val);
    }
    @FXML
    private void onClickBut4(){
        String val = text.getText();
        val = val + "4";
        text.setText(val);
    }
    @FXML
    private void onClickBut5(){
        String val = text.getText();
        val = val + "5";
        text.setText(val);
    }

    @FXML
    private void onClickBut6(){
        String val = text.getText();
        val = val + "6";
        text.setText(val);
    }

    @FXML
    private void onClickBut7(){
        String val = text.getText();
        val = val + "7";
        text.setText(val);
    }

    @FXML
    private void onClickBut8(){
        String val = text.getText();
        val = val + "8";
        text.setText(val);
    }

    @FXML
    private void onClickBut9(){
        String val = text.getText();
        val = val + "9";
        text.setText(val);
    }

    @FXML
    private void onClickBut0(){
        String val = text.getText();
        val = val + "0";
        text.setText(val);
    }
    @FXML
    private void onPlusClick(){
        String op1 = text.getText();
        text.setText("");

        calc.setOp1( Integer.parseInt(op1) );
        calc.setOperand('+');

    }
    @FXML
    private void onEqualClick(){
        String op2 = text.getText();
        calc.setOp2( Integer.parseInt(op2) );
        calc.calculate();
        text.setText("" +  calc.getResult() );

    }
}