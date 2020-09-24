package Codegym.tin.customer.Servlet;

import Codegym.tin.customer.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "DeleteServlet",urlPatterns = "/delcus")
public class DeleteServlet extends HttpServlet {
    CustomerService service=new CustomerService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));


        service.delete(id);

        response.sendRedirect("http://localhost:8080/BTLT_CRUDCustomer_JSP_war/index.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
