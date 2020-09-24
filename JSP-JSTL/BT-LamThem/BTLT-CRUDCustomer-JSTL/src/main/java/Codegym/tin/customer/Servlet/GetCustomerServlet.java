package Codegym.tin.customer.Servlet;

import Codegym.tin.customer.model.Customer;
import Codegym.tin.customer.service.CustomerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GetCustomerServlet", urlPatterns = "/getcus")
public class GetCustomerServlet extends HttpServlet {
    CustomerService customerService=new CustomerService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        Customer customer=customerService.findById(id);

        request.setAttribute("customer",customer);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/update.jsp");
        dispatcher.forward(request, response);

    }
}
