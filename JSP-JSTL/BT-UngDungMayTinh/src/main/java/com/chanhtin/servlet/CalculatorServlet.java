package com.chanhtin.servlet;

import com.chanhtin.servlet.model.Calculator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet",urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            double num1 = Double.parseDouble(request.getParameter("num_fist"));
            double num2 = Double.parseDouble(request.getParameter("num_second"));
            double result = 0;
            PrintWriter writer = response.getWriter();

            String operator = request.getParameter("operator");

            try {
                result = Calculator.calculate(num1, num2, operator);
                writer.print(num1 + operator + num2 +" = "+result);
            } catch (ArithmeticException e) {
                writer.print(e.getMessage());
            }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
