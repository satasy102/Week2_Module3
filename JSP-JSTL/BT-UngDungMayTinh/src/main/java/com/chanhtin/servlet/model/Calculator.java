package com.chanhtin.servlet.model;

public class Calculator {
    public static double calculate(double firstOperand, double secondOperand, String operator ){
        switch (operator){
            case "+":
                return firstOperand + secondOperand;
            case "-":
                return firstOperand - secondOperand;
            case "x":
                return firstOperand * secondOperand;
            case ":":
                if(secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new ArithmeticException("Không thể chia cho 0");
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
