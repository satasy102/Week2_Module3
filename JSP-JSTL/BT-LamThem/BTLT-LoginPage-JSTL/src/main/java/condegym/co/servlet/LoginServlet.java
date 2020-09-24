package condegym.co.servlet;

import condegym.co.model.User;
import condegym.co.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user=request.getParameter("email");
        String pass=request.getParameter("password");

        if(UserService.customerMap.containsKey(user)){
            User us=UserService.customerMap.get(user);

            if(us.getPassword().equals(pass)){
                request.setAttribute("result","Chao mung "+us.getFullName()+" den voi trang login.");
            } else request.setAttribute("result","Sai mat khau");
        } else request.setAttribute("result","Sai tai khoan");

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/login.jsp");
        dispatcher.forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
