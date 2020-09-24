package Codegym.tin.customer.Servlet;

import Codegym.tin.customer.model.Customer;
import Codegym.tin.customer.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateServlet",urlPatterns = "/updatecus")
public class UpdateServlet extends HttpServlet {
    CustomerService service=new CustomerService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("fullname");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");

        Customer customer=new Customer(id,name,phone,email,birthday,gender,address);

        service.update(customer);

        response.sendRedirect("http://localhost:8080/BTLT_CRUDCustomer_JSP_war/index.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
