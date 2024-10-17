package com.example.demo;

public class Calculator {
    private double op1;
    private double op2;
    private char operand;
    private double result;

    public double getOp1() {
        return op1;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public char getOperand() {
        return operand;
    }

    public void setOperand(char operand) {
        this.operand = operand;
    }

    public double getResult() {
        return result;
    }

    public void calculate(){

        if(this.operand == '+'){
            this.result = this.op1 + this.op2;
        }

        if(this.operand == '-') {
            this.result = this.op1 - this.op2;
        }

        if(this.operand == '/') {
            this.result = this.op1 / this.op2;
        }

        if(this.operand == 'x') {
            this.result = this.op1 * this.op2;
        }
    }
}
