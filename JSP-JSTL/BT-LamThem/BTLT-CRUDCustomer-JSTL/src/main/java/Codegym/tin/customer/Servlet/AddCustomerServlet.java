package Codegym.tin.customer.Servlet;

import Codegym.tin.customer.service.CustomerService;
import Codegym.tin.customer.model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static Codegym.tin.customer.service.CustomerService.customerArrayList;


@WebServlet(name = "AddCustomerServlet", urlPatterns = "/addcus")
public class AddCustomerServlet extends HttpServlet {
    static int id=customerArrayList.size();
    CustomerService service=new CustomerService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("fullname");
        String phone = request.getParameter("phone");
        String email = request.getParameter("Email");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");

        id++;

        Customer customer = new Customer(id, name, phone, email, birthday, gender, address);

        service.add(customer);

        response.sendRedirect("add.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
