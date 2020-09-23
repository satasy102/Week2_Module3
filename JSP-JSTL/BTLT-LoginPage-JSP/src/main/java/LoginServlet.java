import condegym.co.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, Customer> customerMap = new HashMap<>();
        Customer cus1=new Customer("dochanhtin7495@gmail.com","chanhtin123","Do Chanh Tin");
        Customer cus2=new Customer("volong95@gmail.com","longvo123","Vo Long");
        Customer cus3=new Customer("nguyenduongdo96gmail.com","duong123","Nguyen Do Duong");
        Customer cus4=new Customer("letanphuc95@gmail.com","tanphuc123","Le Tan Phuc");

        customerMap.put("dochanhtin7495@gmail.com", cus1);
        customerMap.put("volong95@gmail.com", cus2);
        customerMap.put("nguyenduongdo96gmail.com", cus3);
        customerMap.put("letanphuc95@gmail.com", cus4);

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        PrintWriter writer = response.getWriter();
        if (customerMap.containsKey(email)){
            Customer result = customerMap.get(email);
            if(result.getPassword().equals(password)){
                String name=result.getFullName();
                writer.print("Đăng nhập thành công. <br>");
                writer.print("Chào mừng "+name+" đến với chúng tôi.");
            } else
                writer.print("Sai mật khẩu");
        } else writer.print("Sai tài khoản");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
