package Codegym.tin.customer.Servlet;

import Codegym.tin.customer.model.Customer;
import Codegym.tin.customer.model.CustomerList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "DeleteServlet",urlPatterns = "/delcus")
public class DeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        ArrayList<Customer> cusList= CustomerList.customerArrayList;
        for (int i = 0; i <cusList.size() ; i++) {
            Customer customer= cusList.get(i);
            if(customer.getId()==id){
                cusList.remove(i);
            }
        }

        response.sendRedirect("http://localhost:8080/BTLT_CRUDCustomer_JSP_war/index.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
